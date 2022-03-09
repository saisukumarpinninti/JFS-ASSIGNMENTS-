package Q10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class q10main {
	 public static void main( String[] args ){
		    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Q10.xml");
		    hi c = (hi) q10.getBean("c");
		    c.hello();
		    context.close(); 
		  }
}
