package annotataions;
import java.lang.annotation.*;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@interface Info{
	int authorId();
	String author();
	String date();
	String time();
	int version();
}
@Info(
	    authorId = 1,
	    author="priya",
	    date = "2023-10-18",
	    time = "12:00",
	     version = 2
	)
public class Demo {
	@Info(
		    authorId= 3,
		    author = "raj",
		    date = "2023-10-18",
		    time = "10:30:00",
		    version = 3
		)
	private String datafield;
	
	@Info(
		    authorId= 4,
		    author = "arun",
		    date = "2023-10-18",
		    time = "10:30:00",
		    version = 3
		)
	public void method() {
		
	}

}
