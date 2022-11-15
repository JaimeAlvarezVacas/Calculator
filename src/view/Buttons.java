package view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons extends JPanel{
	
    private JButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btC,btDot;
    private Font fontType = new Font("Sans", 1, 35);
    
	public Buttons() {
		this.setLayout(new GridLayout(4,4,4,4));
		this.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 0));
		
		bt0 = new JButton("0");
		bt1 = new JButton("1");
		bt2 = new JButton("2");
		bt3 = new JButton("3");
		bt4 = new JButton("4");
		bt5 = new JButton("5");
		bt6 = new JButton("6");
		bt7 = new JButton("7");
		bt8 = new JButton("8");
		bt9 = new JButton("9");
		btC = new JButton("C");
		btDot = new JButton(".");
		
		bt0.setFont(fontType);
		bt1.setFont(fontType);
		bt2.setFont(fontType);
		bt3.setFont(fontType);
		bt4.setFont(fontType);
		bt5.setFont(fontType);
		bt6.setFont(fontType);
		bt7.setFont(fontType);
		bt8.setFont(fontType);
		bt9.setFont(fontType);
		btC.setFont(fontType);
		btDot.setFont(fontType);
		
		this.add(bt7);
        this.add(bt8);
        this.add(bt9);
        this.add(bt4);
        this.add(bt5);
        this.add(bt6);
        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
		this.add(bt0);   
        this.add(btDot);
        this.add(btC);
		
	}
	
	public void setActionListener(ActionListener actionListener){
	    bt0.addActionListener(actionListener);
	    bt1.addActionListener(actionListener);
	    bt2.addActionListener(actionListener);
	    bt3.addActionListener(actionListener);
	    bt4.addActionListener(actionListener);
	    bt5.addActionListener(actionListener);
	    bt6.addActionListener(actionListener);
	    bt7.addActionListener(actionListener);
	    bt8.addActionListener(actionListener);
	    bt9.addActionListener(actionListener);
	    btC.addActionListener(actionListener);
	    btDot.addActionListener(actionListener); 
	}
	
}
