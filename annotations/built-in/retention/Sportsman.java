import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS) @interface Flier {}

@Retention(RetentionPolicy.RUNTIME) @interface Swimmer {}
