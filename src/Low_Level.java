import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Low_Level extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int num = 0;
					String name ="";
					Low_Level frame = new Low_Level(num,name);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	int r = 5;
	int Round()
	{
		r = r-1;
		return r;
	}

	/**
	 * Create the frame.
	 */
	int num;
	String name;
	private JTextField t1;
	public Low_Level(int n,String n1) {
		num = n;
		name = n1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1108, 770);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel i4 = new JLabel(name);
		i4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		i4.setBounds(434, 113, 161, 27);
		contentPane.add(i4);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Turn ");
		lblNewLabel_1_1_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1_1.setBounds(617, 341, 61, 61);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Guess The Number");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Pushpak\\Downloads\\images.png"));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(0, 0, 413, 104);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pushpak\\Downloads\\download (5).jpeg.jpg"));
		lblNewLabel.setBounds(170, 225, 178, 349);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pick a number between 1 and 10.");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(434, 294, 380, 69);
		contentPane.add(lblNewLabel_1);
		
		JLabel i1 = new JLabel("1");
		i1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 20));
		i1.setBounds(603, 250, 61, 61);
		contentPane.add(i1);
		
		JLabel i2 = new JLabel("5");
		i2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 20));
		i2.setBounds(603, 341, 61, 61);
		contentPane.add(i2);
		
		JLabel i3 = new JLabel("");
		i3.setForeground(new Color(255, 0, 0));
		i3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 20));
		i3.setBounds(457, 412, 380, 61);
		contentPane.add(i3);
		
		JLabel i5 = new JLabel("");
		i5.setForeground(new Color(255, 0, 0));
		i5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		i5.setBounds(433, 616, 404, 41);
		contentPane.add(i5);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(Round() > 0)
				{
					int a = Integer.parseInt(t1.getText());
					if(a < num)
					{
						i3.setText("too Low guessing");
						int t1 = Integer.parseInt(i1.getText());
						t1 = t1+1;
						String s = Integer.toString(t1);
						i1.setText(s);
						int t2 = Integer.parseInt(i2.getText());
						t2 = t2-1;
						s = Integer.toString(t2);
						i2.setText(s);
						s = "";
						
					}
					if(a > num)
					{
						i3.setText("too High guessing");
						int t1 = Integer.parseInt(i1.getText());
						t1 = t1+1;
						String s = Integer.toString(t1);
						i1.setText(s);
						int t2 = Integer.parseInt(i2.getText());
						t2 = t2-1;
						s = Integer.toString(t2);
						i2.setText(s);
					}
					if( a == num)
					{
						i3.setText("Your Guessing is Correct.");
						JOptionPane.showMessageDialog(null, "You Win:");
						
						Game_start g = new Game_start(name);
						g.setVisible(true);
						dispose();
					}
					
				}
				else
				{
					i5.setText("Number Is : "+num);
					JOptionPane.showMessageDialog(null, "You finish your turns:");
					
					Game_start g = new Game_start(name);
					g.setVisible(true);
					dispose();
				}
					
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Pushpak\\Downloads\\guess.gif"));
		btnNewButton.setBounds(617, 483, 127, 67);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("You will have ");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(481, 341, 135, 61);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Turn ");
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1.setBounds(534, 250, 61, 61);
		contentPane.add(lblNewLabel_1_1_1);
		
		
		
		t1 = new JTextField();
		t1.setBounds(457, 496, 161, 41);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Level : Low");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(10, 696, 178, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Hii ! ");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(376, 113, 48, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Please help us to guess the number..");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_1.setBounds(340, 150, 521, 27);
		contentPane.add(lblNewLabel_4_1);
		
		
		
		
		
	}

}
