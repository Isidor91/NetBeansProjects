package sabloni;
public class Kupa extends Telo
{
    private double r,h;

    public Kupa(double r, double h)
    {
        this.r = r;
        this.h = h;
    }
    
    @Override
    public double zapremina() 
    {
       return Math.PI*r*r*h/3;
    }
    @Override
    public String toString() {
        return "Kupa{" + "r=" + r + ", h=" + h + " " + zapremina() + '}';
    }
    
    
}
