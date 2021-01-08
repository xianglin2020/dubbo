package store.xianglin.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import store.xianglin.dubbo.api.service.HelloAnnotationService;

/**
 * Service 用来配置服务提供方
 *
 * @author xianglin
 */
@Service
public class HelloAnnotationServiceImpl implements HelloAnnotationService {
    @Override
    public String sayHelloAnnotation(String word) {
        return "HelloAnnotationServiceImpl " + word;
    }
}
