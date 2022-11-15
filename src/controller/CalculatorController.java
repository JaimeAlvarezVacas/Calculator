package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
	
	private CalculatorView view;
	private CalculatorModel model;
	
	public CalculatorController(CalculatorView view, CalculatorModel model) {
		this.model = model;
        this.view = view;

        view.setActionListener(new CalculatorControllerActionListener());
	}
	
	class CalculatorControllerActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String value = e.getActionCommand();

			switch(value) {
				case "0":	
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					model.addDigit(value);
					break;
				case "+":
				case "-":
				case "*":
				case "/":
				case "=":
					model.calculate(value);
					break;
				case "C":
					model.clearArray();
					break;
				case ".":
					model.addDot(value);
					break;
			}
			view.changeScreen(model.getValue());
			
		}
		
	}

}
