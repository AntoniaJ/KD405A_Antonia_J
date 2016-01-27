import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House [] myHouses;
	private ArrayList<House> neighborhood = new ArrayList<House>();
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 83, 433, 372);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
	
		
		JLabel lblHuslista = new JLabel("HUSLISTA");
		lblHuslista.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblHuslista.setHorizontalAlignment(SwingConstants.CENTER);
		lblHuslista.setBounds(186, 57, 144, 16);
		contentPane.add(lblHuslista);
		
		House house1 = new House(1988, 190);
		House house2 = new House(1994, 200);
		House house3 = new House(2001, 110);
		
		String house1string = "Ett hus som är " + house1.getSize() + " kvadratmeter stort och byggdes " +  house1.getYearBuilt() + "\n";
		String house2string = "Ett hus som är " + house2.getSize() + " kvadratmeter stort och byggdes " +  house2.getYearBuilt() + "\n";
		String house3string = "Ett hus som är " + house3.getSize() + " kvadratmeter stort och byggdes " +  house3.getYearBuilt() + "\n";
		
		textArea.append("uppgift 1.2 \n");
		textArea.append(house1string);
		textArea.append(house2string);
		textArea.append(house3string);

		
		System.out.println(house1string);
		System.out.println(house2string);
		System.out.println(house3string);
		
		myHouses = new House[10];
		
		myHouses[0] = new House(1805, 30);
		myHouses[1] = new House(1908, 123);
		myHouses[2] = new House(1856, 370);
		myHouses[3] = new House(2002, 600);
		myHouses[4] = new House(2014, 386);
		myHouses[5] = new House(2008, 738);
		myHouses[6] = new House(1978, 296);
		myHouses[7] = new House(1926, 639);
		myHouses[8] = new House(1856, 990);
		myHouses[9] = new House(2005, 645);
		
		
		String printString; 
		textArea.append("uppgift 1.3 \n");
		
		
		for(int i  = 0; i < 10; i++){
			printString ="Ett hus som är " + myHouses[i].getSize() + "kvaratmeter stort och byggdes " + myHouses[i].getYearBuilt() + "\n";
			System.out.println(printString);
			textArea.append(printString);
		}
		
		textArea.append("uppgift 1.4 \n");
		
		Random rand = new Random();
		
		for(int i = 0; i < 100; i++){
			int size = rand.nextInt((1000 - 10) + 1) +10;
			int year = rand.nextInt((2015 - 1800) +1) + 1800;
			
			neighborhood.add(new House(year, size));
		}
		
		for(House hus: neighborhood){
			printString ="Ett hus som är " + hus.getSize() + "kvadratmeter stort och byggdes " + hus.getYearBuilt() + "\n";
			System.out.println(printString);
			textArea.append(printString);
		}
	}
	
}
