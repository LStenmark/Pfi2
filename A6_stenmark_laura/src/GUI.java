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


public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 112, 214));
		panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(6, 3, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("S\u00F6k h\u00E5llplats");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("S\u00F6k");
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Resultat:");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBorder(new EmptyBorder(0, 20, 20, 20));
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(8, 4, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Till:");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Fr\u00E5n:");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("S\u00F6k resa");
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("S\u00F6kresultat:");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(lblNewLabel_4);
		
		JTextArea textArea_1 = new JTextArea();
		panel_1.add(textArea_1);
	}

}
