package tcp_school;

public class polymorphism {

	
//	�������� ����ϴ� ������ �ڵ��� ȿ������ ���ؼ���.
//	Product �� �޾Ƽ� ���ε��� ��ü�� �ִ� �޼ҵ带 �������� �ʾƵ� �ȴ�.
//	Ŭ������(Parent) ���� = new Ŭ������(Child) �� �����Ͽ� ������ ��밡��
//	�̋� �߿��Ѱ��� �������� �θ𿡼� �ڽ����δ� ������ �ڽĿ��� �θ�� �ȵȴ�.
//	�ֳ��ϸ� ��� ���� �ڽ��� �޼ҵ尡 �� ���ų� ������ �ֱ� �����̴�.
//	����: https://change-words.tistory.com/24
	public static void main(String[] args) {
		System.out.println("hello world");
		Product tv=new TV();
		Product com=new Computer();
		
		Buyer by=new Buyer();
		System.out.println("tv �� ������ "+tv.Price);
		by.buyProduct(tv);
		by.showAccount();
		System.out.println("Computer �� ������ "+com.Price);
		by.buyProduct(com);
		by.showAccount();
	}

}

class Product{
	int Price;
	Product(int price){
		this.Price=price;
	}
	
}


class TV extends Product{
	TV(){
//		Product(�θ�) Ŭ������ 100 ����
		super(100);
	}
	
}

class Computer extends Product{
	Computer(){
		super(500);
	}
	
}

class Buyer{
	int money;
	Buyer(){
		this.money=1000;
	}
	
	void buyProduct(Product product) {
		this.money=this.money-product.Price;
	}
	void showAccount() {
		System.out.println("���� �ܾ���"+this.money);
	}
}





