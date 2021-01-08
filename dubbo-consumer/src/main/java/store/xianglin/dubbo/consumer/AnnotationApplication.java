package store.xianglin.dubbo.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import store.xianglin.dubbo.consumer.config.DubboConfig;
import store.xianglin.dubbo.consumer.service.impl.AnnotationConsumerService;

import java.io.IOException;

/**
 * @author xianglin
 */
public class AnnotationApplication {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfig.class);
        context.start();
        AnnotationConsumerService service = context.getBean(
                AnnotationConsumerService.class);
        service.sayHello();

    }
}
