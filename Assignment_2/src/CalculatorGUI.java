import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtDjupText;

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
		setBounds(100, 100, 311, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDjupText = new JTextField();
		txtDjupText.setHorizontalAlignment(SwingConstants.TRAILING);
		txtDjupText.setFont(new Font("Iowan Old Style", Font.PLAIN, 20));
		txtDjupText.setBounds(10, 25, 288, 60);
		contentPane.add(txtDjupText);
		txtDjupText.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setBounds(20, 107, 50, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("9");
		btnNewButton_1.setBounds(165, 107, 50, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.setBounds(94, 107, 50, 50);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("+");
		button.setBounds(233, 107, 50, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("4");
		button_1.setBounds(20, 170, 50, 50);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("5");
		button_2.setBounds(94, 170, 50, 50);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.setBounds(165, 170, 50, 50);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.setBounds(233, 170, 50, 50);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("1");
				my
			}
		});
		button_5.setBounds(20, 240, 50, 50);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.setBounds(94, 240, 50, 50);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setBounds(165, 240, 50, 50);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.setBounds(233, 240, 50, 50);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_9.setBounds(20, 302, 125, 50);
		contentPane.add(button_9);
		
		JButton btnAc = new JButton(".");
		btnAc.setBounds(165, 302, 50, 50);
		contentPane.add(btnAc);
		
		JButton button_12 = new JButton("=");
		button_12.setBounds(233, 302, 50, 50);
		contentPane.add(button_12);
	}
}
