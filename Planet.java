public class Planet extends Sun{
    private double distance;
    private double angle;
    //private double diameter;
    private String col;

    public Planet(double diameter,double distance, double angle, String col)
    {
        super(diameter);
        this.distance = distance;
        this.angle = angle;
        this.col = col;
    }
    public void draw(SolarSystem solar, double speed){
        solar.drawSolarObject(distance,angle,getDiameter(),col);
        angle = angle < 360 ? angle += speed : 0;
    }
    public double getAngle() {
        return angle;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }
    public void setCol(String col) {
        this.col = col;
    }
    public String getCol() {
        return col;
    }
    public void setDistance(double distance)
    {
        this.distance = distance;
    }
    public double getDistance()
    {
        return distance;
    }
}