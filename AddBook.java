package source;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

public class AddBook extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField tbookid,tname,tgenre,tpublisher,tprice,tx,tuid,tauthor,tisbn,tedition,tlang,ty,tpg;
    private JButton button1,button2;
    JComboBox comboBox;
    

    public AddBook() {
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

		JLabel l10 = new JLabel("Author");
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

		JLabel l13 = new JLabel("ISBN");
		l13.setForeground(new Color(0,0,0));
		l13.setFont(new Font("Tahoma", Font.BOLD, 14));
		l13.setBounds(330, 117, 90, 22);
		contentPane.add(l13);

		JLabel l4 = new JLabel("Price");
		l4.setForeground(new Color(0,0,0));
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setBounds(60, 216, 90, 22);
		contentPane.add(l4);

		JLabel l14 = new JLabel("Lang.");
		l14.setForeground(new Color(0,0,0));
		l14.setFont(new Font("Tahoma", Font.BOLD, 14));
		l14.setBounds(330, 216, 90, 22);
		contentPane.add(l14);

		/*JLabel l5 = new JLabel("Location: X");
		l5.setForeground(new Color(0,0,0));
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		l5.setBounds(60, 249, 90, 22);
		contentPane.add(l5);

		JLabel l9 = new JLabel("Y");
		l9.setForeground(new Color(0,0,0));
		l9.setFont(new Font("Tahoma", Font.BOLD, 14));
		l9.setBounds(330, 249, 90, 22);
		contentPane.add(l9);*/

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

		tprice = new JTextField();
		tprice.setForeground(new Color(0,0,0));
		tprice.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tprice.setColumns(10);
		tprice.setBounds(160, 219, 100, 20);
		contentPane.add(tprice);

		/*tx = new JTextField();
		tx.setForeground(new Color(0,0,0));
		tx.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tx.setColumns(10);
		tx.setBounds(160, 252, 100, 20);
		contentPane.add(tx);*/


		tuid = new JTextField();
		tuid.setForeground(new Color(0,0,0));
		tuid.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tuid.setBounds(400, 54, 100, 20);
		contentPane.add(tuid);
		tuid.setColumns(10);

		tauthor = new JTextField();
		tauthor.setForeground(new Color(0,0,0));
		tauthor.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tauthor.setColumns(10);
		tauthor.setBounds(400, 87, 100, 20);
		contentPane.add(tauthor);

		tisbn = new JTextField();
		tisbn.setForeground(new Color(0,0,0));
		tisbn.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tisbn.setColumns(10);
		tisbn.setBounds(400, 120, 100, 20);
		contentPane.add(tisbn);

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

		/*ty = new JTextField();
		ty.setForeground(new Color(0,0,0));
		ty.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		ty.setColumns(10);
		ty.setBounds(400, 252, 100, 20);
		contentPane.add(ty);*/

		tpg = new JTextField();
		tpg.setForeground(new Color(0,0,0));
		tpg.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		tpg.setColumns(10);
		tpg.setBounds(400, 186, 100, 20);
		contentPane.add(tpg);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "New", "Fine", "Very Good",
															 "Good", "Fair", "Poor", "Very Poor"}));
		comboBox.setBounds(160, 186, 100, 20);
		contentPane.add(comboBox);

	    button1 = new JButton("Add");
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
		random();
    }

    public void actionPerformed(ActionEvent ae){
    	try{
    		conn con=new conn();
    		if(ae.getSource()==button1){

    			String sql = "insert into book(Book_id, Name, ISBN, Publisher,Condit, Price, Pages, User_id, Genre, Language, Author, Edition) values(?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, tbookid.getText());
				st.setString(2, tname.getText());
				st.setString(3, tisbn.getText());
				st.setString(4, tpublisher.getText());
				st.setString(5, (String) comboBox.getSelectedItem());
				st.setString(6, tprice.getText());
				st.setString(7, tpg.getText());
				st.setString(8, tuid.getText());
				st.setString(9, tgenre.getText());
				st.setString(10, tlang.getText());
				st.setString(11, tauthor.getText());
				st.setString(12, tedition.getText());
				


				int rs = st.executeUpdate();
				if (rs > 0)
		                    JOptionPane.showMessageDialog(null, "Successfully Added");
				else
		                    JOptionPane.showMessageDialog(null, "Error");
		                tuid.setText("");
		                tbookid.setText("");
		                tauthor.setText("");
		                tedition.setText("");
		                tpg.setText("");
		                tprice.setText("");
		                tpublisher.setText("");
		                tlang.setText("");
		                tgenre.setText("");
		                tisbn.setText("");
		                tname.setText("");
				st.close();

    		}
    	if(ae.getSource()==button2){
    		this.setVisible(false);
    		new menu().setVisible(true);
    	}

    	}
    	catch(Exception e){System.out.println(e);}
    }

    public static void main(String[] args) {
		new AddBook().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
		tbookid.setText("" + rd.nextInt(10000 + 1));
    }
   
}