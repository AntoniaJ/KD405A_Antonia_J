import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DogStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField addName;
	private JTextField buyDog;
	
	Human human1;
	Dog dog1;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DogStoreGUI frame = new DogStoreGUI();
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
	public DogStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		addName = new JTextField();
		addName.setBounds(95, 70, 114, 33);
		contentPane.add(addName);
		addName.setColumns(10);
		
		buyDog = new JTextField();
		buyDog.setBounds(95, 115, 114, 33);
		contentPane.add(buyDog);
		buyDog.setColumns(10);

		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(51, 240, 393, 94);
		contentPane.add(textArea);
		
		JTextArea errorArea = new JTextArea();
		errorArea.setBounds(51, 367, 393, 81);
		contentPane.add(errorArea);
		
		JLabel lblNewLabel = new JLabel("Humans and Dogs");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(159, 31, 176, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Name");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//forces the name to be more than 3 letters, otherwise in error
				if(addName.getText().length() < 3){
					errorArea.setText(" du måste skriva in ett namn som är längre än 3 bokstäver");
				}
				
				human1 = new Human(addName.getText());
				textArea.setText(human1.getName());
				textArea.setText("");
			
			}
			
		});
		btnNewButton.setBounds(275, 73, 117, 29);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textArea.getText().isEmpty()){
					errorArea.setText(" för att köpa en hund måste den ha en ägare");
					
				}else{
					
					dog1 = new Dog(buyDog.getText());
					human1.buyDog(dog1);
					textArea.setText(dog1.getName());
					buyDog.setText("");
				}
				
				
			}
		});
		btnNewButton_1.setBounds(275, 118, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(human1.getInfo(human1.getName()));
				
			}
		});
		btnPrintInfo.setBounds(275, 159, 117, 29);
		contentPane.add(btnPrintInfo);

		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(432, 240, 15, 96);
		contentPane.add(scrollBar);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(54, 218, 61, 16);
		contentPane.add(lblInfo);
		
		JLabel lblErrorMessage = new JLabel("Error message");
		lblErrorMessage.setBounds(54, 346, 89, 16);
		contentPane.add(lblErrorMessage);
	}
}
