package Sukumar.consumer;

import Sukumar.config.MessagingConfig;
import Sukumar.model.customer;
import Sukumar.model.transactions;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class customer_service {
    @Autowired
    private transactions Transactions;


    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(customer c) {
        System.out.println("Message recieved from queue : " + c);
        customer customer = Transactions.saveCustomer(c);
    }
}
