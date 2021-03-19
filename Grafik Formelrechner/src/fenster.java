import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;

public class fenster {

	private JFrame frmMitternachtsformel;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenster window = new fenster();
					window.frmMitternachtsformel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fenster() {
		initialize();
		Toolkit toolkit = frmMitternachtsformel.getToolkit();
		Dimension size = toolkit.getScreenSize();
		frmMitternachtsformel.setLocation(size.width/2 - frmMitternachtsformel.getWidth()/2, size.height/2 - frmMitternachtsformel.getHeight()/2);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmMitternachtsformel = new JFrame();
		frmMitternachtsformel.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programmieren\\Java\\1\\Grafik Formelrechner\\iconfinder_calculator-math-tool-school_2824440.png"));
		frmMitternachtsformel.setTitle("Mitternachtsformel");
		frmMitternachtsformel.getContentPane().setBackground(Color.DARK_GRAY);
		frmMitternachtsformel.setBounds(100, 100, 450, 300);
		frmMitternachtsformel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMitternachtsformel.getContentPane().setLayout(null);
		frmMitternachtsformel.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 88, 414, 33);
		frmMitternachtsformel.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Mitternachtsformel");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(10, 44, 414, 33);
		frmMitternachtsformel.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("a:");
		lblNewLabel_1.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_1);
		
		a = new JTextField();
		panel_1.add(a);
		a.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("b:");
		lblNewLabel_2.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_2);
		
		b = new JTextField();
		panel_1.add(b);
		b.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("c:");
		lblNewLabel_3.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_3);
		
		c = new JTextField();
		panel_1.add(c);
		c.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(10, 231, 414, 33);
		frmMitternachtsformel.getContentPane().add(panel_3);
		
		JButton btnNewButton_1 = new JButton("Zur\u00FCck zum Men\u00FC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu menu = new menu();
				menu.main(null);
				frmMitternachtsformel.dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnNewButton_1.setBackground(Color.GRAY);
		panel_3.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(10, 132, 414, 88);
		frmMitternachtsformel.getContentPane().add(panel_2);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
		panel_2.add(lblNewLabel);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setVisible(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String as = a.getText();
				Double a = Double.parseDouble(as);
				String bs = b.getText();
				Double b = Double.parseDouble(bs);
				String cs = c.getText();
				Double c = Double.parseDouble(cs);
				
				lblNewLabel.setVisible(true);
				System.out.println(a + " " + b + " " + c);
				
				
				double y = Math.sqrt((b * b) - (4*a*c));
				double x1 = (-b + y)/(2*a);
				System.out.println("x1 = "+x1);
				double x2 = (-b - y)/(2*a);
				System.out.println("x2 = "+x2);
				
				lblNewLabel.setText("x1: " + x1 + "          x2: " + x2);
				
			}
		});
	}
}
