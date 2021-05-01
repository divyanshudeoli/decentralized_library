package source;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

public class request extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField tbookid,tname,tgenre,tpublisher,tpoints,tx,ty,tuid,tauthor,tcontact,tedition,tlang,tcondition,tpg;
    private JButton button1,button2;
    JComboBox comboBox;
    private int uid,bid,ubid,cost;
    

    public request(int uid,int bid) {
        this.uid=uid;
        this.bid=bid;
        setBounds(600, 300, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(76, 133, 199));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l1 = new JLabel("Name");
		l1.setForeground(new Color(0,0,0));
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setBounds(60, 84, 90, 22);
		contentPane.add(l1);

		JLabel l10 = new JLabel("Contact");
		l10.setForeground(new Color(0,0,0));
		l10.setFont(new Font("Tahoma", Font.BOLD, 14));
		l10.setBounds(330, 84, 90, 22);
		contentPane.add(l10);

		JLabel l3 = new JLabel("Publisher");
		l3.setForeground(new Color(0,0,0));
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		l3.setBounds(60, 150, 90, 22);
		contentPane.add(l3);

		JLabel l11 = new JLabel("Edition");
		l11.setForeground(new Color(0,0,0));
		l11.setFont(new Font("Tahoma", Font.BOLD, 14));
		l11.setBounds(330, 150, 90, 22);
		contentPane.add(l11);

		JLabel l2 = new JLabel("Genere");
		l2.setForeground(new Color(0,0,0));
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		l2.setBounds(60, 117, 90, 22);
		contentPane.add(l2);

		JLabel l13 = new JLabel("Author");
		l13.setForeground(new Color(0,0,0));
		l13.setFont(new Font("Tahoma", Font.BOLD, 14));
		l13.setBounds(330, 117, 90, 22);
		contentPane.add(l13);

		JLabel l4 = new JLabel("Points");
		l4.setForeground(new Color(0,0,0));
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setBounds(60, 216, 90, 22);
		contentPane.add(l4);

		JLabel l14 = new JLabel("Lang.");
		l14.setForeground(new Color(0,0,0));
		l14.setFont(new Font("Tahoma", Font.BOLD, 14));
		l14.setBounds(330, 216, 90, 22);
		contentPane.add(l14);

		JLabel l5 = new JLabel("Location: X");
		l5.setForeground(new Color(0,0,0));
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		l5.setBounds(60, 249, 90, 22);
		contentPane.add(l5);

		JLabel l9 = new JLabel("Y");
		l9.setForeground(new Color(0,0,0));
		l9.setFont(new Font("Tahoma", Font.BOLD, 14));
		l9.setBounds(330, 249, 90, 22);
		contentPane.add(l9);

		JLabel l6 = new JLabel("Book_id");
		l6.setForeground(new Color(0,0,0));
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		l6.setBounds(60, 51, 90, 22);
		contentPane.add(l6);
		
		JLabel l8 = new JLabel("User_id");
		l8.setForeground(new Color(0,0,0));
		l8.setFont(new Font("Tahoma", Font.BOLD, 14));
		l8.setBounds(330, 51, 90, 22);
		contentPane.add(l8);

		JLabel l7 = new JLabel("Condition");
		l7.setForeground(new Color(0,0,0));
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));
		l7.setBounds(60, 183, 90, 22);
		contentPane.add(l7);

		JLabel l12 = new JLabel("Pages");
		l12.setForeground(new Color(0,0,0));
		l12.setFont(new Font("Tahoma", Font.BOLD, 14));
		l12.setBounds(330, 183, 90, 22);
		contentPane.add(l12);

		tbookid = new JTextField();
		tbookid.setForeground(new Color(0,0,0));
		tbookid.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tbookid.setBounds(160, 54, 100, 20);
		contentPane.add(tbookid);
		tbookid.setColumns(10);

		tname = new JTextField();
		tname.setForeground(new Color(0,0,0));
		tname.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tname.setColumns(10);
		tname.setBounds(160, 87, 100, 20);
		contentPane.add(tname);

		tgenre = new JTextField();
		tgenre.setForeground(new Color(0,0,0));
		tgenre.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tgenre.setColumns(10);
		tgenre.setBounds(160, 120, 100, 20);
		contentPane.add(tgenre);

		tpublisher = new JTextField();
		tpublisher.setForeground(new Color(0,0,0));
		tpublisher.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tpublisher.setColumns(10);
		tpublisher.setBounds(160, 153, 100, 20);
		contentPane.add(tpublisher);

		tcondition = new JTextField();
		tcondition.setForeground(new Color(0,0,0));
		tcondition.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tcondition.setColumns(10);
		tcondition.setBounds(160, 186, 100, 20);
		contentPane.add(tcondition);

		tpoints = new JTextField();
		tpoints.setForeground(new Color(0,0,0));
		tpoints.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tpoints.setColumns(10);
		tpoints.setBounds(160, 219, 100, 20);
		contentPane.add(tpoints);

		tx = new JTextField();
		tx.setForeground(new Color(0,0,0));
		tx.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tx.setColumns(10);
		tx.setBounds(160, 252, 100, 20);
		contentPane.add(tx);

		
		tuid = new JTextField();
		tuid.setForeground(new Color(0,0,0));
		tuid.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tuid.setBounds(400, 54, 100, 20);
		contentPane.add(tuid);
		tuid.setColumns(10);

		tcontact = new JTextField();
		tcontact.setForeground(new Color(0,0,0));
		tcontact.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tcontact.setColumns(10);
		tcontact.setBounds(400, 87, 100, 20);
		contentPane.add(tcontact);

		tauthor = new JTextField();
		tauthor.setForeground(new Color(0,0,0));
		tauthor.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tauthor.setColumns(10);
		tauthor.setBounds(400, 120, 100, 20);
		contentPane.add(tauthor);		

		tedition = new JTextField();
		tedition.setForeground(new Color(0,0,0));
		tedition.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tedition.setColumns(10);
		tedition.setBounds(400, 153, 100, 20);
		contentPane.add(tedition);

		tlang = new JTextField();
		tlang.setForeground(new Color(0,0,0));
		tlang.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tlang.setColumns(10);
		tlang.setBounds(400, 219, 100, 20);
		contentPane.add(tlang);		

		tpg = new JTextField();
		tpg.setForeground(new Color(0,0,0));
		tpg.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tpg.setColumns(10);
		tpg.setBounds(400, 186, 100, 20);
		contentPane.add(tpg);

		ty = new JTextField();
		ty.setForeground(new Color(0,0,0));
		ty.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		ty.setColumns(10);
		ty.setBounds(400, 252, 100, 20);
		contentPane.add(ty);

	    button1 = new JButton("Request");
		button1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
	    button1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		button1.setBounds(180, 300, 108, 33);
	    button1.setBackground(Color.BLACK);
	    button1.setForeground(Color.WHITE);
		contentPane.add(button1);
		button1.addActionListener(this);

		button2 = new JButton("Back");
		button2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
		button2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		button2.setBounds(330, 300, 108, 33);
	    button2.setBackground(Color.BLACK);
	    button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		contentPane.add(button2);

		fillbookdetails();
		filluserdetails();
    }

    public void fillbookdetails(){
    	try{
    		conn con=new conn();
    		String sql="select * from book where Book_id=?";
    		String sbid=String.valueOf(bid);
    		PreparedStatement st = con.c.prepareStatement(sql);
			st.setString(1,sbid);
			ResultSet rs=st.executeQuery();
			if(rs.next()){
				tbookid.setText(rs.getString(1));
				tname.setText(rs.getString(2));
				tgenre.setText(rs.getString(3));
				tpublisher.setText(rs.getString(4));
				tcondition.setText(rs.getString(5));
				tpoints.setText(rs.getString(6));
				cost=rs.getInt(6);
				tuid.setText(rs.getString(7));
				ubid=rs.getInt(7);
				tauthor.setText(rs.getString(8));
				tedition.setText(rs.getString(10));
				tpg.setText(rs.getString(11));
				tlang.setText(rs.getString(12));
			}
			else JOptionPane.showMessageDialog(null, "Error");
    	}
    	catch(Exception e){System.out.println(e);}
    }

    public void filluserdetails(){
    	try{
    		conn con2=new conn();
    		String sql="select contactno,x,y from user where User_id=?";
    		String subid=String.valueOf(ubid);
    		PreparedStatement st = con2.c.prepareStatement(sql);
			st.setString(1,subid);
			ResultSet rs=st.executeQuery();
			if(rs.next()){
				tcontact.setText(rs.getString(1));
				tx.setText(rs.getString(2));
				ty.setText(rs.getString(3));
			}
			else JOptionPane.showMessageDialog(null, "Not linked to valid user");
    	}
    	catch(Exception e){System.out.println(e);}
    }


    public void actionPerformed(ActionEvent ae){
    		if(ae.getSource()==button1){
   				transaction tran = new transaction(uid,bid,cost,ubid);
    		}

	    	if(ae.getSource()==button2){
	    		this.setVisible(false);
	    		search sear=new search(uid); 
	    		sear.setVisible(true);
	    	}
    	}

    public static void main(String[] args) {
    } 
}