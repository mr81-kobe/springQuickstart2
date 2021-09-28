package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class Speker implements Spe {

	public Speker() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void wang() {
		// TODO Auto-generated method stub
		System.out.println("apple~~");
	}

}
