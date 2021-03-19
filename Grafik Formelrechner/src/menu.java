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


public class menu {

	private JFrame menu;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.menu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		initialize();
		Toolkit toolkit = menu.getToolkit();
		Dimension size = toolkit.getScreenSize();
		menu.setLocation(size.width/2 - menu.getWidth()/2, size.height/2 - menu.getHeight()/2);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		menu = new JFrame();
		menu.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programmieren\\Java\\1\\Grafik Formelrechner\\iconfinder_calculator-math-tool-school_2824440.png"));
		menu.setTitle("Men\u00FC");
		menu.getContentPane().setBackground(Color.DARK_GRAY);
		menu.setBounds(100, 100, 450, 300);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.getContentPane().setLayout(null);
		menu.setResizable(false);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setVisible(false);
		lblNewLabel.setBounds(47, 172, 308, 48);
		menu.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 88, 414, 33);
		menu.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Mitternachtsformel");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		JButton pyt = new JButton("Satz des Pythagoras");
		pyt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pythagoras pyta = new pythagoras();
				pyta.main(null);
				menu.dispose();
			}
		});
		pyt.setForeground(Color.WHITE);
		pyt.setFont(new Font("Roboto", Font.PLAIN, 12));
		pyt.setBackground(Color.GRAY);
		panel.add(pyt);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(10, 44, 414, 33);
		menu.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Welchen Formelrechner ben\u00F6tigst du?");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Made by Felix Sch\u00F6ck");
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(321, 246, 113, 14);
		menu.getContentPane().add(lblNewLabel_2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fenster fnstr = new fenster();
				fnstr.main(null);
				menu.dispose();
			}
		});
	}
}	
