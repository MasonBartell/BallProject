import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLOutput;

// Creating my own Panel class that inherits from JPanel
public class AnimateFrame extends JPanel
{
    int x = 80;// variable to control the x
    int xspeed = 5; // variable to control how far to move each time
    int y = 95;
    int yspeed = 5;
    public AnimateFrame()
    {
        setBackground(Color.BLUE);
        Ball ball1 = new Ball();
        this.setFocusable(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int blah = e.getKeyCode();
                if(blah == 68);
                int blah2 = e.getKeyCode();
                if(blah2 == )
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    // overriding the paintComponent method inherited
    // this method automatically gets called by JVM
    // Graphics class is in java.awt package
    protected void paintComponent(Graphics g)
    {

        super.paintComponent(g);



        x+=xspeed;
        y+=yspeed;
        // If the ball hits the right edge change what we add each time
        if(x >= getHeight()-10 || x <= 10){
            xspeed *= -1;
        }
        if(y >= getHeight()-10 || y <= 10){
            yspeed *= -1;
        }

        // pause the program
        try
        {
            Thread.sleep(34);

        }
        catch(Exception blah)
        {
            System.out.println(blah.toString());
        }
        repaint();
    }


}