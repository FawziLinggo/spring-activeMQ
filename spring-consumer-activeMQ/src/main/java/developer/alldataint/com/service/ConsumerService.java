package developer.alldataint.com.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @JmsListener(destination = "from-kafka" )
    public  void  listener(String name){
        System.out.println("Messgae from QUEUE -  from-kafka is : " + name );
    }
}
