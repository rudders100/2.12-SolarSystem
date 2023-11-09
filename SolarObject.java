/**
 * Provides functionality to create a Solar Object and draw onto Solar system
 */

public class SolarObject {
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String col;

    /**
     * @param distance the distance from this object to the point about which it is orbiting.
	 * @param angle the angle (in degrees) that represents how far the object is around its orbit.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGE
     */
    public SolarObject(double distance, double angle, double diameter, String col)
    {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }
    
    /** 
     * @param angle set the angel of the solar object that it is drawn around the center
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }
    
    /** 
     * @return get the angle of the solar object
     */
    public double getAngle() {
        return angle;
    }
    
    /** 
     * @param col set the colour of the solar object
     */
    public void setCol(String col) {
        this.col = col;
    }
    
    /** 
     * @return get the colour of the solor object
     */
    public String getCol() {
        return col;
    }
    
    /** 
     * @param diameter set the diameter of the solar object
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    /** 
     * @return get the diameter of the solar object
     */
    public double getDiameter() {
        return diameter;
    }
    
    /** 
     * @param distance set the distance of the solar object
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    /** 
     * @return get the distance of the solar object
     */
    public double getDistance() {
        return distance;
    }
    
    /** 
     * @param solar draw the solar object onto a solar system
     */
    public void draw(SolarSystem solar)
    {
        solar.drawSolarObject(distance, angle, diameter,col);
    }
}
