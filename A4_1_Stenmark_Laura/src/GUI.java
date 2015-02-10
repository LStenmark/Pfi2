import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtErrormessage;
	private JPanel panel_3;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private Human human;
	private boolean created = false;

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
		contentPane.setBackground(new Color(255, 153, 255));
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("Humans and Dogs");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(label, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 255));
		panel.setForeground(Color.BLACK);
		panel.setBorder(new EmptyBorder(20, 20, 50, 20));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(2, 1, 20, 20));
		
		lblNewLabel_2 = new JLabel("Human name:");
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Dog name:");
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 153, 255));
		panel_1.setBorder(new EmptyBorder(20, 20, 20, 40));
		contentPane.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(3, 0, 0, 10));
		

		
		btnNewButton_3 = new JButton("New Human");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (textField.getText().length()< 3) {
					textField_2.setText("The human name is shorter than 3 characters. Change your name pls.");
				} else {
					human = new Human(textField.getText());
					created = true;
					txtErrormessage.setText("New human named "+ textField.getText() +" created.");
					textField_2.setText("");
				}
			}
			});
		panel_1.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Buy Dog");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (created){
					Dog dog = new Dog(textField_1.getText());
					human.buyDog(dog);
					txtErrormessage.setText(human.getName()+ " has bought a dog named " + dog.memberName() +".");
					textField_2.setText("");
					
				} else {
					textField_2.setText("Pleeeease create a human you sandbag.");
				}
			}
		});
		panel_1.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Print info");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (created){
					txtErrormessage.setText(human.getInfo());
					textField_2.setText("");
					
				} else {
					textField_2.setText("Pleeeease create a human you sandbag.");
				}				
			}
		});
		panel_1.add(btnNewButton_5);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 204, 255));
		panel_3.setBorder(new EmptyBorder(0, 20, 10, 20));
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(4, 2, 0, 0));
		
		lblNewLabel_1 = new JLabel("Info");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblNewLabel_1);
		
		txtErrormessage = new JTextField();
		panel_3.add(txtErrormessage);
		txtErrormessage.setColumns(10);
		
		
		
		lblNewLabel = new JLabel("Error Message");
		panel_3.add(lblNewLabel);
		
		textField_2 = new JTextField();
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);

	}

}
