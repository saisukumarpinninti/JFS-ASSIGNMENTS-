package Q1;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q1 {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q1.xml");
		Customer c1 = (Customer) context.getBean("Customer");
		System.out.println(c1);
		context.close();
	}

}
