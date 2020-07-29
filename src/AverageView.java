
import java.awt.event.ActionListener;
import javax.swing.*;


public class AverageView extends JFrame {
	
	
	private JTextField firstNumber = new JTextField(10);
	private JTextField secondNumber = new JTextField(10);
	private JLabel equalSignLabel = new JLabel("=");
	private JButton calculateButton = new JButton("Calculate Average");
	private JTextField averageSolution = new JTextField(10);
	private JLabel maxSignLabel = new JLabel("Max Value");
	private JLabel equalMaxSignLabel = new JLabel("=");
	private JTextField maxSolution = new JTextField(10);
	
		
	AverageView (){
		JPanel panel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		panel.add(firstNumber);
		panel.add(secondNumber);
		panel.add(calculateButton);
		panel.add(equalSignLabel);
		panel.add(averageSolution);
		panel.add(equalMaxSignLabel);
		panel.add(maxSignLabel);
		panel.add(maxSolution);
		
		this.add(panel);
				
	}
	
	public int getFirstNum() {
		return Integer.parseInt(firstNumber.getText());
	}
	
	public int getSecondNum() {
		return Integer.parseInt(secondNumber.getText());
	}
	public int getAverageSolution() {
		return Integer.parseInt(averageSolution.getText());
	}
	
	public void setAverageSoultion(int solution) {
		averageSolution.setText(Integer.toString(solution));
	}
	
	public int getMaxSolution() {
		return Integer.parseInt(maxSolution.getText());
	}
	
	public void setMaxSoultion(int solution) {
		maxSolution.setText(Integer.toString(solution));
	}
	
	void addCalculationListener(ActionListener listenForCalculateButton) {
		calculateButton.addActionListener(listenForCalculateButton);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

	
}
