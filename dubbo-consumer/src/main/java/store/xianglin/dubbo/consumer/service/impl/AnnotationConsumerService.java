package store.xianglin.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import store.xianglin.dubbo.api.service.HelloAnnotationService;

/**
 * @author xianglin
 */
@Component
public class AnnotationConsumerService {
    /**
     * 通过 Reference 引用服务
     */
    @Reference
    private HelloAnnotationService helloAnnotationService;

    public void sayHello() {
        System.out.println(helloAnnotationService.sayHelloAnnotation("AnnotationConsumerService"));
    }
}
