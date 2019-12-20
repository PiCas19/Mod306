
package Shapes;

/**
 * La classe SnowflakeTriangle è il triangolo originale dell'applicazione.
 * @author Pierpaolo Casati
 * @version 03.12.2019
 */
public class SnowflakeTriangle {
    
    /**
     * Larghezza dello SnowflakePanel.
     */
    private int width = 0;
    
    /**
     * Altezza dello SnowflakePanel.
     */
    private int height = 0;
    
    /**
     * Coordinate x dello SnowflakeTriangle.
     */
    private int[] x = {0,0,0};
    
    /**
     * Coordinate y dello SnowflakeTriangle.
     */
    private int[] y = {0,0,0};
    
    
    /**
     * Getter delle coordinate x dello SnowflakeTriangle.
     * @return Coordinate x dello SnowflakeTriangle.
     */
    public int[] getX(){
        return this.x;
    }
    
    /**
     * Getter delle coordinate y dello SnowflakeTriangle.
     * @return Coordinate y dello SnowflakeTriangle.
     */
    public int[] getY(){
        return this.y;
    }
    
    /**
     * Permette di istanziare uno SnowflakeTriangle.
     * @param width Larghezza dello SnowflakePanel.
     * @param height Altezza dello SnowflakePanel.
     */
    public SnowflakeTriangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    
    /**
     * Permette di impostare le coordinate del triangolo.
     */
    public void setCoordinates(){
        this.x[0] = this.width * 20 / 100;
        this.y[0] = this.height * 10 / 100;
        this.x[1] = this.width * 80 / 100;
        this.y[1] = this.height * 10 / 100;
        
        
        double a = Math.pow(this.x[1] - this.x[0], 2);
        double b =  Math.pow(this.y[1] - this.y[0], 2);
        
        double d = Math.sqrt(a + b);
        
        double angle = Math.acos((x[1] - this.x[0]) / d);
        
        this.x[2] = (int) ((2 * d) * Math.cos(Math.PI / 3 + angle) + this.x[0]);
        this.y[2] = (int) ((2 * d) * Math.sin(Math.PI / 3 + angle) + this.y[0]); 
    }
    
}
