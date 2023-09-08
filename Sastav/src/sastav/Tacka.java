package sastav;
public class Tacka extends Oblik
{
    private int x,y;

    public Tacka(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    protected double povrsina() 
    {
        return 0;
    }

    @Override
    public String toString()
    {
       return "Tacka{" + "x=" + x + " , y= " + y + '}';
    }

    @Override
    public void dodajOblik(Oblik o)
    {
        //nista se ne dodaje
    }
    
}
