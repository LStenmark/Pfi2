import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextArea;

import java.awt.GridLayout;

import javax.swing.BoxLayout;

import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class newGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea txtrHejHejn;
	private JTextArea textArea_2;
	private JTextArea textArea_1;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newGUI frame = new newGUI();
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
	public newGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		contentPane.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel_7.add(panel, BorderLayout.NORTH);
		panel.setBackground(Color.BLACK);
		
		JLabel lblNewLabel = new JLabel("Ubåtshallen");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.BLACK);
		panel_7.add(panel_11);
		panel_11.setLayout(new BoxLayout(panel_11, BoxLayout.X_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_11.add(panel_2);
		panel_2.setBackground(Color.BLACK);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.BLACK);
		panel_2.add(panel_10, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Linje  ");
		panel_10.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_2.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		textArea.setForeground(Color.ORANGE);
		textArea.setBackground(Color.BLACK);
		panel_1.add(textArea);
		
		JPanel panel_4 = new JPanel();
		panel_11.add(panel_4);
		panel_4.setBackground(Color.BLACK);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_6.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_6.setBackground(Color.BLACK);
		panel_4.add(panel_6);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		panel_6.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		txtrHejHejn = new JTextArea();
		panel_8.add(txtrHejHejn);
		txtrHejHejn.setText("Eyy I'm searching yo");
		txtrHejHejn.setBackground(Color.BLACK);
		txtrHejHejn.setForeground(Color.ORANGE);
		
		JPanel panel_3 = new JPanel();
		panel_11.add(panel_3);
		panel_3.setBackground(Color.BLACK);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JPanel panel_9 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_9.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_9.setBackground(Color.BLACK);
		panel_3.add(panel_9);
		
		JLabel lblNewLabel_2 = new JLabel("Avgår    ");
		panel_9.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLACK);
		panel_3.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		textArea_2 = new JTextArea();
		textArea_2.setForeground(Color.ORANGE);
		textArea_2.setBackground(Color.BLACK);
		panel_5.add(textArea_2);
		
		JPanel panel_12 = new JPanel();
		panel_11.add(panel_12);
		panel_12.setLayout(new BoxLayout(panel_12, BoxLayout.Y_AXIS));
		
		JPanel panel_13 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_13.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_13.setBackground(Color.BLACK);
		panel_12.add(panel_13);
		
		JLabel lblNewLabel_4 = new JLabel("Sen");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setForeground(Color.LIGHT_GRAY);
		panel_13.add(lblNewLabel_4);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.BLACK);
		panel_14.setForeground(Color.BLACK);
		panel_12.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		textArea_1 = new JTextArea();
		textArea_1.setForeground(Color.ORANGE);
		textArea_1.setBackground(Color.BLACK);
		panel_14.add(textArea_1);
		
		
		
		//new thread that gets departure info.
		UpdateThread u = new UpdateThread(this,"Ubåtscentralen");
		u.start();
	
	}
	public void Update(String l,String d,String a, String s){
		textArea.setText(l);
		textArea_2.setText(a);
		txtrHejHejn.setText(d);
		textArea_1.setText(s);		
		
	}
}

