package se.mah.KD405A;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.ScrollPane;
import javax.swing.JTextArea;
import java.awt.List;
import javax.swing.JScrollPane;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Insets;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextPane txtSkapaNy;
	private JTextField txtNamn;
	private JTextField txtlder;
	private JTextField txtPersonnummer;
	private JTextField txtAdress;
	private JTextField txtTelefon;
	private JTextField txtEpost;
	private JTextPane txtMedlemmar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 454);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(10, 0, 10, 0));
		setJMenuBar(menuBar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("/Users/antoniajungbeck/Documents/Interaktionsdesign /KD405A_Antonia_J/Assigment_1/src/se/mah/KD405A/nordic_pytte.png"));
		menuBar.add(lblNewLabel_1);
		
		JMenu mnArkiv = new JMenu("  Arkiv");
		menuBar.add(mnArkiv);
		
		JCheckBoxMenuItem chckbxmntmSkrivUt = new JCheckBoxMenuItem("Skriv ut");
		mnArkiv.add(chckbxmntmSkrivUt);
		
		JCheckBoxMenuItem chckbxmntmAvsluta = new JCheckBoxMenuItem("Avsluta");
		mnArkiv.add(chckbxmntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JCheckBoxMenuItem chckbxmntmNyMedlem = new JCheckBoxMenuItem("Ny medlem");
		mnMedlem.add(chckbxmntmNyMedlem);
		
		JCheckBoxMenuItem chckbxmntmHittaMedlem = new JCheckBoxMenuItem("Hitta Medlem");
		mnMedlem.add(chckbxmntmHittaMedlem);
		
		JMenu mnOm = new JMenu("Om");
		menuBar.add(mnOm);
		
		JCheckBoxMenuItem chckbxmntmOmProgrammet = new JCheckBoxMenuItem("Om Programmet");
		mnOm.add(chckbxmntmOmProgrammet);
		
		JCheckBoxMenuItem chckbxmntmHjlp = new JCheckBoxMenuItem("Hjälp");
		mnOm.add(chckbxmntmHjlp);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 58, 107, 270);
		contentPane.add(scrollPane);
		
		JTextArea txtrKalleAnka = new JTextArea();
		txtrKalleAnka.setBackground(new Color(245, 245, 245));
		txtrKalleAnka.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtrKalleAnka.setText("Kalle Anka\n\nMusse Pigg\n\nKnatte\n\nJoakim Von Anka\n\nLångben\n\nPrinsessan Snövit\n\nRapunzel\n\nAladdin\n\nTiana\n\nAriel\n\nAnna\n\nElsa\n\nKnase \n\nSebastian Krabbson\n\nDoris\n\nPluto");
		scrollPane.setViewportView(txtrKalleAnka);
		
		txtSkapaNy = new JTextPane();
		txtSkapaNy.setBackground(new Color(240, 248, 255));
		txtSkapaNy.setFont(new Font("Helvetica", Font.PLAIN, 14));
		txtSkapaNy.setText("Fyll i dina uppgifter");
		txtSkapaNy.setBounds(155, 28, 148, 26);
		contentPane.add(txtSkapaNy);
		
		txtNamn = new JTextField();
		txtNamn.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtNamn.setText("Princess Merida ");
		txtNamn.setBounds(155, 58, 148, 26);
		contentPane.add(txtNamn);
		txtNamn.setColumns(10);
		
		txtlder = new JTextField();
		txtlder.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtlder.setText("19960516-0169");
		txtlder.setBounds(155, 96, 148, 26);
		contentPane.add(txtlder);
		txtlder.setColumns(10);
		
		txtPersonnummer = new JTextField();
		txtPersonnummer.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtPersonnummer.setText("Castle of DunBroch");
		txtPersonnummer.setBounds(155, 134, 148, 26);
		contentPane.add(txtPersonnummer);
		txtPersonnummer.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtAdress.setText("Scottish Highlands");
		txtAdress.setBounds(155, 172, 148, 26);
		contentPane.add(txtAdress);
		txtAdress.setColumns(10);
		
		txtTelefon = new JTextField();
		txtTelefon.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtTelefon.setText("+441463693527");
		txtTelefon.setBounds(155, 210, 148, 26);
		contentPane.add(txtTelefon);
		txtTelefon.setColumns(10);
		
		txtEpost = new JTextField();
		txtEpost.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtEpost.setText("princess@merida.com");
		txtEpost.setBounds(155, 248, 148, 26);
		contentPane.add(txtEpost);
		txtEpost.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(354, 299, 117, 29);
		contentPane.add(btnSpara);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/antoniajungbeck/Documents/Interaktionsdesign /KD405A_Antonia_J/merida.jpg"));
		lblNewLabel.setBounds(315, 20, 203, 247);
		contentPane.add(lblNewLabel);
		
		txtMedlemmar = new JTextPane();
		txtMedlemmar.setBackground(new Color(240, 248, 255));
		txtMedlemmar.setFont(new Font("Helvetica", Font.PLAIN, 14));
		txtMedlemmar.setText("Medlemmar");
		txtMedlemmar.setBounds(13, 27, 130, 26);
		contentPane.add(txtMedlemmar);
	}
}
