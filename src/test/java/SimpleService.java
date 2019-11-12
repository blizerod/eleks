@Service(name = "SuperService", lazyLoad = true)
public class SimpleService {

    @Init
    public void initService() {
        System.out.println("print 'SimpleService'");
    }

    public void otherInitService() {
        System.out.println("other method");
    }
}
