package gui4;
import javax.swing.ImageIcon;
// 0 - stena
// 1 - lopta
// 2 - zver
public class Blok
{
public int x,y,vrsta;
public ImageIcon slika;
public Blok(int x, int y,int vrsta,String naziv) {
this.x = x;
this.y = y;
this.vrsta = vrsta;
slika = new ImageIcon(naziv);
}
}