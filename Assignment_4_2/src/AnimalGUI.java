import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JScrollPane;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	
	/** prints out the animals in a Arraylist*/
	public AnimalGUI() {
		
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		Cat c = new Cat("Lynx Lynx", 3, 12);
		Dog d = new Dog("canis", 4, true, "Irma");
		Snake a = new Snake("serpentes", true);
		Cat c2 = new Cat("Lynx Lynx", 6, 17);
		Dog d2 = new Dog("canis", 4, false, "Mr Dog");
		Snake a2 = new Snake("serpentes", false);
		
		myAnimals.add(c);
		myAnimals.add(d);
		myAnimals.add(a);
		myAnimals.add(c2);
		myAnimals.add(d2);
		myAnimals.add(a2);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 98, 354, 177);
		contentPane.add(scrollPane);
		
		JTextArea animalText = new JTextArea();
		scrollPane.setViewportView(animalText);
		
		JLabel animalLabel = new JLabel("The Animals");
		animalLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		animalLabel.setBounds(192, 53, 126, 26);
		contentPane.add(animalLabel);
		
		for(int i = 0; i < myAnimals.size(); i++){
			String s = myAnimals.get(i).getInfo();
			animalText.append(s+ "\n");
		}
	}
}
