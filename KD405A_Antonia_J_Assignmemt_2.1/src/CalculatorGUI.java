import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Calculator myCalculator;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		myCalculator = new Calculator();

		textField = new JTextField();

	
	JButton btnNewButton = new JButton("7");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("7");
			myCalculator.numberButtonPressed(7);
		}
	});
	contentPane.setLayout(null);
	btnNewButton.setBounds(38, 102, 50, 50);
	contentPane.add(btnNewButton);
	
	JButton button = new JButton("8");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("8");
			myCalculator.numberButtonPressed(8);
		}
	});
	button.setBounds(106, 102, 50, 50);
	contentPane.add(button);
	
	JButton button_1 = new JButton("9");
	button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("9");
			myCalculator.numberButtonPressed(9);
		}
	});
	button_1.setBounds(178, 102, 50, 50);
	contentPane.add(button_1);
	
	JButton btnAc = new JButton("AC");
	btnAc.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText(" ");
			myCalculator.clear();
		}
	});
	btnAc.setBounds(249, 102, 50, 50);
	contentPane.add(btnAc);
	
	JButton button_3 = new JButton("4");
	button_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("4");
			myCalculator.numberButtonPressed(4);
		}
	});
	button_3.setBounds(38, 175, 50, 50);
	contentPane.add(button_3);
	
	JButton button_4 = new JButton("5");
	button_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("5");
			myCalculator.numberButtonPressed(5);
		}
	});
	button_4.setBounds(106, 175, 50, 50);
	contentPane.add(button_4);
	
	JButton button_5 = new JButton("6");
	button_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("6");
			myCalculator.numberButtonPressed(6);
		}
	});
	button_5.setBounds(178, 175, 50, 50);
	contentPane.add(button_5);
	
	JButton button_6 = new JButton("+");
	button_6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("+");
			myCalculator.plus();
		}
	});
	button_6.setBounds(249, 175, 50, 50);
	contentPane.add(button_6);
	
	JButton button_7 = new JButton("1");
	button_7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("1");
			myCalculator.numberButtonPressed(1);
		}
	});
	button_7.setBounds(38, 248, 50, 50);
	contentPane.add(button_7);
	
	JButton button_8 = new JButton("2");
	button_8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("2");
			myCalculator.numberButtonPressed(2);
		}
	});
	button_8.setBounds(106, 248, 50, 50);
	contentPane.add(button_8);
	
	JButton button_9 = new JButton("3");
	button_9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("3");
			myCalculator.numberButtonPressed(3);
		}
	});
	button_9.setBounds(178, 248, 50, 50);
	contentPane.add(button_9);
	
	JButton button_10 = new JButton("-");
	button_10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("-");
			myCalculator.minus();
		}
	});
	button_10.setBounds(249, 248, 50, 50);
	contentPane.add(button_10);
	
	JButton button_11 = new JButton("0");
	button_11.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("0");
			myCalculator.numberButtonPressed(0);
		}
	});
	button_11.setBounds(38, 320, 118, 50);
	contentPane.add(button_11);
	
	JButton button_12 = new JButton("=");
	button_12.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			myCalculator.equals();
			int i = myCalculator.getResult();
			textField_1.setText(String.valueOf(i));
		}
	});
	button_12.setBounds(178, 320, 50, 50);
	contentPane.add(button_12);
	
	JButton button_13 = new JButton("*");
	button_13.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("*");
			myCalculator.mult();
		}
	});
	button_13.setBounds(249, 320, 50, 50);
	contentPane.add(button_13);
	
	textField_1 = new JTextField();
	textField_1.setBounds(38, 22, 261, 70);
	contentPane.add(textField_1);
	textField_1.setColumns(10);
}

}