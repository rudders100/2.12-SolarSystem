public class Driver {
    public static void main(String[] args)
    {
        SolarSystem solar = new SolarSystem(800, 800);
        Sun sun = new Sun(80);
        Planet earth = new Planet(40, 200, 0, "BLUE");
        Satellite moon = new Satellite(10, earth.getDistance() , earth.getAngle(), "WHITE", 50 , 0);
        Planet mars = new Planet(40, 300, 20, "RED");
        while(true)
        {
            sun.draw(solar);
            earth.draw(solar);
            moon.drawAbout(solar, earth.getAngle());
            mars.draw(solar);
            solar.finishedDrawing();
        }
        


    }
}
