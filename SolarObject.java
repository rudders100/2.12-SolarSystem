public class SolarObject {
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String col;

    public SolarObject(double distance, double angle, double diameter, String col)
    {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
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
    public void draw(SolarSystem solar)
    {
        solar.drawSolarObject(distance, angle, diameter,col);
    }
}
