package store.xianglin.dubbo.provider;

import com.sun.xml.internal.xsom.parser.AnnotationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import store.xianglin.dubbo.provider.config.DubboConfig;

import java.io.IOException;

/**
 * @author xianglin
 */
public class AnnotationApplication {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfig.class);
        context.start();
        System.in.read();
    }
}
