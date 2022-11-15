package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Screen extends JPanel{
	
	private JButton screen;
	
	public Screen() {
		screen = new JButton("");
		screen.setFont(new Font("Sans", Font.BOLD, 20));
		screen.setPreferredSize(new Dimension(300, 40));
		screen.setEnabled(false);
		this.add(screen);
		this.setVisible (true); 
	}
	
	public void changeScreen(String s) {
		screen.setText(s);
	}
}
