package source;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException; 


public class signup extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField textFieldid,textFieldname,textFieldpassword,textFieldcontact,
    						textFieldpassphrase, textFieldx, textFieldy;
    private JButton b1, b2;
    private JComboBox comboBox;
    private int id;

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

	    textFieldpassphrase = new JTextField();
		textFieldpassphrase.setBounds(265, 202, 148, 20);
		contentPane.add(textFieldpassphrase);
		textFieldpassphrase.setColumns(10);

	    textFieldid = new JTextField();
		textFieldid.setBounds(265, 91, 148, 20);
		contentPane.add(textFieldid);
		textFieldid.setColumns(10);

		textFieldname = new JTextField();
		textFieldname.setColumns(10);
		textFieldname.setBounds(265, 128, 148, 20);
		contentPane.add(textFieldname);

	    textFieldpassword = new JTextField();
		textFieldpassword.setColumns(10);
		textFieldpassword.setBounds(265, 165, 148, 20);
		contentPane.add(textFieldpassword);

		textFieldcontact = new JTextField();
		textFieldcontact.setColumns(10);
		textFieldcontact.setBounds(265, 239, 148, 20);
		contentPane.add(textFieldcontact);

		textFieldx = new JTextField();
		textFieldx.setColumns(10);
		textFieldx.setBounds(235, 49, 118, 20);
		contentPane.add(textFieldx);
		
		textFieldy = new JTextField();
		textFieldy.setColumns(10);
		textFieldy.setBounds(360, 49, 118, 20);
		contentPane.add(textFieldy);

		b1 = new JButton("Create");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		b1.setBounds(140, 289, 100, 30);
	    b1.setBackground(Color.BLACK);
	    b1.setForeground(Color.WHITE);
		contentPane.add(b1);

		b2 = new JButton("Back");
		b2.addActionListener(this);
		b2.setFont(new Font("Tahoma", Font.BOLD, 13));
		b2.setBounds(300, 289, 100, 30);
		b2.setBackground(Color.BLACK);
	    b2.setForeground(Color.WHITE);
		contentPane.add(b2);
		addid();
    }

    public void addid() {
        try{
        	conn con1=new conn();
        	String sql="select max(User_id) from user";
        	PreparedStatement st1=con1.c.prepareStatement(sql);
        	ResultSet rs=st1.executeQuery();
        	if(rs.next()){
        		id =rs.getInt(1);
        		id++;
        		textFieldid.setText(""+id);
        	}
        }catch(Exception e){System.out.println(e);}
    }
    
    String calculateBlockHash(String message){
        StringBuffer buffer = new StringBuffer();
        try{
            	MessageDigest md = MessageDigest.getInstance("MD5");
            	md.update(message.getBytes());
              byte[] bytes= md.digest(); 
              for(byte b : bytes)
                buffer.append(String.format("%02x", b));
        }
        catch(NoSuchAlgorithmException ex){ System.out.println(ex);}
    return buffer.toString();
    }

    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            
            if(ae.getSource() == b1){
                String sql = "insert into user values (?, ?, ?, ?, ?, ?, ?, 0)";
				PreparedStatement st = con.c.prepareStatement(sql);

				st.setString(1, textFieldid.getText());
		        st.setString(2, textFieldname.getText());
				st.setString(3, calculateBlockHash(textFieldpassword.getText()));
				System.out.println(calculateBlockHash(textFieldpassword.getText()));
				st.setString(4, textFieldpassphrase.getText());
				st.setString(5, textFieldcontact.getText());
				st.setString(6, textFieldx.getText());
				st.setString(7, textFieldy.getText());

				int i = st.executeUpdate();
				if (i > 0){
		            JOptionPane.showMessageDialog(null, "successfully Created");
		                }
		        textFieldid.setText("");
		        textFieldname.setText("");
				textFieldpassword.setText("");
				textFieldcontact.setText("");
				textFieldx.setText("");
		        textFieldpassphrase.setText("");
		        textFieldy.setText("");
		         }

		    if(ae.getSource() == b2){
		            this.setVisible(false);
					new login().setVisible(true);
		        }
		        }catch(Exception e){}
    		}
}
