package gui4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
    public class DirectionPanel extends JPanel
    {
        private final int WIDTH = 800, HEIGHT = 500;
        private final int JUMP = 10; // increment for image movement
        private final int IMAGE_SIZE = 31;
        int SLEEP  = 500; 
        private ImageIcon up, down, right, left, currentImage;
        private Blok blokovi[];
        private int x, y, n = 8 , brojac;
        private boolean result,pravac;
        private Nit nit;
    public DirectionPanel()
    {

        this.addKeyListener(new DirectionListener());
            //pocetna pozicija pakmena 
            x = WIDTH / 2;
            y = HEIGHT / 9;
     
            up = new ImageIcon ("arrowUp.gif");
            down = new ImageIcon ("arrowDown.gif");
            left = new ImageIcon ("arrowLeft.gif");
            right = new ImageIcon ("arrowRight.gif");
            blokovi = new Blok[n*n+1];
        
            crtajLavirint();   
                    
                    currentImage = right;

            setBackground (Color.black);
            setPreferredSize (new Dimension(WIDTH, HEIGHT));
            setFocusable(true);
            
            nit = new Nit(this);
        
}
    //ovo je metoda koja kreira niz objekata - ucesnika
    private void crtajLavirint()
    {
        for(int i=0;i<blokovi.length;i++)
            blokovi[i] = new Blok(WIDTH / 4+IMAGE_SIZE*(i%n),
                    HEIGHT / 4+(i/n)*IMAGE_SIZE,(i%2==1 || i/n==n/2) ?1:0,(i%2==1 || i/n==n/2)? "ball.gif":"stena.gif");  
        blokovi[n*n] = new Blok(WIDTH/4+(n/2)*IMAGE_SIZE,HEIGHT/4+(n/2)*IMAGE_SIZE , 2 , "hunter.gif");
    }
    
    public void pokreni()
    {
        if(blokovi[n*n].x==WIDTH/4 || blokovi[n*n].x==WIDTH/4 + (n-1) * IMAGE_SIZE )
            pravac = !pravac;
        
        if(pravac) blokovi[n*n].x+=IMAGE_SIZE;  
        
        else  blokovi[n*n].x-=IMAGE_SIZE;
            brojac++;
                repaint();
    }
    
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
        if(currentImage!=null) currentImage.paintIcon (this, page, x, y);
        
        if(blokovi[n*n].slika!=null)
            blokovi[n*n].slika.paintIcon(this, page, blokovi[n*n].x,blokovi[n*n].y);
       
        for(int i=0;i<blokovi.length;i++)
        {
            if(blokovi[i].slika!=null)
                blokovi[i].slika.paintIcon(this, page,blokovi[i].x,
                 blokovi[i].y);
        }
        
        for(int i = 0 ; i < blokovi.length ; i++)
        {
            repaint();
        }
        
    }
    
    private class DirectionListener implements KeyListener
    {
    @Override
    public void keyPressed(KeyEvent event)
    {
        switch (event.getKeyCode())
        {
            case KeyEvent.VK_UP:
                for(int i=0;i<blokovi.length;i++)
                    if(proveriGore(blokovi[i].x,blokovi[i].y))
                        if(blokovi[i].vrsta==1) blokovi[i].slika=null; 
                            else if (blokovi[i].vrsta==2) currentImage = null ;
                else return;
            break;
        
            case KeyEvent.VK_LEFT:                       
                for(int i=0;i<blokovi.length;i++)
                    if(proveriLevo(blokovi[i].x,blokovi[i].y))
                        if(blokovi[i].vrsta==1) blokovi[i].slika=null; 
                            else if (blokovi[i].vrsta==2) currentImage = null ;
                        
                else return;
            break;
        
            case KeyEvent.VK_DOWN:                      
                for(int i=0;i<blokovi.length;i++)
                    if(proveriDole(blokovi[i].x,blokovi[i].y))
                        if(blokovi[i].vrsta==1) blokovi[i].slika=null; 
                            else if (blokovi[i].vrsta==2) currentImage = null ;
                    else return;
            break;
        
            case KeyEvent.VK_RIGHT:                       
                for(int i=0;i<blokovi.length;i++)
                    if(proveriDesno(blokovi[i].x,blokovi[i].y))
                        if(blokovi[i].vrsta==1) blokovi[i].slika=null; 
                            else if (blokovi[i].vrsta==2) currentImage = null ;
                    else return;
            break;

    }
        if(currentImage != null)
        switch (event.getKeyCode())
        {
            case KeyEvent.VK_UP:
                currentImage = up;
                y -= JUMP;
            break;
            case KeyEvent.VK_DOWN:
                currentImage = down;
                y += JUMP;
            break;
            case KeyEvent.VK_LEFT:
                currentImage = left;
                x -= JUMP;
            break;
            case KeyEvent.VK_RIGHT:
                currentImage = right;
                x += JUMP;
            break;
        }
            repaint();
            provera();
    }
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    
    }   
    
    private boolean proveriLevo(int xl,int yl)
    {
        return (xl<x && x<xl+IMAGE_SIZE) &&
            (yl<y+IMAGE_SIZE/2 && y+IMAGE_SIZE/2<yl+IMAGE_SIZE);
    }
    
    private boolean proveriDesno(int xl,int yl)
    {
        return (xl<x+IMAGE_SIZE && x+IMAGE_SIZE<xl+IMAGE_SIZE) &&
            (yl<y+IMAGE_SIZE/2 && y+IMAGE_SIZE/2<yl+IMAGE_SIZE);
    }
    
    private boolean proveriGore(int xl,int yl)
    {
        return (xl<x+IMAGE_SIZE/2 && x+IMAGE_SIZE/2<xl+IMAGE_SIZE) &&
            (yl<y && y<yl+IMAGE_SIZE);
    }
    
    private boolean proveriDole(int xl,int yl)
    {
        return (xl<x+IMAGE_SIZE/2 && x+IMAGE_SIZE/2<xl+IMAGE_SIZE) &&
            (yl<y+IMAGE_SIZE && y+IMAGE_SIZE<yl+IMAGE_SIZE);
    }
    
    public void provera()
    {
        result = true;
        if(currentImage == null)
        {
            JOptionPane.showMessageDialog(null, "Game Over");
            setVisible(false);
            System.exit(0);
        }   
        
        for(int i=0;i<blokovi.length;i++)   
            if(blokovi[i].vrsta == 1 && blokovi[i].slika!=null) 
            {
                result = false;
                break;
            }
        if(result)            
        { // ovde ide da li su sve slicice null
            JOptionPane.showMessageDialog (null, "Pojeli ste sve objekte ");
            int again = JOptionPane.showConfirmDialog(null, "Ponovo?");
            
        if(again == JOptionPane.YES_OPTION){crtajLavirint(); repaint();}
  
        else
        {
            setVisible(false);
            System.exit(0);
        }
        }
   
}   
}