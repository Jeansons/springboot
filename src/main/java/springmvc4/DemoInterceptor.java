package springmvc4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DemoInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,Object handler)throws Exception{
				long startTime=System.currentTimeMillis();
				request.setAttribute("startTime", startTime);
		return true;
		
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response,Object handler, ModelAndView modelAndView)throws Exception{
				long startTime=(long)request.getAttribute("startTime");
				request.removeAttribute("startTime");
				long endTime=System.currentTimeMillis();
				System.out.println("本次请求处理时间为 ： "+new Long(endTime-startTime)+"ms");
				request.setAttribute("handlingTime", endTime-startTime);

	}

}
