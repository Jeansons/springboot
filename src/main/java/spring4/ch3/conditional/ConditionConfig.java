package spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
	@Bean
	@Conditional(WindowsCondition.class) //通过@Conditional注解，符合Windows条件则实例化windowsListService
	public ListService windowsListService() {
		return new WindowsListService();
	}
	@Bean
	@Conditional(LinuxCondition.class)  //通过@Conditional注解，符合Linux条件则实例化linuxListService
	public ListService linuxListService() {
		return new LinuxListService();
	}
}
