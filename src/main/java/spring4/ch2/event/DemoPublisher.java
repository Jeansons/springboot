package spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
	@Autowired
	ApplicationContext applicationContext; //注入ApplicationContent用来发布事件
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this,msg)); //使用ApplicationContent的publishEvent方法来发布。
		
	}
	

}
