
package Shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.util.List;

/**
 * La classe CutPolygon è il modello astratto di un poligono di taglio.
 * @author Pierpaolo Casati
 * @version 04.12.2019
 */
public class CutPolygon {
    
    /**
     * Lista punti di taglio.
     */
    private List<Point> cutPoints = null;
    
    /**
     * Numero di poligoni di taglio.
     */
    private int numCutPolygon = 1;
    
    /**
     * Permette di istanziare un poligono di taglio.
     * @param cutPoints Lista punti di taglio.
     */
    public CutPolygon(List<Point> cutPoints){
        this.cutPoints = cutPoints;
    }
    
    /**
     * Petrmette di connetere i vari punti di taglio.
     * @param g2 Contesto garfico 2D.
     */
    public void connectPointsPolygon(Graphics2D g2){
        
        if(this.cutPoints.size() > 1) {
            for(int j = this.numCutPolygon;  j < this.cutPoints.size(); j++){
                Point now = this.cutPoints.get(j);
                
                Point old = this.cutPoints.get(j-1);
                
                g2.setColor(new Color(112,128,144));
                
                g2.drawLine(old.x,old.y, now.x, now.y);
                
                this.numCutPolygon++;
            }
        }    
    }
    
    /**
     * Permette di creare un poligono di taglio.
     * @return Un poligono di taglio.
     */
    public Polygon createCutPolygon(){
        Polygon cutPolygon = new Polygon(); 
        for(int i = 0; i < this.cutPoints.size(); i++){
             Point p = this.cutPoints.get(i);
             cutPolygon.addPoint(p.x, p.y);
        }
        return cutPolygon;
    }
    
    /**
     * Permette di disegnare i poligoni di taglio.
     * @param g2 Contesto grafico 2D
     * @param polygons Lista di poligoni.
     * @param color Colore del poligono di taglio.
     */
    public void drawCutPolygon(Graphics2D g2, List<Polygon> polygons, Color color){
        g2.setColor(color);
        for(int i = 0; i < polygons.size(); i++){
            g2.fillPolygon(polygons.get(i));
        }
    }
    
    
    
    
}
