/**
 * Provides functionalality too add a planet to the solar system
 */

public class Planet extends OrbitingObject{
    /**
     * Constructer inherits values from OrbitingObject
     * @param distance the distance from this object to the point about which it is orbiting.
	 * @param angle the angle (in degrees) that represents how far the object is around its orbit.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW</p>
     */
    public Planet(double distance, double angle, double diameter, String col, double speed)
    {
        super(distance, angle, diameter,col,speed);
    }
    
    /** 
     * Draws the planet onto an intialised solar system that orbits around the center
     * @param solar an instance of the Solar System class the Planet is to be drawn on
     */
    public void draw(SolarSystem solar)
    {
        solar.drawSolarObject(distance, angle, diameter,col);
        angle = angle < 360 ? angle += speed : 0;
    }
}
