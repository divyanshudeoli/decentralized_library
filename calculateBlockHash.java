public String calculateBlockHash() {
    String dataToHash = previousHash 
      + Long.toString(timeStamp) 
      + Integer.toString(nonce) 
      + data;
    MessageDigest digest = null;
    byte[] bytes = null;
    try {
        digest = MessageDigest.getInstance("SHA-256");
        bytes = digest.digest(dataToHash.getBytes(UTF_8));
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
        logger.log(Level.SEVERE, ex.getMessage());
    }
    StringBuffer buffer = new StringBuffer();
    for (byte b : bytes) {
        buffer.append(String.format("%02x", b));
    }
    return buffer.toString();
}