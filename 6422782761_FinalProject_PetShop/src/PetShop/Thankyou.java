package PetShop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Thankyou extends JPanel {
	Timer timer = new Timer(500, new TimerListener());
	int x = 145;
	int y = 65;
	int a = 225;
	int b = 65;
	 public void paintComponent(Graphics g){
		 timer.start();
	      super.paintComponent(g);
	      
	      // draw the face
	      g.setColor(Color.YELLOW);
	      g.fillOval(100, 10, 200, 200);
	      
	      // draw the eyes
	      g.setColor(Color.BLACK);
	      g.fillOval(x, y, 30, 30);
	      g.fillOval(a, b, 30, 30);
	      
	      // draw the mouth
	      g.fillOval(140, 110, 120, 60);
	      
	      // "touch up" the mouth into a smile
	      g.setColor(Color.YELLOW);
	      g.fillRect(140, 110, 120, 30);
	      g.fillOval(140, 120, 120, 40);
	      
	      //Thank you 
	      g.setColor(Color.BLACK);
	      g.setFont(new Font("Arial", 1, 15));
	      g.drawString("Thank you for coming to buy pets at our shop", 20, 300);
	      
	   }
	 class TimerListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random random = new Random();
		x = random.nextInt(140, 170);
		a = random.nextInt(210, 240);
		
		repaint();		
	} 
 }
	 
}
