package springmvc4.messageconverter;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import springmvc4.domain.DemoObj;

public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {
	
  public MyMessageConverter() {
		super(new MediaType("application","x-wisely",Charset.forName("UTF-8")));
	}
	@Override
	protected boolean supports(Class<?> clazz) {	
		return DemoObj.class.isAssignableFrom(clazz);
	}

	@Override
	protected DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		String temp=StreamUtils.copyToString(inputMessage.getBody(),
				Charset.forName("UTF-8"));
		String [] tempArr=temp.split("-");
		return new DemoObj(new Long(tempArr[0]),tempArr[1]);
	}

	@Override
	protected void writeInternal(DemoObj Obj, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		String out ="hello: "+Obj.getId()+"-"+Obj.getName();
		outputMessage.getBody().write(out.getBytes());
	}

}
