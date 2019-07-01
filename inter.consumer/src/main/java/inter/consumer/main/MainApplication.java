package inter.consumer.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inter.consumer.service.AllInfoService;

public class MainApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext =new  ClassPathXmlApplicationContext("consumer.xml");
		AllInfoService orderService = applicationContext.getBean(AllInfoService.class);
		System.in.read();
	}
}
