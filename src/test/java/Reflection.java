import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) {
        Class<LazyService> lazyServiceClass = LazyService.class;
        int modifiers = lazyServiceClass.getModifiers();
        System.out.println(modifiers);
        Class<? super LazyService> superclass = lazyServiceClass.getSuperclass();
        System.out.println(superclass);
        Class<?>[] interfaces = lazyServiceClass.getInterfaces();
        System.out.println(interfaces);
        Method[] methods = lazyServiceClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getParameterTypes());
        }

        System.out.println("new String");

    }


}
