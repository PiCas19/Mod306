package Frame;

import Shapes.CutPolygon;
import Shapes.SnowflakeTriangle;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import org.apache.batik.svggen.SVGGraphics2DIOException;


/**
 * La classe SnowflakePanel è il panel princiaple dell'applucazione.
 * @author Pierpaolo Casati
 * @version 03.12.2019
 */
public class SnowflakePanel extends javax.swing.JPanel  implements MouseListener, MouseMotionListener{
    
    /**
     * WIDTH, larghezza della buffered image, default 1200 pixel.
     */
    public static final int WIDTH = 1200;
    
    /**
     * HEIGHT, altezza della buffered image, default 1600 pixel.
     */
    public static final int HEIGHT = 1600;
    
    /**
     * RADIUS, raggio di un punto di taglio, default 10 pixel.
     */
    public static final int RADIUS = 20;
    
    
    /**
     * Buffered image dello SnowflakeTriangle.
     */
    private BufferedImage img;
    
      
    /**
     * Contesto grafico 2d.
     */
    private Graphics2D g2;
    
   
    /**
     * SnowflakeTriangle.
     */
    private SnowflakeTriangle snowflakeTriangle = null;
    
    /**
     * Poligoni di taglio.
     */
    private CutPolygon cutPolygon = null;
    
    
    /**
     * Coordinate x dello SnowflakeTriangle.
     */
    private int[] x = {0,0,0};
    
    /**
     * Coordinate y dello SnowflakeTriangle.
     */
    private int[] y = {0,0,0};
    
    /**
     * Lista dei punti di taglio.
     */
    private List<Point> cutPoints = new ArrayList<Point>();
    
    /**
     * Lista di poligoni di taglio.
     */
    private List<Polygon> polygons = new ArrayList<Polygon>();
    
    /**
     * Copia della lista di poligoni di taglio.
     */
    private List<Polygon> clonePolygons = new   ArrayList<Polygon>();
    
    /**
     * Area dello SnowflakeTriangle.
     */
    private Area areaTriangle = null;
    
    /**
     * Permette di dire quando tagliare il fiocco.
     */
    private boolean cut = false;
    
    /**
     * Snowflaketriangle shapes.
     */
    private Polygon triangle = null;
    
    /**
     * Dimensione immagine png o svg.
     */
    private Dimension size = new Dimension(500, 500);
    
    /**
     * Colore fiocco di neve.
     */
    private Color flake = Color.WHITE;
    
    /**
     * Setter lista di poligoni di taglio.
     * @param polygons Lista poligoni di taglio.
     */
    public void setPolygons(List<Polygon> polygons){
        this.polygons = polygons;
    }
    
    /**
     * Setter dimensione immagine.
     * @param size Dimensione immagine
     */
    @Override
    public void setSize(Dimension size){
        this.size = size;
    }
    
    /**
     * Getter flag cut.
     * @return Stato del cut (tagliato il fiocco = true).
     */
    public boolean getCut(){
        return this.cut;
    }
    
  
    
