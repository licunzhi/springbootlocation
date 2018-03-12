package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @ComponentScan
 * 这个注解在Spring中很重要，它对应XML配置中的元素，@ComponentScan的功能其实就是自动扫描并加载符合条件的组件
 * （比如@Component和@Repository等）或者bean定义，最终将这些bean定义加载到IoC容器中。
 * 我们可以通过basePackages等属性来细粒度的定制@ComponentScan自动扫描的范围，
 * 如果不指定，则默认Spring框架实现会从声明@ComponentScan所在类的package进行扫描。
 * 注：所以SpringBoot的启动类最好是放在root package下，因为默认不指定basePackages。
 *
 *
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
	}
}
