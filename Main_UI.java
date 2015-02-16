import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;


public class Main_UI {

	private JFrame frmDataAnalysisfyp;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_UI window = new Main_UI();
					window.frmDataAnalysisfyp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDataAnalysisfyp = new JFrame();
		frmDataAnalysisfyp.setTitle("Data Analysis-FYP");
		frmDataAnalysisfyp.setBounds(100, 100, 641, 415);
		frmDataAnalysisfyp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDataAnalysisfyp.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frmDataAnalysisfyp.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(37, 96, 409, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("send");
		btnNewButton.setBounds(478, 96, 97, 25);
		panel.add(btnNewButton);
		
		JLabel lblEnterUrl = new JLabel("Enter URL");
		lblEnterUrl.setBounds(37, 67, 56, 16);
		panel.add(lblEnterUrl);
		
		textField_1 = new JTextField();
		textField_1.setBounds(37, 192, 135, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(311, 192, 135, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(37, 164, 117, 16);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(311, 163, 56, 16);
		panel.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(478, 191, 97, 25);
		panel.add(btnLogin);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(37, 244, 544, 111);
		panel.add(textPane);
	}
}
