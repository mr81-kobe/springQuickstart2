package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	@Qualifier("Samsung")
	private Spe Speaker;
	public LgTV() {
		// TODO Auto-generated constructor stub
	}
	public void sibal(){
		System.out.println("½Ã¹ú");
		
	}
	@Override
	public void siva() {
		// TODO Auto-generated method stub
		System.out.println("sival"); 
		Speaker.wang();
	}
}
