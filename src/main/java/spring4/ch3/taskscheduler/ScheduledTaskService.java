package spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	private static final  SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
	@Scheduled(fixedRate=5000)
	public void repotcurrentTime() { // 通过@Scheduled声明该方法是计划任务，使用fixedTate属性每隔固定时间执行
		System.out.println("每个 五秒执行一次"+ dateFormat.format(new Date()));
		
	}
	@Scheduled(cron="0 14 21 ? * *")  //使用cron属性可按照指定执行，本例指的是每天11点8分执行；cron是UNIX和类UNIX(Linux)系统下的定时任务。
	public void fixTimeExecution() {
		System.out.println("在指定时间 "+dateFormat.format(new Date())+"执行");
	}

}
