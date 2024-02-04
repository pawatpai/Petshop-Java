package PetShop;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestThankyou {

	public static void main(String[] args)
	   {     
	      JFrame frame = new JFrame("Good Bye");
			frame.setSize(400, 400);
			frame.setLocationRelativeTo(null); 
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Thankyou ty = new Thankyou();		
			frame.add(ty);
	      
	   }
}
