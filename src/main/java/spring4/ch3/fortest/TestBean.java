package spring4.ch3.fortest;

public class TestBean {
	private String content;

	public TestBean(String content) {
		super();
		this.content=content;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	

}
