package store.xianglin.dubbo.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import store.xianglin.dubbo.api.service.HelloService;

/**
 * @author xianglin
 */
public class ApiApplication {

    public static void main(String[] args) {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("consumer");
        applicationConfig.setOwner("xianglin");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://localhost:2181");

        ReferenceConfig<HelloService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(HelloService.class);

        HelloService helloService = referenceConfig.get();
        helloService.sayHello("ApiApplication");
    }
}
