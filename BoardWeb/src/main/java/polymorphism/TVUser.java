package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml"); 
		TV tv = (TV) factory.getBean("tv"); //application id 값에 tv가 들어간다. 
		tv.siva();
	}
	
	

}
