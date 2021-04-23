import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class AddBook extends JFrame {

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6,t11,t12,t13,t14,t15,t16,t17;
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

		t1 = new JTextField();
		t1.setForeground(new Color(0,0,0));
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t1.setBounds(160, 54, 100, 20);
		contentPane.add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setForeground(new Color(0,0,0));
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t2.setColumns(10);
		t2.setBounds(160, 87, 100, 20);
		contentPane.add(t2);

		t3 = new JTextField();
		t3.setForeground(new Color(0,0,0));
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t3.setColumns(10);
		t3.setBounds(160, 120, 100, 20);
		contentPane.add(t3);

		t4 = new JTextField();
		t4.setForeground(new Color(0,0,0));
		t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t4.setColumns(10);
		t4.setBounds(160, 153, 100, 20);
		contentPane.add(t4);

		t5 = new JTextField();
		t5.setForeground(new Color(0,0,0));
		t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t5.setColumns(10);
		t5.setBounds(160, 219, 100, 20);
		contentPane.add(t5);

		t6 = new JTextField();
		t6.setForeground(new Color(0,0,0));
		t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t6.setColumns(10);
		t6.setBounds(160, 252, 100, 20);
		contentPane.add(t6);


		t11 = new JTextField();
		t11.setForeground(new Color(0,0,0));
		t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t11.setBounds(400, 54, 100, 20);
		contentPane.add(t11);
		t11.setColumns(10);

		t12 = new JTextField();
		t12.setForeground(new Color(0,0,0));
		t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t12.setColumns(10);
		t12.setBounds(400, 87, 100, 20);
		contentPane.add(t12);

		t13 = new JTextField();
		t13.setForeground(new Color(0,0,0));
		t13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t13.setColumns(10);
		t13.setBounds(400, 120, 100, 20);
		contentPane.add(t13);

		t14 = new JTextField();
		t14.setForeground(new Color(0,0,0));
		t14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t14.setColumns(10);
		t14.setBounds(400, 153, 100, 20);
		contentPane.add(t14);

		t15 = new JTextField();
		t15.setForeground(new Color(0,0,0));
		t15.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t15.setColumns(10);
		t15.setBounds(400, 219, 100, 20);
		contentPane.add(t15);

		t16 = new JTextField();
		t16.setForeground(new Color(0,0,0));
		t16.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t16.setColumns(10);
		t16.setBounds(400, 252, 100, 20);
		contentPane.add(t16);

		t17 = new JTextField();
		t17.setForeground(new Color(0,0,0));
		t17.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t17.setColumns(10);
		t17.setBounds(400, 186, 100, 20);
		contentPane.add(t17);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "New", "Fine", "Very Good",
															 "Good", "Fair", "Poor", "Very Poor"}));
		comboBox.setBounds(160, 186, 100, 20);
		contentPane.add(comboBox);

	    button1 = new JButton("Add");
		button1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
	    button1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		button1.setBounds(180, 300, 60, 33);
	    button1.setBackground(Color.BLACK);
	    button1.setForeground(Color.WHITE);
		contentPane.add(button1);

		button2 = new JButton("Back");
		button2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
		button2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		button2.setBounds(330, 300, 108, 33);
	    button2.setBackground(Color.BLACK);
	    button2.setForeground(Color.WHITE);

		contentPane.add(button2);
		random();
    }

    public static void main(String[] args) {
		new AddBook().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
		t1.setText("" + rd.nextInt(10000 + 1));
    }
   
}