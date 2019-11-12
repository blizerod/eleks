import java.lang.annotation.*;

@Documented
@Inherited
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Service {
    String name();

    boolean lazyLoad() default false;
}
