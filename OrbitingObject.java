public class OrbitingObject extends SolarObject{
    protected double speed;

    public OrbitingObject(double distance, double angle, double diameter, String col, double speed)
    {
        super(distance,angle,diameter,col);
        this.speed = speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getSpeed() {
        return speed;
    }
}
