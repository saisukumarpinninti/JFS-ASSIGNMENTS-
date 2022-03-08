package Q5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class q5Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q5.xml");
		Shape s = (Shape) context.getBean("Dot");
		s.draw();
		Shape si = (Shape) context.getBean("circle");
		si.draw();
		context.close();
}
}
