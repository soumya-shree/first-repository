package examples;
import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorldService {
	private int id;
	private String name;
	public HelloWorldService()
	 {
		
	 }
 public HelloWorldService(String name)
 {
	 this.name = name;
 }
	public void setId(int id) {
		this.id = id;
	}
 
	public String sayHello() {
		return "Hello! " + name+ " \t" +id;
	}
	public String sayHello(String name,int id) {
		return "Hello! " + name+ " \t" +id+ " \t" +this.id;
	}
}

