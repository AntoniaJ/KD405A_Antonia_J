package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.util.ArrayList;
import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;


import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class SkanetrafikenGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchStationText;
	private JTextArea resultArea;
	
	 
	   private JScrollPane scrollPane;
	   private JPanel panel_1;
	   private JTextField fromTextField;
	   private JTextField toTextField;
	   private JTextArea textArea;
	   private JScrollPane tripResultText;
	   private JButton searchTripButton;

	   Parser parser = new Parser();
	   
	   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkanetrafikenGUI frame = new SkanetrafikenGUI();
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
	public SkanetrafikenGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(60, 26, 128, 38);
		contentPane.add(panel);
		
		searchStationText = new JTextField();
		panel.add(searchStationText);
		searchStationText.setColumns(10);
		
		final JButton searchStation = new JButton("sök");
		searchStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultArea.setText("söker...");
			
				
				new GetStationThread().start();
				
				

				
			}
		});
		
		searchStation.setBounds(96, 77, 72, 29);
		contentPane.add(searchStation);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 130, 192, 229);
		contentPane.add(scrollPane);
		
		resultArea = new JTextArea();
		scrollPane.setViewportView(resultArea);
		
		panel_1 = new JPanel();
		panel_1.setBounds(269, 16, 182, 70);
		contentPane.add(panel_1);
		
		fromTextField = new JTextField();
		panel_1.add(fromTextField);
		fromTextField.setColumns(10);
		
		toTextField = new JTextField();
		panel_1.add(toTextField);
		toTextField.setColumns(10);
		
		tripResultText = new JScrollPane();
		tripResultText.setBounds(260, 131, 188, 225);
		contentPane.add(tripResultText);
		
		textArea = new JTextArea();
		tripResultText.setViewportView(textArea);
		
		searchTripButton = new JButton("sök");
		searchTripButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Searching...");
				
				new GetJourneysThread().start();
			}
		
		}); 
		
		searchTripButton.setBounds(319, 98, 84, 29);
		contentPane.add(searchTripButton);

	}
	
	private class GetStationThread extends Thread{
		@Override
		public void run(){
					 
			ArrayList<Station> searchStations = new ArrayList<Station>(); 
			searchStations.addAll(Parser.getStationsFromURL(searchStationText.getText()));
			resultArea.setText(" ");
			for (Station s: searchStations){
				
				resultArea.append(s.getStationName() + " number: " + s.getStationNbr() + "\n");
					
		}
	}

}
	
	private class GetJourneysThread extends Thread{
		@Override
		public void run(){


			String searchURL = Constants.getURL(fromTextField.getText(), toTextField.getText(), 1);
			
			Journeys journeys = Parser.getJourneys(searchURL);
			for (Journey journey : journeys.getJourneys()) {
				textArea.setText("");
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":" + journey.getDepDateTime().get(Calendar.MINUTE);
				
				textArea.setText(journey.getStartStation() + " - " + journey.getEndStation() + " departs" + time + " that is in " + journey.getTimeToDeparture() + " minutes. And it is " + journey.getDepTimeDeviation()+ " min late." + "\n");
			}
			

		}
			
	}
	}
