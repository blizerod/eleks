import org.testng.annotations.Test;

public class AppiumTest {

    @Test
    public void appiumTest(){
        new AppiumServerJava().startServer();
    }

    @Test
    public void isRunning(){
        System.out.println(new AppiumServerJava().checkIfServerIsRunnning(4723));
    }

    @Test
    public void closeAppium(){
        new AppiumServerJava().stopServer();
    }
}