    /**
     * Permette di istanziare un SnowflakePanel.
     */
    public SnowflakePanel() {
        initComponents();
        this.setBackground(new Color(83,81,81));
        img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        g2 = (Graphics2D) img.getGraphics();
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.snowflakeTriangle = new SnowflakeTriangle(WIDTH, HEIGHT);
        this.snowflakeTriangle.setCoordinates();
        this.x = this.snowflakeTriangle.getX();
        this.y = this.snowflakeTriangle.getY();
        this.cutPolygon = new CutPolygon(this.cutPoints);
        this.triangle = new Polygon(this.x, this.y, 3);
        this.areaTriangle = new Area(triangle);
        this.livePanel.setTriangle(areaTriangle);
        this.livePanel.setX(this.x[2]);
        this.livePanel.setY(this.y[2]);
    }
    
    
    /**
     * Permette di disegnare sullo SnowflakePanel.
     * @param g Contesto grafico.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.draw();
        
        Dimension scale = this.getScaledDimension();

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(
                this.resized(scale), 
                (int) (this.getWidth() - scale.getWidth()) / 2,
                (int) (this.getHeight() - scale.getHeight()) / 2, 
            null
        ); 
        
        
    }
    
   
    
    /**
     * Permette di disegnare lo stato dello SnowflakePanel.
     */
    private void draw() {
        //Rettangolo nel quale è insritto il triangolo snowflake.
        g2.setColor(new Color(26, 26,26));
        g2.fillRect(0, 0, WIDTH, HEIGHT); 
        
        //SnowflakeTriangle
        g2.setColor(this.flake);  
        g2.fill(this.areaTriangle);
        this.cutPolygon.drawCutPolygon(g2, polygons, new Color(255, 0, 0, 100));
          
        //Disegno i punti di taglio sulla finestra.
        g2.setColor(new Color(160,160,160));
        for (int i = 0; i < this.cutPoints.size(); i++) {
            Point p = this.cutPoints.get(i);
            g2.fillOval(p.x - RADIUS, p.y - RADIUS, RADIUS * 2, RADIUS * 2);
        }
       
      
        
        //connetto i vari punti
        this.cutPolygon = new CutPolygon(this.cutPoints);
        
        this.cutPolygon.connectPointsPolygon(g2);
        
      
    }
    
    
    /**
     * Permette di ridimensionare la buffered image.
     * @param scale Scala di ridimensionamento.
     * @return Buffered image ridimensionata.
     */
    private BufferedImage resized(Dimension scale) {
        Image tmp = img.getScaledInstance((int) scale.getWidth(), (int) scale.getHeight(), Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage((int) scale.getWidth(), (int) scale.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }
    
    
    /**
     * Permette di ridimensionare lo SnowflakePanel.
     * @return Ridimensionamento dello SnowflakePanel.
     */
    private Dimension getScaledDimension() {
        
        //altezza e altezza originale
        int original_width = WIDTH;
        int original_height = HEIGHT;
        
        //altezza e larghezza dello SnowflakePanel
        int bound_width = this.getWidth();
        int bound_height = this.getHeight();
        
        //nuove altezze e altezze 
        int new_width = original_width;
        int new_height = original_height;

       
        if (original_width > bound_width) {
            new_width = bound_width;
            new_height = (new_width * original_height) / original_width;
        }

        if (new_height > bound_height) {
            new_height = bound_height;
            new_width = (new_height * original_width) / original_height;
        }

        return new Dimension(new_width, new_height);
    }
    
    
    
    
    /**
     * Permette controllare se i punti si trovano nella'area di taglio.
     * @param p punto di taglio.
     */
    public void addPoint(Point p) {
        Dimension scale = this.getScaledDimension();
        // i punti sono salvati in coordinate dell'immagine
        p.x -= (int) (this.getWidth() - scale.getWidth()) / 2;
        p.y -= (int) (this.getHeight() - scale.getHeight()) / 2;
        p.x *= (WIDTH / scale.getWidth());
        p.y *= (HEIGHT / scale.getHeight());
        if (p.x < 0 || p.y < 10 || p.x > WIDTH  ||
                p.y > HEIGHT - 10) {
            return;
        }
        this.cutPoints.add(p);
    }
    
    /**
     * Permette di creare un nuovo poligono di taglio.
     */
    public void newPolygon(){
        if(this.cutPoints.size() > 2){
            Polygon tmpPolygon = this.cutPolygon.createCutPolygon();
            this.polygons.add(tmpPolygon);
            this.cutPoints.clear();
        }
        repaint();
    }
    
    /**
     * Permette di resettare tutti i punti e i poligono di taglio.
     */
    public void reset(){
        if(this.cutPoints.size() > 0 || this.polygons.size() > 0){
            this.cutPoints.clear();
            this.polygons.clear();
        }
        repaint();
    }
    
    /**
     * Permette di tagliare lo SnowflakeTriangle.
     */
    public void cut(){
        if( this.polygons.size() > 0){
            this.cut = true;
            for(int i = 0; i < polygons.size(); i++){
                this.clonePolygons.add(this.polygons.get(i));
                Area areaPolygon = new Area(polygons.get(i));
                this.areaTriangle.subtract(areaPolygon);
            }
            this.polygons.clear();
        }
        repaint();
    }
    
    
    /**
     * Permette di scrivere in un file csv i poligoni di taglio.
     * @param directory Directory template (directory nel qule ci sono i file csv).
     * @throws IOException 
     */
    public void createCSV(File directory) throws IOException{
       
        
        
        File fileName = new File(
                        directory.toPath().toAbsolutePath().toString() +"/template_ " + new Date().toString() +".csv"
        );
        
        
     


        List<List<String>> rows = new ArrayList<>();
        for(Polygon p : this.clonePolygons){
            rows.add(
                    Arrays.asList(
                            String.valueOf(p.npoints),
                            Arrays.toString(p.xpoints),
                            Arrays.toString(p.ypoints)
                    )
            );

        }


        FileWriter csvWriter = new FileWriter(fileName);



        for (List<String> rowData : rows) {
            csvWriter.append(String.join("; ", rowData));
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();

        fileName.setReadOnly();
        fileName.setWritable(false);
        JOptionPane.showMessageDialog(
                null, "Save cut polygons");
    }
    
    
    /**
     * Permette di salvare i vari punti di taglio che formano i poligoni.
     */
    public void savePoint() throws IOException{
        if(this.cut == true && !this.clonePolygons.isEmpty()){
            
            File directory = new File("Snowflake template");
            if (!directory.exists()) {
                if (directory.mkdir()) {
                   this.createCSV(directory);
                   this.clonePolygons.clear();
                } 
            }
            else{
                this.createCSV(directory);
                this.clonePolygons.clear();
            }
        }
    }
    
    /**
     * Permette di creare un immagine png del fioco di neve.
     * @param file Nome del file.
     * @param width Dimensioni file.
     * @throws IOException 
     */
    public void createPng(String file) throws IOException{
        BufferedImage png = new BufferedImage(
                this.size.width, 
                this.size.height, 
                BufferedImage.TYPE_INT_ARGB
        );
        Graphics2D g2d = png.createGraphics();
        g2d.setColor(this.flake);
        for(int i = 0; i < 6; i++){
            AffineTransform tr2 = new AffineTransform();
            tr2.scale(0.15, 0.15);
            tr2.translate(this.x[2]/1.3, 0);
            tr2.rotate(Math.toRadians(60) * i, this.x[2], this.y[2]);
            g2d.setTransform(tr2);
            g2d.fill(this.areaTriangle);
        }
        
        for(int i = 0; i < 6; i++){
            AffineTransform tr2 = new AffineTransform();
            tr2.scale(-0.15, 0.15);
            tr2.translate((-this.x[2] * 2) - this.x[2]/1.3 , 0);
            tr2.rotate(Math.toRadians(60) * i, this.x[2], this.y[2]);
            g2d.setTransform(tr2);
            g2d.fill(this.areaTriangle);
        }
        
        ImageIO.write(png, "PNG", new File(file + ".png"));
    }
    
    /**
     * Permette di creare un immagine SVG.
     * @param file Percorso file.
     * @throws SVGGraphics2DIOException 
     */
    public void createSvg(String file) throws SVGGraphics2DIOException{
        this.livePanel.createSVG(file);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        livePanel = new Frame.LivePanel();

        setBackground(new java.awt.Color(83, 81, 81));
        setLayout(new java.awt.BorderLayout());

        livePanel.setPreferredSize(new java.awt.Dimension(230, 337));

        javax.swing.GroupLayout livePanelLayout = new javax.swing.GroupLayout(livePanel);
        livePanel.setLayout(livePanelLayout);
        livePanelLayout.setHorizontalGroup(
            livePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        livePanelLayout.setVerticalGroup(
            livePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        add(livePanel, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents
        
    /**
     * Quando si sta cliccando il mouse.
     * @param e Evento del mouse.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        if(this.cut == false && e.getButton() == e.BUTTON1){
            this.addPoint(e.getPoint());
        }
        
        repaint();   
    }
    
    /**
     * Quando si sta premendo il mouse.
     * @param e Evento drl mouse.
     */
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    
    /**
     * Quando si sta rilasciando il mouse. 
     * @param e Evento del mouse.
     */
    @Override
    public void mouseReleased(MouseEvent e) {
      
    }
    
    /**
     * Quando si entrando con il mouse nel frame.
     * @param e Evento del mouse.
     */
    @Override
    public void mouseEntered(MouseEvent e) {
       
    }
    
    /**
     * Quando si uscendo con il mouse dal frame.
     * @param e Evento del mouse.
     */
    @Override
    public void mouseExited(MouseEvent e) {
      
    }
    
    /**
     * Quando si sta trascinando qualcosa con il mouse.
     * @param e Evento del mouse.
     */
    @Override
    public void mouseDragged(MouseEvent e) {
      
    }
    
    /**
     * Quando si sta muovendo il mouse.
     * @param e Evento del mouse.
     */
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println(e.getPoint());
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frame.LivePanel livePanel;
    // End of variables declaration//GEN-END:variables
}
