package polymorphism;

import java.util.List;
import java.util.Set;

public class SamsungTV implements TV {
	
	private Spe spe; 
	private int value ;
	private List<String> list; 
	private Set<String> set;
	public void initmethod(){
		
		System.out.println("�ɹ� ������ �ʱ�ȭ �ѹ� �غ��ڰ�");
		
	}
	
	public void destroymethod(){
		System.out.println("��ü ���� ������ �Լ� ȣ�� bean�� �Ӽ��� �ϳ� destrory-method() ");
		
	}
	public SamsungTV() {
		// TODO Auto-generated constructor stub
		System.out.println("SamsungTV ��ü ����"); 
		
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public SamsungTV(Spe spe, int value) {
		super();
		this.spe = spe;
		this.value = value;
	}

	public SamsungTV(Spe spe) {
		super();
		this.spe = spe;
	}

	public Spe getSpe() {
		return spe;
	}

	public void setSpe(Spe spe) {
		this.spe = spe;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void siva() {
		// TODO Auto-generated method stub
		
	}
	
	
}
