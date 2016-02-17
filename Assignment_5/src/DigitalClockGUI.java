import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;

public class DigitalClockGUI extends JFrame {
	private ClockLogic clockLogic;
	private JLabel hourLabel;
	private JLabel minuteLabel;
	private JLabel timeLabel;
	private JLabel alarmLabel;
	
	
	
	private JPanel contentPane;
	private JTextField hourTextField;
	private JTextField minuteTextField;
	private JLabel alarmMessage;
	private JLabel sunLabel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 396);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(105, 105, 105));
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		timeLabel = new JLabel(" ");
		timeLabel.setForeground(new Color(128, 128, 128));
		timeLabel.setFont(new Font("Minion Pro", Font.PLAIN, 61));
		timeLabel.setBounds(95, 77, 241, 74);
		contentPane.add(timeLabel);
		
		alarmLabel = new JLabel(" ");
		alarmLabel.setForeground(new Color(128, 128, 128));
		alarmLabel.setFont(new Font("Minion Pro", Font.PLAIN, 25));
		alarmLabel.setBounds(160, 147, 117, 40);
		contentPane.add(alarmLabel);
		
		JButton clearButton = new JButton("Clear Alarm");
		clearButton.setForeground(new Color(105, 105, 105));
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clockLogic.clearAlarm();
				alarmLabel.setText(" ");
			}
			
		});
		clearButton.setBounds(217, 263, 117, 29);
		contentPane.add(clearButton);
		
		JButton setLabel = new JButton("Set Alarm");
		setLabel.setForeground(new Color(105, 105, 105));
		setLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hourString = hourTextField.getText(); 
				int hour = Integer.parseInt(hourString);
				String minuteString = minuteTextField.getText();
				int minute = Integer.parseInt(minuteString);
				clockLogic.setAlarm(hour, minute); 
				
				alarmLabel.setText(hourTextField.getText() + " : " + minuteTextField.getText());
				
			}
		});
		setLabel.setBounds(88, 263, 117, 29);
		contentPane.add(setLabel);
		
		hourTextField = new JTextField();
		hourTextField.setBounds(108, 199, 75, 26);
		contentPane.add(hourTextField);
		hourTextField.setColumns(10);
		
		minuteTextField = new JTextField();
		minuteTextField.setBounds(261, 199, 75, 26);
		contentPane.add(minuteTextField);
		minuteTextField.setColumns(10);
		
		hourLabel = new JLabel("Hour");
		hourLabel.setForeground(new Color(128, 128, 128));
		hourLabel.setBounds(60, 204, 36, 16);
		contentPane.add(hourLabel);
		
		minuteLabel = new JLabel("Minutes");
		minuteLabel.setForeground(new Color(105, 105, 105));
		minuteLabel.setBounds(201, 204, 61, 16);
		contentPane.add(minuteLabel);
		
		alarmMessage = new JLabel("");
		alarmMessage.setForeground(new Color(0, 0, 0));
		alarmMessage.setFont(new Font("Minion Pro", Font.PLAIN, 24));
		alarmMessage.setBounds(110, 312, 226, 45);
		contentPane.add(alarmMessage);
		
		sunLabel = new JLabel("");
		sunLabel.setIcon(new ImageIcon("/Users/antoniajungbeck/Desktop/sun.png"));
		sunLabel.setBounds(6, 6, 402, 362);
		contentPane.add(sunLabel);
		clockLogic = new ClockLogic(this);
	}
	
	public void digitalClockGUI() {
	}
	
	public void setTimeOnLabel(String time){
		timeLabel.setText(time);
	}
	
	public void setAlarmOnLabel(String alarmTime){
		alarmLabel.setText(alarmTime);
	}
	
	public void activeAlarm(boolean activate){
		if(activate)
		{
			alarmMessage.setText(" Vakna Sömntuta! ");
		}else{
		 alarmMessage.setText(" ");
		}

		
		} 

		
	}    
	   
