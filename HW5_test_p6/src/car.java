
class car {
	private int num;
	private double gas;
	
	public car() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g) {
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
	}
}