package spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@SuppressWarnings("all")
@Service
public class DemoService {
	@Value("其他类的属性")
	private String another;
	public String getAnother() {
		return another;
		
	}

	private void setAnother(String another) {
		this.another=another;
	}

}
