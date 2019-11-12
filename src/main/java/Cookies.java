@ControlledObject(name = "bisquits")
public class Cookies {

    public Cookies() throws ClassNotFoundException {
    }

    @StartObject()
    public void createCookies(){
        System.out.println("create cookies");
    }

    @StopObject
    public void stopCookies(){
        System.out.println("stop cookies");
    }

    Class cl = Class.forName("Cookies");
}
