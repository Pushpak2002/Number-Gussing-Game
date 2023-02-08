import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class details extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					details frame = new details();
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
	public details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1103, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Number Guessing Game");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(222, 99, 655, 165);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name :-");
		lblEnterYourName.setForeground(new Color(255, 0, 128));
		lblEnterYourName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblEnterYourName.setBounds(261, 297, 202, 76);
		contentPane.add(lblEnterYourName);
		
		JLabel lblEnterYourAge = new JLabel("Enter Your Age :-");
		lblEnterYourAge.setForeground(new Color(255, 0, 128));
		lblEnterYourAge.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblEnterYourAge.setBounds(261, 395, 202, 76);
		contentPane.add(lblEnterYourAge);
		
		t1 = new JTextField();
		t1.setBounds(453, 319, 250, 37);
		contentPane.add(t1);
		t1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(453, 417, 250, 37);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = t1.getText();
				Game_start g = new Game_start(s);
				g.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Pushpak\\Downloads\\images (7).jpeg.jpg"));
		btnNewButton.setBounds(377, 548, 191, 62);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Guess The Number");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Pushpak\\Downloads\\images.png"));
		lblNewLabel_3.setBounds(0, 0, 413, 104);
		contentPane.add(lblNewLabel_3);
	}
}
