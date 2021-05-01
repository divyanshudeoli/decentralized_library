package source;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class transaction{
 	private static int uid,bid,cost,ubid;
 	public transaction(int uid,int bid,int cost,int ubid){
 		this.uid=uid;
 		this.ubid=ubid;
 		this.cost=cost;
 		this.bid=bid;
 		try{
    		conn con=new conn();
    		String sql="select points from user where User_id=?";
    		String suid=String.valueOf(uid);
    		PreparedStatement st = con.c.prepareStatement(sql);
			st.setString(1,suid);
			ResultSet rs=st.executeQuery();
			if(rs.next()){
				int balance=rs.getInt(1);
				if(balance>=cost){
					String sql2="update user set points=? where user_id=?";
					String bc=String.valueOf(balance-cost);
					PreparedStatement st2=con.c.prepareStatement(sql2);
					st2.setString(1,bc);
					st2.setString(2,suid);
					int rs2=st2.executeUpdate();

					String sql3="delete from book where book_id=?";
					String sbid=String.valueOf(bid);
					PreparedStatement st3=con.c.prepareStatement(sql3);
					st3.setString(1,sbid);
					int rs3=st3.executeUpdate();
					
					String sql4="insert into transaction values(?,?,?,?)";
					PreparedStatement st4=con.c.prepareStatement(sql4);
					st4.setString(1,String.valueOf(bid));
					st4.setString(2,String.valueOf(ubid));
					st4.setString(3,String.valueOf(uid));
					st4.setString(4,String.valueOf(cost));
					int rs4=st4.executeUpdate();
					
					if(rs2>0 && rs3>0 && rs4>0){
						block b=new block(""+bid+""+ubid+""+uid+""+cost,bid);
						JOptionPane.showMessageDialog(null,"Sucessfully Alloted");
					}
				}
				else JOptionPane.showMessageDialog(null, "Not enough points");
			}
			else JOptionPane.showMessageDialog(null, "Error in connecting database");

    	}
		catch(Exception e){System.out.println(e);}
 	}

 	public static void main(String[] args) {
 	}
 }