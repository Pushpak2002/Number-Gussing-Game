import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Game_start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String name = "";
					Game_start frame = new Game_start(name);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public int Random()
	{
		int num = 0;
		Random r = new Random();
		num = r.nextInt(10);
		return num;
	}
	public int Random1()
	{
		int num = 0;
		Random r = new Random();
		num = r.nextInt(50);
		return num;
	}
	public int Random2()
	{
		int num = 0;
		Random r = new Random();
		num = r.nextInt(100);
		return num;
	}

	/**
	 * Create the frame.
	 */
	String name;
	public Game_start(String n) {
		name = n;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1117, 773);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How to Play:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(524, 198, 202, 98);
		contentPane.add(lblNewLabel);
		
		JLabel i4 = new JLabel(name);
		i4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		i4.setBounds(506, 134, 161, 27);
		contentPane.add(i4);
		
		JLabel lblNewLabel_2 = new JLabel("1) Help to  pick a secret number .");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(524, 279, 504, 56);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("2) You guess what number it is.");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(524, 322, 504, 56);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("3) If your guess is too high or too low, Game will give you a hint.");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(524, 364, 555, 56);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("4) See how many turns it takes you to win!");
		lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(524, 416, 504, 56);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblChooseLevel = new JLabel("Choose Level :");
		lblChooseLevel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblChooseLevel.setBounds(74, 526, 202, 98);
		contentPane.add(lblChooseLevel);
		
		JButton btnMedium = new JButton("Medium");
		btnMedium.setForeground(new Color(255, 255, 255));
		btnMedium.setBackground(new Color(64, 128, 128));
		btnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Random1();
				Mid_level m = new Mid_level(num,name);
				m.setVisible(true);
				dispose();
			}
		});
		btnMedium.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnMedium.setBounds(449, 634, 138, 56);
		contentPane.add(btnMedium);
		
		JButton btnLow = new JButton("High");
		btnLow.setBackground(new Color(0, 0, 0));
		btnLow.setForeground(new Color(255, 255, 255));
		btnLow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Random2();
				
				Hard_level h = new Hard_level(num,name);
				h.setVisible(true);
				dispose();
				
			}
		});
		btnLow.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnLow.setBounds(717, 634, 144, 56);
		contentPane.add(btnLow);
		
		JButton btnLow_1 = new JButton("Low");
		btnLow_1.setForeground(new Color(255, 255, 255));
		btnLow_1.setBackground(new Color(255, 153, 204));
		btnLow_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = Random();
				
				Low_Level l = new Low_Level(num,name);
				l.setVisible(true);
				dispose();
				
			}
		});
		btnLow_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnLow_1.setBounds(196, 634, 138, 56);
		contentPane.add(btnLow_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1093, 94);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Guess The Number");
		lblNewLabel_1.setBounds(249, 8, 629, 64);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Pushpak\\Downloads\\images.png"));
		lblNewLabel_3.setBounds(0, 0, 229, 94);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Pushpak\\Pictures\\Screenshots\\Screenshot_20230119_152259.png"));
		lblNewLabel_4.setBounds(25, 124, 347, 435);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblHiii = new JLabel("Hiii! ");
		lblHiii.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblHiii.setBounds(448, 112, 62, 75);
		contentPane.add(lblHiii);
		
		
		
		JLabel lblNewLabel_4_1 = new JLabel("Please help us to guess the number..");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_1.setBounds(449, 171, 521, 27);
		contentPane.add(lblNewLabel_4_1);
	}

}
