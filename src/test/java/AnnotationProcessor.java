import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AnnotationProcessor {
    static Map<String, Object> serviceMap = new HashMap<>();

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

        loadService("test.java.SimpleService");
        loadService("test.java.LazyService");
        loadService(String.class.getName());
    }

    static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.name());
            System.out.println(ann.lazyLoad());
            Method[] methods = service.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Init.class)) {
                    System.out.println(method.getName() + " has @Init annotation");
                } else {
                    System.out.println(method.getName() + " doesn't has @Init annotation");
                }

            }

        } else {
            System.out.println("Annotation wasn't found " + service.getName());
        }
    }

    static void loadService(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(className);
        if (clazz.isAnnotationPresent(Service.class)) {
            Object serviceObj = clazz.newInstance();
            serviceMap.put(serviceObj.getClass().getSimpleName(), serviceObj);
        }
    }

}
