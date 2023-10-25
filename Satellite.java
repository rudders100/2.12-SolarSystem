/*
 * Provides functionaliy to add a Satellite to the solar system
 */
public class Satellite extends OrbitingObject{
     /*
     * Constructer inherits values from OrbitingObject
     * @param distance the distance from this object to the point about which it is orbiting.
	 * @param angle the angle (in degrees) that represents how far the object is around its orbit.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW</p>
     */
    public Satellite(double distance, double angle, double diameter, String col, double speed)
    {
        super(distance, angle, diameter, col,speed);    
    }
    /*
     * Draws a satellite that orbits around the center and a another given point (eg. Planet)
     * @param solar and instance of the Solar System class the satellite is to be drawn on
	 * @param centreOfRotationDistance the distance part of the polar co-ordinate about which this object orbits.
	 * @param centreOfRotationAngle the angular part of the polar co-ordinate about which this object orbits.
     */
    public void drawSatellite(SolarSystem solar, double centreOfRotationDistance, double centreOfRotationAngle){
        solar.drawSolarObjectAbout(distance,angle,diameter,col,centreOfRotationDistance, centreOfRotationAngle);
        //angle = angle < 360 ? angle += 1 : 0;
        centreOfRotationAngle = centreOfRotationAngle < 360 ? centreOfRotationAngle +=speed : 0;
    }

}

