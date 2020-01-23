package khalid;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawlngApp { 

	public static void main(String[] args) {
		
//		BeanFactory factory=new XmlBeanFactory(new FileSystemResource());
		ApplicationContext context= new ClassPathXmlApplicationContext("khalid/spring.xml");
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.dreaw();
	}

}
