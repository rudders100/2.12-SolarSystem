/**
*  The main class that instialises and populates the solar system.      
*/
public class Driver {
    public static void main(String[] args)
    {
        SolarSystem solar = new SolarSystem(1920, 1080);
        SolarObject sun = new SolarObject(0, 0, 80, "YELLOW");
        OrbitingObject mercury = new Planet(50, 0, 30, "GRAY", 0.5);
        OrbitingObject venus = new Planet(75, 0 , 30, "BROWN", 0);
        OrbitingObject earth = new Planet(100, 0, 30, "BLUE", 1);
        Satellite moon = new Satellite(40, 0, 10, "WHITE", 2);
        OrbitingObject mars = new Planet(150, 0, 30, "RED", 2.2);
        OrbitingObject jupiter = new Planet(250, 0, 30, "BROWN", 2.5);
        OrbitingObject saturn = new Planet(350, 0, 40, "LIGHTGREY", 2.7);
        OrbitingObject uranus = new Planet(400, 0, 30, "CYAN", 3);
        OrbitingObject neptune = new Planet(450, 0, 30, "BLUE", 3.1);
        OrbitingObject [] asteroidBelt = new Planet[500];
        for(int i = 0; i < 500; i++)
            {
                int asteroidAngel = (int) (Math.random() * 360) + 1;
                int asteroidDistance = (int) (Math.random() * ((jupiter.getDistance() - jupiter.getDiameter()) - mars.getDistance() - mars.getDiameter()) + (mars.getDistance() + mars.getDiameter()));
                asteroidBelt[i] = new Planet(asteroidDistance, asteroidAngel, 2, "WHITE", 1);
            }
        while(true)
        {
            sun.draw(solar);
            mercury.draw(solar);
            venus.draw(solar);
            earth.draw(solar);
            moon.draw(solar, earth.getDistance(), earth.getAngle());
            mars.draw(solar);
            jupiter.draw(solar);
            saturn.draw(solar);
            uranus.draw(solar);
            neptune.draw(solar);
            for(int i = 0; i< 500; i++)
            {
                asteroidBelt[i].draw(solar);
            }
            solar.finishedDrawing();
        }

    }
}

