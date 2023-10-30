package annotataions;
import java.lang.annotation.*;
public class anno {
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface Info {
String authorID(); 
String date(); 
String time(); 
int version(); 
String author() default ""; 
String supervisor() default "";
}
}
