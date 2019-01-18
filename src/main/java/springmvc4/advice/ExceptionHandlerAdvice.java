package springmvc4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice  //申明一个控制器建言
public class ExceptionHandlerAdvice {
	@ExceptionHandler(value=Exception.class) //作全局处理，拦截所有的Exception
	public ModelAndView exception(Exception exception,WebRequest request){
		ModelAndView modelAndView=new ModelAndView("error");
		modelAndView.addObject("errorMessage",exception.getMessage());
		return modelAndView;
	}
	@ModelAttribute  //注解将键值对添加到全集，所有注解的@RequestMapping的方法可获得此键值对。
	public void addAtrributes(Model model) {
		model.addAttribute("msg","额外信息");
	}
	@InitBinder  //注解定制WebDataBinder
	public void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.setDisallowedFields("id"); //忽略request参数的id
	}

}
