package source;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

public class search extends JFrame implements ActionListener{
	private JPanel contentPane;
    private JTextField tdist,tbid,tbname,tauthor;
    private JButton sdist,sbid,sname,sauthor,bback;

    public search(){
    	setBounds(600, 300, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(76, 133, 199));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbid = new JLabel("Book ID");
		lbid.setForeground(new Color(0,0,0));
		lbid.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbid.setBounds(40, 84, 110, 27);
		contentPane.add(lbid);

		JLabel lbname = new JLabel("Book Name");
		lbname.setForeground(new Color(0,0,0));
		lbname.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbname.setBounds(40, 129, 110, 27);
		contentPane.add(lbname);

		JLabel lbauthor = new JLabel("Name");
		lbauthor.setForeground(new Color(0,0,0));
		lbauthor.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbauthor.setBounds(40, 174, 110, 27);
		contentPane.add(lbauthor);

		JLabel lbdist = new JLabel("Distance");
		lbdist.setForeground(new Color(0,0,0));
		lbdist.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbdist.setBounds(40, 219, 110, 27);
		contentPane.add(lbdist);

		tbid = new JTextField();
		tbid.setForeground(new Color(0,0,0));
		tbid.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		tbid.setColumns(10);
		tbid.setBounds(220, 84, 110, 27);
		contentPane.add(tbid);

		tbname = new JTextField();
		tbname.setForeground(new Color(0,0,0));
		tbname.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		tbname.setColumns(10);
		tbname.setBounds(220, 129, 110,27);
		contentPane.add(tbname);

		tauthor = new JTextField();
		tauthor.setForeground(new Color(0,0,0));
		tauthor.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		tauthor.setColumns(10);
		tauthor.setBounds(220, 174, 110,27);
		contentPane.add(tauthor);

		/*tdist = new JTextField();
		tdist.setForeground(new Color(0,0,0));
		tdist.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		tdist.setColumns(10);
		tdist.setBounds(220, 219, 110,27);
		contentPane.add(tdist);*/

		sbid = new JButton("Search");
		sbid.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
	    sbid.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		sbid.setBounds(400, 84, 110, 27);
	    sbid.setBackground(new Color(3, 87, 255));
	    sbid.setForeground(Color.WHITE);
		contentPane.add(sbid);
		sbid.addActionListener(this);

		sname = new JButton("Search");
		sname.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
		sname.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		sname.setBounds(400, 129, 110,27);
	    sname.setBackground(new Color(3, 87, 255));
	    sname.setForeground(Color.WHITE);
		sname.addActionListener(this);
		contentPane.add(sname);

		sauthor = new JButton("Search");
		sauthor.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
	    sauthor.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		sauthor.setBounds(400, 174, 110,27);
	    sauthor.setBackground(new Color(3, 87, 255));
	    sauthor.setForeground(Color.WHITE);
		contentPane.add(sauthor);
		sauthor.addActionListener(this);

		sdist = new JButton("Search");
		sdist.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
		sdist.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		sdist.setBounds(400, 219, 110,27);
	    sdist.setBackground(new Color(3, 87, 255));
	    sdist.setForeground(Color.WHITE);
		sdist.addActionListener(this);
		contentPane.add(sdist);

		bback = new JButton("Back");
		bback.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
		bback.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		bback.setBounds(220, 300, 150, 45);
	    bback.setBackground(Color.BLACK);
	    bback.setForeground(Color.WHITE);
		bback.addActionListener(this);

		contentPane.add(bback);



    }
	public void actionPerformed(ActionEvent ae){
    	try{
    		if(ae.getSource()==bback){
    			this.setVisible(false);
					new menu().setVisible(true);
		        }
		    if(ae.getSource()==)
    		}
    	catch(Exception e){System.out.println(e);}
    }


    public static void main(String[] args) {
    	new search().setVisible(true);
    }

}