package store.xianglin.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import store.xianglin.dubbo.api.service.HelloService;

/**
 * @author xianglin
 */
public class ConsumerApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        HelloService helloService = context.getBean("helloService", HelloService.class);
        String sayHello = helloService.sayHello("ConsumerApplication");
        System.out.println(sayHello);
    }
}
