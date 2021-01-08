package store.xianglin.dubbo.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import store.xianglin.dubbo.api.service.HelloService;
import store.xianglin.dubbo.provider.service.impl.HelloServiceImpl;

/**
 * @author xianglin
 */
public class ApiApplication {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider");
        applicationConfig.setOwner("xianglin");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://localhost:2181");

        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(20880);
        protocolConfig.setName("dubbo");

        ServiceConfig<HelloService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setInterface(HelloService.class);
        serviceConfig.setRef(helloService);
        serviceConfig.setVersion("1.0.0");

        serviceConfig.export();
    }
}
