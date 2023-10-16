public class Sun {
    private double diameter;

    public Sun(double diameter) 
    {
        this.diameter = diameter;  
    }

    public void draw(SolarSystem solar){
        solar.drawSolarObject(0, 0, getDiameter(), "YELLOW");
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getDiameter() {
        return diameter;
    }
    
}
