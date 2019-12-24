package lab.View;

import lab.Controller.ControllerCalc;
import lab.Model.Calcolatrice;

public class Main {

	public static void main(String[] args) {
		Calcolatrice calc = new Calcolatrice();
		CalcGUI c = new CalcGUI();
		@SuppressWarnings("unused")
		ControllerCalc controller = new ControllerCalc(c,calc);
		c.setVisible(true);
	}

}
