import java.awt.*;
public class Ball {


        private int x,y,xAdd,yAdd,radius, diameter;
        private Color col;

        public Ball()
        {
            x = (int)(Math.random()*380 + 2);
            y = (int)(Math.random()*380 + 2);
            radius = (int)(Math.random()*41+10);
            diameter = 2 * radius;
            col = Color.RED;
            xAdd = 1;
        }

        public void bounce()
        {
            if(x == 400 - diameter)
            {
                xAdd = xAdd*(-1);
            }

        }

        public void moveright()
        {
            x++;
        }
        public void moveleft()
        {
            x--;
        }
        public void moveup()
        {
            y++;
        }
        public void movedown()
        {
            y--;
        }
    }
