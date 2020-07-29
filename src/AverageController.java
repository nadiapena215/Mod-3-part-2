import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AverageController {
	private AverageView theView;
	private AverageModel theModel;
	
	public AverageController(AverageView theView, AverageModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new CalculateListener());
}
	
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			int firstNum = 0, secondNum = 0;
			
			try {
				firstNumber = theView.getFirstNum();
				secondNumber = theView.getSecondNum();
				
				theModel.getAverage(firstNumber, secondNumber);
				theView.setAverageSoultion(theModel.getTotalValue());
				theView.setMaxSoultion(theModel.getMaxValue1());
			}
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("You must enter 2 integers");
			}
		}
		
		
	}
}
