package springmvc4.web.ch4_4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc4.domain.DemoObj;

@Controller
public class AdviceController {
	@RequestMapping("/advice")
	public String getSomeString(@ModelAttribute("msg") String msg,
			DemoObj obj) {
		throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttribute: "+msg);
	}

}
