package spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher demoPublisher=context.getBean(DemoPublisher.class);
		demoPublisher.publish("helllo application event");
		context.close();

	}

}
