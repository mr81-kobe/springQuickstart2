package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml"); 
		TV tv = (TV) factory.getBean("tv"); //application id ���� tv�� ����. 
		tv.siva();
	}
	
	

}
