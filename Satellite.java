public class Satellite extends OrbitingObject{

    public Satellite(double distance, double angle, double diameter, String col, double speed)
    {
        super(distance, angle, diameter, col,speed);    
    }
    public void drawSatellite(SolarSystem solar, double centreOfRotationDistance, double centreOfRotationAngle){
        solar.drawSolarObjectAbout(distance,angle,diameter,col,centreOfRotationDistance, centreOfRotationAngle);
        //angle = angle < 360 ? angle += 1 : 0;
        centreOfRotationAngle = centreOfRotationAngle < 360 ? centreOfRotationAngle +=speed : 0;
    }

}

