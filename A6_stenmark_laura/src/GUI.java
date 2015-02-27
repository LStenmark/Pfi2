import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private GUI gui; 
	private JTextArea textArea;
	private JTextArea textArea_1; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		gui = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 401);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setBorder(new EmptyBorder(2, 20, 20, 20));
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.add(panel_4);
		
		JLabel lblNewLabel_1 = new JLabel("S\u00F6k h\u00E5llplats");
		panel_4.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(26);
		
		JButton btnNewButton = new JButton("  S\u00F6k  ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				textArea.setText("Searching...");
				SearchStation s = new SearchStation(gui, textField.getText());
				s.start();
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel.add(panel_5);
		
		JLabel lblNewLabel_5 = new JLabel("Resultat:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		panel_5.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane (textArea);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
		panel_3.add(scroll);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.background"));
		panel_1.setBorder(new EmptyBorder(0, 20, 20, 20));
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_8.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_8);
		
		JLabel lblNewLabel_2 = new JLabel("Från:");
		panel_8.add(lblNewLabel_2);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_7.getLayout();
		panel_1.add(panel_7);
		
		textField_1 = new JTextField();
		panel_7.add(textField_1);
		textField_1.setColumns(35);
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_6.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_6);
		
		JLabel lblNewLabel_3 = new JLabel("Till:");
		panel_6.add(lblNewLabel_3);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		
		textField_2 = new JTextField();
		panel_9.add(textField_2);
		textField_2.setColumns(35);
		
		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10);
		
		JButton btnNewButton_1 = new JButton("S\u00F6k resa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_1.setText("Searching...");
				SearchJourney j = new SearchJourney(gui, textField_1.getText(), textField_2.getText());
				j.start();
			}
		});
		panel_10.add(btnNewButton_1);
		
		JPanel panel_11 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_11.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_11);
		
		JLabel lblNewLabel_4 = new JLabel("S\u00F6kresultat:");
		panel_11.add(lblNewLabel_4);
		lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		JPanel panel_12 = new JPanel();
		panel_1.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		textArea_1 = new JTextArea();
		JScrollPane scroll_1 = new JScrollPane (textArea_1);
		panel_12.add(scroll_1);
			
	}
	
	public void UpdateResult(String s) {
		textArea.setText(s);
	}
	public void UpdateJourney(String s) {
		textArea_1.setText(s);
	}


}
