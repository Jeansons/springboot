package springboot.ch6_2_3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ch623Application {
	@Autowired
	private AuthorSettings authorSettings;
	
	@RequestMapping("/")
		String index() {
		return "my name is :"+authorSettings.getName()+" and my age  is : "+authorSettings.getAge();
		}
	public static void main(String[] args) {
		 SpringApplication.run(ch623Application.class,args);
		
		
	}

}
