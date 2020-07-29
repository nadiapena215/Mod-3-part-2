
public class AverageModel {
	
	private int totalAverage;
	private int sumofAll;
	
	private int maxVal;
		
	public void getAverage(int firstNumber, int secondNumber) {
		sumofAll = (firstNumber + secondNumber); 
		totalAverage =  ((sumofAll)/2);
		if (firstNumber >= secondNumber) {
			maxVal = firstNumber;
		}
		else maxVal = secondNumber;
	}

	public int getTotalValue() {
		return totalAverage;
	}
	
	public int getMaxValue1() {
		return maxVal;
	}

	

}
