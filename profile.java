package source;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.*;

public class profile extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField tFuid;
    private JTextField tFuname;
    private JPasswordField tFpassword;
    private JTextField tFcontact;
    private JTextField tFcoins;
    private JTextField tFX;
    private JTextField tFY;
    private JButton  b1;
    private JComboBox comboBox;
    private int uid=1;


    public static void main(String[] args) {
        //new profile(uid).setVisible(true);
    }

    public profile(int uid) {
    	this.uid=uid;
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

		JLabel lblcoins = new JLabel("Coins:");
		lblcoins.setForeground(new Color(0,0,0));
		lblcoins.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblcoins.setBounds(99, 197, 140, 26);
		contentPane.add(lblcoins);

	    tFcoins = new JTextField();
		tFcoins.setBounds(265, 202, 148, 20);
		contentPane.add(tFcoins);
		tFcoins.setColumns(10);

	    tFuid = new JTextField();
		tFuid.setBounds(265, 91, 148, 20);
		contentPane.add(tFuid);
		tFuid.setColumns(10);

		tFuname = new JTextField();
		tFuname.setColumns(10);
		tFuname.setBounds(265, 128, 148, 20);
		contentPane.add(tFuname);

	    tFpassword = new JPasswordField();
		tFpassword.setColumns(10);
		tFpassword.setBounds(265, 165, 148, 20);
		contentPane.add(tFpassword);

		tFcontact = new JTextField();
		tFcontact.setColumns(10);
		tFcontact.setBounds(265, 239, 148, 20);
		contentPane.add(tFcontact);

		tFX = new JTextField();
		tFX.setColumns(10);
		tFX.setBounds(235, 49, 118, 20);
		contentPane.add(tFX);
		
		tFY = new JTextField();
		tFY.setColumns(10);
		tFY.setBounds(360, 49, 118, 20);
		contentPane.add(tFY);

		b1 = new JButton("Back");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		b1.setBounds(160, 289, 120, 50);
		b1.setBackground(Color.BLACK);
	    b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		fill();

    }

    public void fill(){
    	try{
			conn con = new conn();
	        String sql = "select * from user where User_id=?";
			PreparedStatement st = con.c.prepareStatement(sql);
			st.setInt(1, uid);
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				int i=rs.getInt(1);
				tFuid.setText(""+i);
		        tFuid.setText(rs.getString(1));
		        tFuname.setText(rs.getString(2));
				tFpassword.setText(rs.getString(3));
				tFcontact.setText(rs.getString(5));
				tFX.setText(rs.getString(6));
				tFY.setText(rs.getString(7));
				tFcoins.setText(rs.getString(8));
			}
		}catch(Exception e){ 
            System.out.println(e);
        }  
    }
  
    public void actionPerformed(ActionEvent ae){
        try{
		    if(ae.getSource() == b1){
		            this.setVisible(false);
					menu m=new menu(uid);
					m.setVisible(true);
		        }
		        }catch(Exception e){}
    		}
}
