import java.net.*;

class App {
  public static void main(String[] args) {
    try {
      InetAddress inetAddress = InetAddress.getLocalHost();

      System.out.println("Computer name       : " + inetAddress.getHostName());
      System.out.println("IP Address Local    : " + inetAddress.getHostAddress());
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }
}
