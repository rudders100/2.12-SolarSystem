/**
 * Provides fucntionality for an object in the solar system to have speed
 */
public abstract class OrbitingObject extends SolarObject{
    protected double speed;
    /**
     * Constructer inherits values from Solar object
     * @param distance the distance from this object to the point about which it is orbiting.
	 * @param angle the angle (in degrees) that represents how far the object is around its orbit.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGE
     */
    public OrbitingObject(double distance, double angle, double diameter, String col, double speed)
    {
        super(distance,angle,diameter,col);
        this.speed = speed;
    }
    
    /** 
     * @param speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    /** 
     * @return double
     */
    public double getSpeed() {
        return speed;
    }
}
