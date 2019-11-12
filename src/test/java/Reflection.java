import java.lang.reflect.Method;
import java.sql.SQLOutput;

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

        System.out.println("String from rule branch");

        System.out.println("Dev branch");
        System.out.println("new String");

        System.out.println("Third commit");


    }


}
