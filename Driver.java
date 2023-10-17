public class Driver {
    public static void main(String[] args)
    {
        SolarSystem solar = new SolarSystem(1920, 1080);
        Sun sun = new Sun(80);
        Planet mercury = new Planet(30, 39, 120,"GRAY");
        Planet venus = new Planet(30,72,0,"ORANGE");
        Planet earth = new Planet(30, 100, 0, "BLUE");
        Satellite moon = new Satellite(10, earth.getDistance() , earth.getAngle(), "WHITE", 50 , 0);
        Planet mars = new Planet(30, 152, 20, "RED");
        Planet jupiter = new Planet(30, 520, 0, "BROWN");
        Planet saturn = new Planet(30, 954, 0, "LIGHT_GRAY");
        Planet uranus = new Planet(30, 1920, 0, "CYAN");
        Planet neptune = new Planet(30, 3006, 0, "BLUE");
        while(true)
        {
            sun.draw(solar);
            mercury.draw(solar,1.607);
            earth.draw(solar,1);
            moon.drawAbout(solar, earth.getAngle(),1.362);
            venus.draw(solar, 1.174);
            mars.draw(solar, 0.808);
            jupiter.draw(solar, 0.439);
            saturn.draw(solar, 0.325);
            uranus.draw(solar, 0.228);
            neptune.draw(solar, 0.033);
            solar.finishedDrawing();
        }
        


    }
}
