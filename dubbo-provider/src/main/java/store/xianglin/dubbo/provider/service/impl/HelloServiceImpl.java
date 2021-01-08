package store.xianglin.dubbo.provider.service.impl;


import store.xianglin.dubbo.api.service.HelloService;

/**
 * @author xianglin
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String word) {
        return "ProviderServiceImpl " + word;
    }
}
