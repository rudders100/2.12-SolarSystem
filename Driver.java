public class Driver {
    public static void main(String[] args)
    {
        SolarSystem solar = new SolarSystem(1920, 1080);
        SolarObject sun = new SolarObject(0, 0, 80, "YELLOW");
        Planet2 earth = new Planet2(100, 0, 30, "BLUE", 1);
        
        while(true)
        {
            sun.draw(solar);
            earth.drawPlanet(solar);
            solar.finishedDrawing();
        }

    }
}

