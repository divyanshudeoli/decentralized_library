import java.awt.*;
import javax.swing.*;

public class login extends JFrame {

	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
    private JButton button1,button2,button3;


	public login() {
            
	setBackground(new Color(169, 169, 169));	
    setBounds(600, 300, 600, 400);
		
    panel = new JPanel();
	panel.setBackground(new Color(76, 133, 199));
	setContentPane(panel);
	panel.setLayout(null);

	JLabel l1 = new JLabel("Username : ");
	l1.setBounds(124, 89, 95, 24);
	panel.add(l1);

	JLabel l2 = new JLabel("Password : ");
	l2.setBounds(124, 124, 95, 24);
	panel.add(l2);

	textField = new JTextField();
	textField.setBounds(210, 93, 157, 20);
	panel.add(textField);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(210, 128, 157, 20);
	panel.add(passwordField);

	JLabel l3 = new JLabel("");
	l3.setBounds(377, 79, 46, 34);
	panel.add(l3);

	JLabel l4 = new JLabel("");
	l4.setBounds(377, 124, 46, 34);
	panel.add(l3);

	button1 = new JButton("Login");
	            
	button1.setForeground(new Color(46, 139, 87));
	button1.setBackground(new Color(250, 250, 210));
	button1.setBounds(149, 181, 113, 39);
	panel.add(button1);
		
    button2 = new JButton("SignUp");
	
	button2.setForeground(new Color(139, 69, 19));
	button2.setBackground(new Color(255, 235, 205));
	button2.setBounds(289, 181, 113, 39);
	panel.add(button2);

	button3 = new JButton("Forgot Password");
	
    button3.setForeground(new Color(205, 92, 92));
	button3.setBackground(new Color(253, 245, 230));
	button3.setBounds(199, 231, 179, 39);
	panel.add(button3);

	JLabel l5 = new JLabel("Trouble in Login?");
	l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
	l5.setForeground(new Color(255, 0, 0));
	l5.setBounds(70, 240, 130, 20);
	panel.add(l5);

	}
        
        
  	public static void main(String[] args) {
        new login().setVisible(true);
	}

}