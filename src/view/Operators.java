package view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Operators extends JPanel{
	
	private JButton btSum, btRes, btMult, btDiv, btResult;
	private Font fontType = new Font("Sans", 1, 35);
	
	public Operators() {
		this.setLayout(new GridLayout(5,1,4,4));
		this.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 10));

		btSum = new JButton("+");
		btRes = new JButton("-");
		btMult = new JButton("*");
		btDiv = new JButton("/");
		btResult = new JButton("=");
		
		btSum.setFont(fontType);
		btRes.setFont(fontType);
		btMult.setFont(fontType);
		btDiv.setFont(fontType);
		btResult.setFont(fontType);
		
		this.add(btSum);
		this.add(btRes);
		this.add(btMult);
		this.add(btDiv);
		this.add(btResult);		
	}
	
    public void setActionListener(ActionListener actionListener){
    	btSum.addActionListener(actionListener);
    	btRes.addActionListener(actionListener);
    	btMult.addActionListener(actionListener);
    	btDiv.addActionListener(actionListener);
    	btResult.addActionListener(actionListener);
    }

}
