import javax.swing.*;
import java.awt.*;
public class Main {


        public static void main(String[] args)
        {
            JFrame myFrame = new JFrame();
            myFrame.setSize(500,500);
            AnimateFrame myPanel = new AnimateFrame();
            myFrame.add(myPanel);
            myFrame.setVisible(true);

        }
    }