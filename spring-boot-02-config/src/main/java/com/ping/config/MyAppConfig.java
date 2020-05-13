package com.ping.config;

import com.ping.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration：告诉SpringBoot这是一个配置类；来替代之前的Spring配置文件。 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {

    /**
     * 将方法的返回值添加到容器中，容器中组件默认的id是方法名。
     */
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
