import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.GridLayout;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.util.Timer;
import java.util.Calendar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Object;
import java.awt.Toolkit;


public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1; 
	private ClockLogic clockLogic;
	private boolean active = false; 
	private JLabel alarmLabel;
	private JLabel timeLabel;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("images.jpg")));
		setTitle("Mad Alarmclock");
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 284);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 0, 0));
		contentPane.add(panel, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel("Hour:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblNewLabel);

		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Minute:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblNewLabel_1);

		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Set alarm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Check if hours and minutes are within the limits, else set them to limits.
				try {
					int h = Integer.parseInt(textField.getText());
					int m = Integer.parseInt(textField_1.getText());

					if (h > 23 || h < 0) {
						h = 0;
					}

					if (m < 0 || m > 59) {
						m = 0;
					}

					//Use String.format to get the right format.
					alarmLabel.setText(String.format("Alarm at: %02d:%02d",h,m));
					//Set the alarm
					clockLogic.setAlarm(h, m);

					//Use NumberFormatException to get rid of letters.
				} catch (NumberFormatException e) {
					alarmLabel.setText("Pfft! The alarm doesn't like letters.");
				}

			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Clear alarm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alarmLabel.setText("Alarm at:");
				clockLogic.clearAlarm();
				alarmLabel.setForeground(Color.BLACK);
			}
		});
		panel.add(btnNewButton_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		timeLabel = new JLabel("13:13:13");
		timeLabel.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 16));
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(timeLabel);

		alarmLabel = new JLabel("Alarm at:");
		alarmLabel.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 16));
		panel_1.add(alarmLabel);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("url.jpg")));
		contentPane.add(lblNewLabel_3, BorderLayout.CENTER);
		setTimeOnLabel("test");

		//Has to be created after alarmLabel
		clockLogic = new ClockLogic(this);
	}

	public void setTimeOnLabel(String time) {
		timeLabel.setText(time);
	}
	//If alarm is active, set foreground to red, else black. 
	public void alarm (boolean activate) {
		if (activate) { 
			alarmLabel.setForeground(Color.RED);
		} else {
			alarmLabel.setForeground(Color.BLACK);
		}
	}
}
