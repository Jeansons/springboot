package spring4.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	private String beanName;
	private ResourceLoader loader;
	public void setResourceLoader(ResourceLoader resourceLoader) {//重写
		this.loader=resourceLoader;
	}
	public void setBeanName(String name) {// 重写
		this.beanName=name;
		
	}
	public void outputResult() {
		System.out.println("Bean的名称为： "+beanName);
		Resource resource=loader.getResource("classpath:spring4/ch3/aware/text.txt");
		try {
			System.out.println("ResourceLoader加载的文件内容为："+IOUtils.toString(resource.getInputStream()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
