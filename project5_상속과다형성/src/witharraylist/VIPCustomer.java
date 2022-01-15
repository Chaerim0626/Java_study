package witharraylist;

public class VIPCustomer extends Customer {
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer (int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.01;
		
		System.out.println("VIPCustomer() ȣ��");
	}
	
	public int getAgentID () {
		return agentID;
	}
	
	

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() { //������
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�.";
	}
	
	
}
