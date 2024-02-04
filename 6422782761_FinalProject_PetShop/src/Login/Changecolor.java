package Login;

import java.awt.*;
import javax.swing.JRadioButton;

public class Changecolor extends JRadioButton{

    

        protected Changecolor(String title,int size,int x,int y,int width,int height) {
            super(title);
            Font myfont = new Font("SanSerif", Font.ITALIC,size);
            this.setFont(myfont);
            this.setBounds(x, y, width, height);
        }
}