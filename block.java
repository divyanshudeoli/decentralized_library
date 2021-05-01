package source;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException; 
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class block {
    private static String hash;
    private static String previousHash;
    private static String data;
    private static String timeStamp;
    private int book_id;
 	
    String calculateBlockHash(){
        String message = data+previousHash+timeStamp;
        StringBuffer buffer = new StringBuffer();
        try{
            	MessageDigest md = MessageDigest.getInstance("SHA-256");
            	md.update(message.getBytes());
              byte[] bytes= md.digest(); 
              for(byte b : bytes)
                buffer.append(String.format("%02x", b));
        }
        catch(NoSuchAlgorithmException ex){ System.out.println(ex);}
    return buffer.toString();
    }

    public block(String data,int book_id) {
          this.data = data;
          this.book_id=book_id;
          try{
              conn con = new conn();
              String sql="select hash from blockchain where id=(select max(id) from blockchain)";
              PreparedStatement st = con.c.prepareStatement(sql);
              ResultSet rs=st.executeQuery();
              if(rs.next()){JOptionPane.showMessageDialog(null,"Sucessfull");
              this.previousHash = rs.getString(1);}
              }
          catch(Exception e){System.out.println(e);}
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");  
          LocalDateTime now = LocalDateTime.now();  
          this.timeStamp = dtf.format(now);
          hash=calculateBlockHash();
          storehash();
    }

    public void storehash(){
        try{
              conn con = new conn();
              String sql="insert into blockchain(hash,Book_id) values (?,?)";
              PreparedStatement st = con.c.prepareStatement(sql);
              st.setString(1,hash);
              st.setString(2,String.valueOf(book_id));
              int rs=st.executeUpdate();
              if(rs>0){JOptionPane.showMessageDialog(null,"Added to blockchain");}
              st.close();
          }
        catch(Exception e){System.out.println(e);}
    }

    public static void main(String[] args) {
      //block b=new block(data);
    }
}