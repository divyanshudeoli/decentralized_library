import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.*;

public class signup extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JButton b1, b2;
    private JComboBox comboBox;


    public static void main(String[] args) {
        new signup().setVisible(true);
    }

    public signup() {
        setBounds(600, 300, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	    contentPane.setBackground(new Color(76, 133, 199));
		contentPane.setLayout(null);

		JLabel lbllocation = new JLabel("Location :");
		lbllocation.setForeground(new Color(0,0,0));
		lbllocation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbllocation.setBounds(99, 49, 92, 26);
		contentPane.add(lbllocation);

		JLabel lbluid = new JLabel("User_id :");
		lbluid.setForeground(new Color(0,0,0));
		lbluid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbluid.setBounds(99, 86, 92, 26);
		contentPane.add(lbluid);

		JLabel lblName = new JLabel("User_name :");
		lblName.setForeground(new Color(0,0,0));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(99, 123, 92, 26);
		contentPane.add(lblName);

		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(new Color(0,0,0));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(99, 160, 92, 26);
		contentPane.add(lblPassword);

		JLabel lblcontact = new JLabel("Contact No.:");
		lblcontact.setForeground(new Color(0,0,0));
		lblcontact.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblcontact.setBounds(99, 234, 92, 26);
		contentPane.add(lblcontact);

		JLabel lblSecuritypassphrase = new JLabel("Passphrase:");
		lblSecuritypassphrase.setForeground(new Color(0,0,0));
		lblSecuritypassphrase.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSecuritypassphrase.setBounds(99, 197, 140, 26);
		contentPane.add(lblSecuritypassphrase);

	    textField_4 = new JTextField();
		textField_4.setBounds(265, 202, 148, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

	    textField = new JTextField();
		textField.setBounds(265, 91, 148, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(265, 128, 148, 20);
		contentPane.add(textField_1);

	    textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(265, 165, 148, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(265, 239, 148, 20);
		contentPane.add(textField_3);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(235, 49, 118, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(360, 49, 118, 20);
		contentPane.add(textField_6);

		b1 = new JButton("Create");
		//b1.addActionListener(this);
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		b1.setBounds(140, 289, 100, 30);
	    b1.setBackground(Color.BLACK);
	    b1.setForeground(Color.WHITE);
		contentPane.add(b1);

		b2 = new JButton("Back");
		//b2.addActionListener(this);
		b2.setFont(new Font("Tahoma", Font.BOLD, 13));
		b2.setBounds(300, 289, 100, 30);
		b2.setBackground(Color.BLACK);
	    b2.setForeground(Color.WHITE);
		contentPane.add(b2);
		random();
/*
		JPanel panel = new JPanel();
		panel.setForeground(new Color(34, 139, 34));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
		panel.setBounds(31, 46, 476, 296);
	        panel.setBackground(Color.WHITE);
		contentPane.add(panel);*/
    }

    public void random() {
        Random rd = new Random();
		textField.setText("" + rd.nextInt(1000000 + 1));
    }
    
    /*public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            
            if(ae.getSource() == b1){
                String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, textField.getText());
                st.setString(2, textField_1.getText());
		st.setString(3, textField_2.getText());
		st.setString(4, (String) comboBox.getSelectedItem());
		st.setString(5, textField_3.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "successfully Created");
                }

                textField.setText("");
                textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Login_user().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }*/
}
