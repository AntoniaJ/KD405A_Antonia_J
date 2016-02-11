import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CatGameGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CatGameGUI frame = new CatGameGUI();
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
	public CatGameGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(55, 67, 420, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea txtrMorAnnasGrd = new JTextArea();
		txtrMorAnnasGrd.setText("Mor Annas gård");
		txtrMorAnnasGrd.setBounds(325, 5, -232, -44);
		panel.add(txtrMorAnnasGrd);
		
		JLabel lblNoImage = new JLabel("No Image");
		lblNoImage.setBounds(152, 5, 60, 16);
		panel.add(lblNoImage);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(217, 5, 61, 16);
		panel.add(lblNewLabel);
	}
}
