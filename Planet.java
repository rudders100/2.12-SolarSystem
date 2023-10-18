public class Planet extends OrbitingObject{
    
    public Planet(double distance, double angle, double diameter, String col, double speed)
    {
        super(distance, angle, diameter,col,speed);
    }
    public void drawPlanet(SolarSystem solar)
    {
        solar.drawSolarObject(distance, angle, diameter,col);
        angle = angle < 360 ? angle += speed : 0;
    }
}
