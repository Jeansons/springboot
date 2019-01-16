package spring4.ch2.event;

import org.springframework.context.ApplicationEvent;


public class DemoEvent extends ApplicationEvent {
	

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public DemoEvent(Object source,String msg) {
		super(source);
		this.setMsg(msg);
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	

}
