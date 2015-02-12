import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.JTextArea;


public class Animal_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animal_GUI frame = new Animal_GUI();
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
	public Animal_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Animallist");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		ArrayList<Animal> a = new ArrayList<Animal>();
		
		//Adds  with random values to the list.
		a.add(new Cat("lat: Lynx Lynx", 2, 3, "Tjoflöjt"));
		a.add(new Dog("canus arueus", 5, true, "CapsLock"));
		a.add(new Cat("lat: Lynx Lynx", 9, 4, "Brödrost"));
		a.add(new Snake("Lelopython", true));
		a.add(new Dog("canus arueus", 8, false, "Rivjärn"));
		a.add(new Cat("lat: Lynx Lynx", 7, 4, "Syntax Error"));
		a.add(new Snake("Lelopython", false));
		
		for(int i = 0; i < a.size(); i++)
		{
			 textArea.append(a.get(i).getInfo());
		}  
	}

}
