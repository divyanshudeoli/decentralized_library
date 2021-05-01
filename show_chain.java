package source;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.*;

public class show_chain extends JFrame implements ActionListener {

    private JPanel contentPane;
 	private JTextField textFieldbid1,textFieldbid2,textFieldbid3,textFieldbid4;
 	private JTextField textFieldhash1,textFieldhash2,textFieldhash3,textFieldhash4;
    private JButton  b1;
    private static int uid;


    public static void main(String[] args) {
        //new show_chain(uid).setVisible(true);
    }

    public show_chain(int uid) {
    	this.uid=uid;
        setBounds(600, 300, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	    contentPane.setBackground(new Color(76, 133, 199));
		contentPane.setLayout(null);

		JLabel lbldesc = new JLabel("Recent Hashes");
		lbldesc.setForeground(new Color(0,0,0));
		lbldesc.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbldesc.setBounds(220, 5, 222, 66);
		contentPane.add(lbldesc);

		JLabel lblbookid = new JLabel("Sender");
		lblbookid.setForeground(new Color(0,0,0));
		lblbookid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblbookid.setBounds(49, 62, 92, 26);
		contentPane.add(lblbookid);

		JLabel lblhash = new JLabel("Hash");
		lblhash.setForeground(new Color(0,0,0));
		lblhash.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblhash.setBounds(300, 62, 100, 26);
		contentPane.add(lblhash);

		textFieldbid1 =new JTextField();
		textFieldbid1.setBounds(49, 105,70,26);
		textFieldbid1.setFont(new Font("Tahoma",Font.PLAIN,14));
		textFieldbid1.setForeground(new Color(0,0,0));
		contentPane.add(textFieldbid1);
		
		textFieldbid2 =new JTextField();
		textFieldbid2.setBounds(49, 150,70,26);
		textFieldbid2.setFont(new Font("Tahoma",Font.PLAIN,14));
		textFieldbid2.setForeground(new Color(0,0,0));
		contentPane.add(textFieldbid2);
		
		textFieldbid3 =new JTextField();
		textFieldbid3.setBounds(49, 195,70,26);
		textFieldbid3.setFont(new Font("Tahoma",Font.PLAIN,14));
		textFieldbid3.setForeground(new Color(0,0,0));
		contentPane.add(textFieldbid3);

		textFieldbid4 =new JTextField();
		textFieldbid4.setBounds(49, 240,70,26);
		textFieldbid4.setFont(new Font("Tahoma",Font.PLAIN,14));
		textFieldbid4.setForeground(new Color(0,0,0));
		contentPane.add(textFieldbid4);
		
	    textFieldhash1 =new JTextField();
		textFieldhash1.setBounds(150, 105,400,26);
		textFieldhash1.setFont(new Font("Tahoma",Font.PLAIN,14));
		textFieldhash1.setForeground(new Color(0,0,0));
		contentPane.add(textFieldhash1);
		
		textFieldhash2 =new JTextField();
		textFieldhash2.setBounds(150, 150,400,26);
		textFieldhash2.setFont(new Font("Tahoma",Font.PLAIN,14));
		textFieldhash2.setForeground(new Color(0,0,0));
		contentPane.add(textFieldhash2);
		
		textFieldhash3 =new JTextField();
		textFieldhash3.setBounds(150, 195,400,26);
		textFieldhash3.setFont(new Font("Tahoma",Font.PLAIN,14));
		textFieldhash3.setForeground(new Color(0,0,0));
		contentPane.add(textFieldhash3);

		textFieldhash4 =new JTextField();
		textFieldhash4.setBounds(150, 240,400,26);
		textFieldhash4.setFont(new Font("Tahoma",Font.PLAIN,14));
		textFieldhash4.setForeground(new Color(0,0,0));
		contentPane.add(textFieldhash4);

		b1 = new JButton("Back");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		b1.setBounds(260, 289, 120, 50);
		b1.setBackground(Color.BLACK);
	    b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		fill();

    }

    public void fill(){
    	try{
			conn con = new conn();
	        String sql = "select * from blockchain order by id desc limit 4";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			if(rs.next()){
				textFieldbid1.setText(rs.getString(3));
		        textFieldhash1.setText(rs.getString(2));
			}
			if(rs.next()){
				textFieldbid2.setText(rs.getString(3));
		        textFieldhash2.setText(rs.getString(2));
			}
			if(rs.next()){
				textFieldbid3.setText(rs.getString(3));
		        textFieldhash3.setText(rs.getString(2));
			}
			if(rs.next()){
				textFieldbid4.setText(rs.getString(3));
		        textFieldhash4.setText(rs.getString(2));
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
