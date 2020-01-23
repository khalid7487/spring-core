package khalid;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawlngApps { 

	public static void main(String[] args) {
		
//		BeanFactory factory=new XmlBeanFactory(new FileSystemResource());
		ApplicationContext context= new ClassPathXmlApplicationContext("khalid/spring.xml");
		Triangle1 triangle=(Triangle1)context.getBean("triangle");
		triangle.dreaw();
	}

}