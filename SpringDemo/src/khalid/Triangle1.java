package khalid;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle1 implements InitializingBean, DisposableBean{
	
	private List<Point> pointA;
	//private ApplicationContext context=null;

	public List<Point> getPointA() {
		return pointA;
	}


	public void setPointA(List<Point> pointA) {
		this.pointA = pointA;
	}


	public void dreaw() {
		for (Point point : pointA) {
			System.out.println("Point =(" +point.getX()+","+point.getY()+")");
		}
		
	}
	
	public void myInit() {
		System.out.println("My init method called for Triangle");
	}
	 public void cleanUp() {
		 System.out.println("My destory method called for Triangle");
	 }
	


	@Override
	public void afterPropertiesSet() throws Exception {
	    System.out.println("InitializingBean init method called for Triangle");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called for Triangle");
		
	}



//
//	@Override
//	public void setApplicationContext(ApplicationContext context) throws BeansException {
//		this.context=context;
//		
//	}
//
//
//	@Override
//	public void setBeanName(String beanName) {
//		System.out.println("Triangle bean Name is : "+beanName);
//		
//	}

}
