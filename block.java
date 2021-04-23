import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException; 

public class block {
    private String hash;
    private String previousHash;
    private String data;
    private long timeStamp;
 	
    String calculateBlockHash(){
      String message = data+previousHash+Long.toString(timeStamp);
      try{
      	MessageDigest md = MessageDigest.getInstance("SHA-256");
      	md.update(message.getBytes());
      	}
      catch(NoSuchAlgorithmException ex){
      	System.out.println(ex);
      }
      byte[] bytes= md.digest(); 
      StringBuffer buffer = new StringBuffer();
      for(byte b : bytes) {
        buffer.append(String.format("%02x", b));
      }
      return buffer.toString();
    }

    public block(String data, String previousHash, long timeStamp) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = timeStamp;
        calculateBlockHash();
    }
}