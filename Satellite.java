public class Satellite extends Planet{
    private double centreOfRotationDistance;
    private double centreOfRotationAngle; 

    public Satellite(double diameter,double distance, double angle,  String col, double centreOfRotationDistance, double centreOfRotationAngle)
    {
        super(diameter,distance, angle, col);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
    }
    public void drawAbout(SolarSystem solar, double pAngle){
        solar.drawSolarObjectAbout(getDistance(),pAngle,getDiameter(),getCol(),centreOfRotationDistance,centreOfRotationAngle);
        //angle = angle < 360 ? angle += 1 : 0;
        centreOfRotationAngle = centreOfRotationAngle < 360 ? centreOfRotationAngle +=3 : 0;
    }
    public void setCentreOfRotationAngle(double centreOfRotationAngle) {
        this.centreOfRotationAngle = centreOfRotationAngle;
    }
    public double getCentreOfRotationAngle() {
        return centreOfRotationAngle;
    }
    public void setCentreOfRotationDistance(double centreOfRotationDistance) {
        this.centreOfRotationDistance = centreOfRotationDistance;
    }
    public double getCentreOfRotationDistance() {
        return centreOfRotationDistance;
    }   
}
