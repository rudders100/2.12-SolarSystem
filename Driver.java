/*
*  The main class that instialises the solar system.      
*/
public class Driver {
    public static void main(String[] args)
    {
        SolarSystem solar = new SolarSystem(1920, 1080);
        SolarObject sun = new SolarObject(0, 0, 80, "YELLOW");
        Planet mercury = new Planet(50, 0, 30, "GRAY", 0.5);
        Planet venus = new Planet(75, 0 , 30, "BROWN", 0);
        Planet earth = new Planet(100, 0, 30, "BLUE", 1);
        Satellite moon = new Satellite(40, 0, 10, "WHITE", 0);
        Planet mars = new Planet(150, 0, 30, "RED", 0);
        Planet jupiter = new Planet(200, 0, 30, "BROWN", 0);
        Planet saturn = new Planet(350, 0, 250, "LIGHTGREY", 0);
        Planet uranus = new Planet(300, 0, 30, "CYAN", 0);
        Planet neptune = new Planet(350, 0, 30, "BLUE", 0);
        Planet [] asteroidBelt = new Planet[500];
        for(int i = 0; i < 500; i++)
            {
                int asteroidAngel = (int) (Math.random() * 360) + 1;
                int asteroidDistance = (int) (Math.random() * (jupiter.getDistance() - mars.getDistance()) + mars.getDistance());
                asteroidBelt[i] = new Planet(asteroidDistance, asteroidAngel, 2, "WHITE", 1);
            }
        while(true)
        {
            sun.draw(solar);
            mercury.drawPlanet(solar);
            venus.drawPlanet(solar);
            earth.drawPlanet(solar);
            moon.drawSatellite(solar, earth.getDistance(), earth.getAngle());
            mars.drawPlanet(solar);
            jupiter.drawPlanet(solar);
            saturn.drawPlanet(solar);
            uranus.drawPlanet(solar);
            neptune.drawPlanet(solar);
            for(int i = 0; i< 500; i++)
            {
                asteroidBelt[i].drawPlanet(solar);
            }
            solar.finishedDrawing();
        }

    }
}

