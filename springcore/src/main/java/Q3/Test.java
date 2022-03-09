package Q3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q3.xml");

        BankAccountController controller = (BankAccountController)context.getBean("controller");

        System.out.println(controller.getBalance(2000));
        System.out.println(controller.deposit(2000,5000));
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(controller.withdraw(2000,5000));
        System.out.println(controller.getBalance(2000));
        
        System.out.println("_______________");
        System.out.println(controller.fundTransfer(2000,2001,5000));
        System.out.println(controller.getBalance(2000));
        System.out.println(controller.getBalance(2001));
        context.close();
       
    }
}