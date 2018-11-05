package springbootdemo.mq;

import org.springframework.jms.annotation.JmsListener;  
import org.springframework.stereotype.Component;  
  
@Component  
public class consumer {  
       
    @JmsListener(destination = "mytest.queue")  
    public void receiveQueue(String text) {  
        System.out.println("Consumer收到的报文为:"+text);  
    }  
}