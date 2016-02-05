import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BikeStoreGUI extends JFrame {

	//protected static final JTextComponent BikeListTextArea = null;
	private JPanel contentPane;
	private JTextField textPrice;
	private JTextField textColor;
	private JTextField textSize;
	
	BikeStore myStore = new BikeStore();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea bikeList = new JTextArea();
		bikeList.setBounds(253, 27, 198, 180);
		contentPane.add(bikeList);
		
		textPrice = new JTextField();
		textPrice.setBounds(62, 27, 158, 38);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		textColor = new JTextField();
		textColor.setBounds(62, 100, 158, 38);
		contentPane.add(textColor);
		textColor.setColumns(10);
		
		textSize = new JTextField();
		textSize.setBounds(62, 169, 158, 38);
		contentPane.add(textSize);
		textSize.setColumns(10);
		
		JButton btnAdd = new JButton("Add Bike");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bikeList.setText ("");

				myStore.addBike1(textColor.getText(), Integer.parseInt(textPrice.getText()), Integer.parseInt(textSize.getText()));
	bikeList.setText(myStore.getAllBikes());
	textColor.setText("");
	textPrice.setText("");
	textSize.setText("");
			}
		});
		
		btnAdd.setBounds(80, 257, 117, 29);
		contentPane.add(btnAdd);
		
		
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(6, 38, 61, 16);
		contentPane.add(lblPrice);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(6, 111, 61, 16);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(6, 180, 61, 16);
		contentPane.add(lblSize);
	}
}
