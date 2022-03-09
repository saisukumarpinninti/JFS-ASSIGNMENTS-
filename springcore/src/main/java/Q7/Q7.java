package Q7;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q7 {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q7.xml");
		Customer c1 = (Customer) context.getBean("Customer0");
		Customer c2 = (Customer) context.getBean("Customer1");
		System.out.println(c1);
		System.out.println(c2);
		context.close();
	}

}
