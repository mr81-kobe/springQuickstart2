package polymorphism;

import org.springframework.stereotype.Component;

@Component("Samsung")
public class Samsung implements Spe{

	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void wang() {
		// TODO Auto-generated method stub
		System.out.println("samsung");
	}

}
