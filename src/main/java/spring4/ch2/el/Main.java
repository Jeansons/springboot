package spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(ElConfig.class);
		ElConfig resourceServiceConfig= context.getBean(ElConfig.class);
		resourceServiceConfig.outputResource();
		context.close();

	}

}
