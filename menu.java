package source;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.event.*;


public class menu extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton bvalid,bchain,bsearch,bprofile,baddbook;

    public menu() {
        setBounds(600, 300, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(76, 133, 199));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		bvalid = new JButton("Validate");
		bvalid.addActionListener(this);
		bvalid.setFont(new Font("Tahoma", Font.BOLD, 15));
		bvalid.setBounds(40, 80, 136, 65);
	    bvalid.setBackground(Color.BLACK);
	    bvalid.setForeground(Color.WHITE);
		contentPane.add(bvalid);

		bchain = new JButton("View Chain");
		bchain.addActionListener(this);
		bchain.setFont(new Font("Tahoma", Font.BOLD, 15));
		bchain.setBounds(230, 80, 136, 65);
	    bchain.setBackground(Color.BLACK);
	    bchain.setForeground(Color.WHITE);
		contentPane.add(bchain);

		bprofile = new JButton("View Profile");
		bprofile.addActionListener(this);
		bprofile.setFont(new Font("Tahoma", Font.BOLD, 15));
		bprofile.setBounds(420, 80, 136, 65);
	    bprofile.setBackground(Color.BLACK);
	    bprofile.setForeground(Color.WHITE);
		contentPane.add(bprofile);

		baddbook = new JButton("Add Book");
		baddbook.addActionListener(this);
		baddbook.setFont(new Font("Tahoma", Font.BOLD, 15));
		baddbook.setBounds(120, 230, 136, 65);
	    baddbook.setBackground(Color.BLACK);
	    baddbook.setForeground(Color.WHITE);
		contentPane.add(baddbook);

		bsearch = new JButton("Search Book");
		bsearch.addActionListener(this);
		bsearch.setFont(new Font("Tahoma", Font.BOLD, 15));
		bsearch.setBounds(330, 230, 136, 65);
	    bsearch.setBackground(Color.BLACK);
	    bsearch.setForeground(Color.WHITE);
		contentPane.add(bsearch);
	}
	public void actionPerformed(ActionEvent ae){
    	try{
    		if(ae.getSource()==baddbook){
    			this.setVisible(false);
    			new AddBook().setVisible(true);
    		}
    		if(ae.getSource()==bprofile){
    			this.setVisible(false);
    			new profile(1).setVisible(true);
    		}
    		if(ae.getSource()==bsearch){
    			this.setVisible(false);
    			new search().setVisible(true);
    		}
    		

    	}
    	catch(Exception e){System.out.println(e);}

    	}

    	public static void main(String[] args) {
		new menu().setVisible(true);
    }
}
