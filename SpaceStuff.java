public class SpaceStuff {
    private double distance;
    private double angle;
    private double diameter;
    private String col;
    private double centreOfRotationDistance;
    private double centreOfRotationAngle; 


    public SpaceStuff(double distance, double angle, double diameter, String col)
    {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }

    public SpaceStuff(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle)
    {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;

    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    public double getAngle() {
        return angle;
    }
    public void setCol(String col) {
        this.col = col;
    }
    public String getCol() {
        return col;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public double getDistance() {
        return distance;
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

    public void draw(SolarSystem solar){
        solar.drawSolarObject(distance,angle,diameter,col);
        angle = angle < 360 ? angle += 1 : 0;
    }

    public void drawAbout(SolarSystem solar, double pAngle){
        solar.drawSolarObjectAbout(distance,pAngle,diameter,col,centreOfRotationDistance,centreOfRotationAngle);
        //angle = angle < 360 ? angle += 1 : 0;
        centreOfRotationAngle = centreOfRotationAngle < 360 ? centreOfRotationAngle +=3 : 0;
    }
}
