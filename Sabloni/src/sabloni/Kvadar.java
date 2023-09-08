package sabloni;
public class Kvadar extends Telo
{
    private double a,b,c;

    public Kvadar(double a, double b, double c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double zapremina() 
    {
       return a*b*c;
    }

    @Override
    public String toString() {
        return "Kvadar{" + "a=" + a + ", b=" + b + ", c=" + c + " " + zapremina() + '}';
    }

}
