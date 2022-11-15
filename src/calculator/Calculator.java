package calculator;

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

public class Calculator {
	public static void main(String[] args) {     
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(view, model);
        view.setVisible(true);

    }
}
