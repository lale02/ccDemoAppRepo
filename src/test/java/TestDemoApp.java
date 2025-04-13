import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestDemoApp {
  String msg = "CodeBuild";    
  DemoApp demoApp = new DemoApp(msg);
   
  @Test
  public void testLogMsg() {
    msg = "Hello " + "CodeBuild";      
    assertEquals(msg,demoApp.logMsg());
  }
}