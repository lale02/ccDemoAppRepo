public class DemoApp {
  private String msg;

  public DemoApp(String msg) {
    this.msg = msg;
  }

  public String logMsg() {
    msg = "Hello " + msg;
    System.out.println(msg);
    return msg;
  }
}