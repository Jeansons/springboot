package spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;

public class JavaConfig {
	@Bean
	public FunctionService functionService() {
		return new FunctionService();
	}
//	@Bean
//	public UseFunctionService useFunctionService() {
//		UseFunctionService useFunctionService=new UseFunctionService();
//		useFunctionService.setFunctionService(functionService());
//		return useFunctionService;
//	}
	@Bean
	public UseFunctionService usefunctionService(FunctionService functionService) {
		UseFunctionService useFunctionService =new UseFunctionService();
		useFunctionService.setFunctionService(functionService);
		return useFunctionService;
	}
}
