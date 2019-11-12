@Service(name = "SuperLazyInit")
public class LazyService {

    @Init
    public void lazyInit() throws Exception {
        System.out.println("print 'LazyInit'");
    }
}
