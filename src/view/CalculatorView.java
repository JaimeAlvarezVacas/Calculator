package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CalculatorView extends JFrame{

	private Operators operators;
	private Buttons buttons;
	private Screen screen;

	public CalculatorView() {
		this.setTitle("Calculator");
		
		ImageIcon img = new ImageIcon("src/images/calculator.png");
		this.setIconImage(img.getImage());
		
		this.setLayout(new BorderLayout(8,8));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
        this.setSize(400,400);

        screen = new Screen();
		operators = new Operators();
		buttons = new Buttons();
		
		this.add(screen, BorderLayout.NORTH);
		this.add(operators, BorderLayout.EAST);
		this.add(buttons, BorderLayout.CENTER);

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        this.setVisible(true);
	}
	
	public void setActionListener(ActionListener actionListener){
		operators.setActionListener(actionListener);
        buttons.setActionListener(actionListener);
    }
	
	public void changeScreen(String s) {
		screen.changeScreen(s);
	}
}
