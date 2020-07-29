
public class MVCAverage {
	public static void main(String[] args) {
		AverageView theView = new AverageView();
		AverageModel theModel = new AverageModel();
		AverageController theController = new AverageController(theView, theModel);
		
		theView.setVisible(true);
		
	}
    	
}
