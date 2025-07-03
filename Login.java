package samplePrj;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JLabel lblPassword;
	private JPasswordField txtPassword;
	private JLabel lblImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Enter User Name:");
	lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(134, 27, 135, 40);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtName.setBounds(281, 27, 145, 40);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		lblPassword = new JLabel("Enter Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(134, 94, 135, 40);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPassword.setBounds(281, 94, 145, 40);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtName.getText().equals("Admin") && txtPassword.getText().equals("@123"))
					JOptionPane.showMessageDialog(null, "Login successfully!!!");
				else if(txtName.getText().equals("User") && txtPassword.getText().equals("u456")) {
					JOptionPane.showMessageDialog(null, "Login successfully!!!");
					
					ViewShopList viewShop = new ViewShopList();
					viewShop.setVisible(true);
					
					dispose();
				}
				else {
	              JOptionPane.showMessageDialog(null, "User name or Password is incorrect.");
				}
			}
		});
		btnLogin.setBackground(new Color(34, 139, 34));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBounds(36, 186, 121, 41);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(null);
				txtPassword.setText(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBackground(new Color(34, 139, 34));
		btnCancel.setBounds(273, 186, 121, 41);
		contentPane.add(btnCancel);
		
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(Login.class.getResource("/img/user.png")));
		lblImage.setBounds(10, 21, 114, 113);
		contentPane.add(lblImage);
	}
}
