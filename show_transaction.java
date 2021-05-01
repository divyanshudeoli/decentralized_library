package source;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.*;

public class show_transaction extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField tFsend;
    private JTextField tFrecv;
    private JTextField tFbid;
    private JTextField tFhash;
    private JTextField tFcoins;
    private JButton  b1;
    private static int uid;


    public static void main(String[] args) {
        //new show_transaction(uid).setVisible(true);
    }

    public show_transaction(int uid) {
    	this.uid=uid;
        setBounds(600, 300, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	    contentPane.setBackground(new Color(76, 133, 199));
		contentPane.setLayout(null);

		JLabel lbldesc = new JLabel("Last Transaction of "+uid);
		lbldesc.setForeground(new Color(0,0,0));
		lbldesc.setFont(new Font("Tahoma", Font.BOLD, 21));
		lbldesc.setBounds(150, 15, 282, 66);
		contentPane.add(lbldesc);

		JLabel lblsender = new JLabel("Sender :");
		lblsender.setForeground(new Color(0,0,0));
		lblsender.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblsender.setBounds(99, 86, 92, 26);
		contentPane.add(lblsender);

		JLabel lblrecv = new JLabel("Receiver :");
		lblrecv.setForeground(new Color(0,0,0));
		lblrecv.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblrecv.setBounds(99, 123, 92, 26);
		contentPane.add(lblrecv);

		JLabel lblbid = new JLabel("Book ID :");
		lblbid.setForeground(new Color(0,0,0));
		lblbid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblbid.setBounds(99, 160, 92, 26);
		contentPane.add(lblbid);

		JLabel lblcoins = new JLabel("Coins :");
		lblcoins.setForeground(new Color(0,0,0));
		lblcoins.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblcoins.setBounds(99, 197, 92, 26);
		contentPane.add(lblcoins);

		JLabel lblhash = new JLabel("Hash :");
		lblhash.setForeground(new Color(0,0,0));
		lblhash.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblhash.setBounds(99, 234, 72, 26);
		contentPane.add(lblhash);

	    tFsend = new JTextField();
		tFsend.setBounds(265, 91, 148, 20);
		contentPane.add(tFsend);
		tFsend.setColumns(10);

		tFrecv = new JTextField();
		tFrecv.setColumns(10);
		tFrecv.setBounds(265, 128, 148, 20);
		contentPane.add(tFrecv);

	    tFbid = new JPasswordField();
		tFbid.setColumns(10);
		tFbid.setBounds(265, 165, 148, 20);
		contentPane.add(tFbid);

		tFcoins = new JTextField();
		tFcoins.setBounds(265, 202, 148, 20);
		contentPane.add(tFcoins);
		tFcoins.setColumns(10);

		tFhash = new JTextField();
		tFhash.setColumns(10);
		tFhash.setBounds(180, 239, 348, 20);
		contentPane.add(tFhash);

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
	        String sql = "select * from transaction,blockchain where (send_uid=? or rec_uid=?) and transaction.book_id=blockchain.book_id;";
			PreparedStatement st = con.c.prepareStatement(sql);
			st.setInt(1, uid);
			st.setInt(2, uid);
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				tFsend.setText(rs.getString(2));
		        tFrecv.setText(rs.getString(3));
				tFbid.setText(rs.getString(1));
				tFhash.setText(rs.getString(6));
				tFcoins.setText(rs.getString(4));
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
