package spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("spring4.ch3.taskscheduler")
@EnableScheduling  //通过@EnableScheduling注解开启计划任务的支持。
public class TaskSchedulerConfig {

}
