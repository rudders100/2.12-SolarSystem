public class Sun {
    private double diameter;

    public Sun(double sDiameter, SolarSystem solar)
    {
        this.diameter = sDiameter;
        solar.drawSolarObject(0, 0, sDiameter, "YELLOW");
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getDiameter() {
        return diameter;
    }
    
}
