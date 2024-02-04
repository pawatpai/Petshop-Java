package Login;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import PetShop.TestPetShop;
import java.awt.Color;

public class LoginPage extends JFrame implements ActionListener, ItemListener, KeyListener{
	
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	JLabel messageLabel = new JLabel();
	Changecolor cyan = new Changecolor("Cyan",20,20,200,100,20);
	Changecolor pink = new Changecolor("Pink",20,20,220,100,20);
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		userIDField.addKeyListener(this);
		userPasswordField.addKeyListener(this);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);

		cyan.addItemListener(this);
		pink.addItemListener(this);
		
		this.add(cyan);
		this.add(pink);
		this.add(userIDLabel);
		this.add(userPasswordLabel);
		this.add(messageLabel);
		this.add(userIDField);
		this.add(userPasswordField);
		this.add(loginButton);
		this.add(resetButton);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					this.dispose();
					TestPetShop petshop = new TestPetShop();
					TestPetShop.main(null);
					
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong password");
				}

			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("username not found");
			}
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource()==cyan && e.getStateChange() == 1) {
			pink.setSelected(false);
			loginButton.setBackground(Color.CYAN);
			resetButton.setBackground(Color.CYAN);
			userIDField.setBackground(Color.CYAN);
			userPasswordField.setBackground(Color.CYAN);
		}
		
		if (e.getSource()==pink && e.getStateChange() == 1) {
			cyan.setSelected(false);
			loginButton.setBackground(Color.PINK);
			resetButton.setBackground(Color.PINK);
			userIDField.setBackground(Color.PINK);
			userPasswordField.setBackground(Color.PINK);
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			 
			 String userID = userIDField.getText();
				String password = String.valueOf(userPasswordField.getPassword());
				
				if(logininfo.containsKey(userID)) {
					if(logininfo.get(userID).equals(password)) {
						this.dispose();
						TestPetShop petshop = new TestPetShop();
						TestPetShop.main(null);
						
					}
					else {
						messageLabel.setForeground(Color.red);
						messageLabel.setText("Wrong password");
					}

				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("username not found");
				}
		 }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		

	}

}