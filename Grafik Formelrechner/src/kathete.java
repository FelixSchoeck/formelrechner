import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class kathete {

	private JFrame frame;
	JTextField a;
	JTextField b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kathete window = new kathete();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kathete() {
		initialize();
		Toolkit toolkit = frame.getToolkit();
		Dimension size = toolkit.getScreenSize();
		frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(kathete.class.getResource("/resources/icon.png")));
		frame.setTitle("Mitternachtsformel");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 88, 414, 33);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Satz des Pythagoras");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(10, 44, 414, 33);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Kathete a:");
		lblNewLabel.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel);
		
		b = new JTextField();
		panel_1.add(b);
		b.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hypotenuse:");
		lblNewLabel_2.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_2);
		
		a = new JTextField();
		panel_1.add(a);
		a.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(10, 132, 414, 81);
		frame.getContentPane().add(panel_2);
		
		JLabel ergebnis = new JLabel("");
		ergebnis.setFont(new Font("Roboto", Font.PLAIN, 14));
		ergebnis.setForeground(Color.WHITE);
		panel_2.add(ergebnis);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(10, 227, 414, 33);
		frame.getContentPane().add(panel_3);
		
		JButton btnNewButton_1 = new JButton("Zur\u00FCck zum Men\u00FC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu menu = new menu();
				menu.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnNewButton_1.setBackground(Color.GRAY);
		panel_3.add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String as = a.getText();
				Double a = Double.parseDouble(as);
				String bs = b.getText();
				Double b = Double.parseDouble(bs);
				Double h;
				
				lblNewLabel.setVisible(true);
				System.out.println(a + " " + b + " ");
				
				h = Math.sqrt(Math.pow(a, 2.0)-Math.pow(b, 2.0));
				
				System.out.println(h);
				ergebnis.setText("Kathete b: " + h);
		
				
			}
		});
	}

}
