package springmvc4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc  //@EnableWebMvc 开启springmvc支持，若无，重写webmvcConfigurerAdaper方法无效。
@EnableScheduling
@ComponentScan("springmvc4")
public class MyMvcConfig implements WebMvcConfigurer{//官方推荐 实现WebMvcConfigurer
//public class MyMvcConfig extends WebMvcConfigurerAdapter{
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=
				new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/classes/views/");
		//viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
		
	}
	public void addResourceHandlers(ResourceHandlerRegistration registry) {
		registry.addResourceLocations("/assets/**")
		.addResourceLocations("classpath:/assets/");
	}

	@Bean  // 配置拦截器的Bean
	public DemoInterceptor demoInterceptor() {
		return new DemoInterceptor();
	}
	@Override  //重写addInterceptors,注册拦截器
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(demoInterceptor());

	}	
	//@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("/index");

	}
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) { //可不忽略“.”
		configurer.setUseSuffixPatternMatch(false);
	}
	
}
