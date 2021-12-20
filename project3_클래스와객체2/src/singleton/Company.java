package singleton;

public class Company {
	
	private static Company instance = new Company(); //�����ϰ� ���Ǵ� �ν��Ͻ�

	private Company() {}
	
	public static Company getInstance() { //singletion ����
		return instance;
	}
}
