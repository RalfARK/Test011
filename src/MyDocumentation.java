import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyDocumentation {
    String author() default "Autor domyslny";
    String comment();
}
