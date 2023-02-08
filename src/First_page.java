import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class First_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_page frame = new First_page();
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
	public First_page() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Pushpak\\Downloads\\Number_gue.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1046, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Pushpak\\Downloads\\images (9).jpeg.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				details d = new details();
				d.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(399, 270, 247, 81);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pushpak\\Downloads\\photo-1622737133809-d95047b9e673.jpeg.jpg"));
		lblNewLabel.setBounds(0, 100, 1032, 543);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Guess The Number");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Pushpak\\Downloads\\images.png"));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(0, 0, 413, 104);
		contentPane.add(lblNewLabel_3);
	}
}
