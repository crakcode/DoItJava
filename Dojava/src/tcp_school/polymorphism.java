package tcp_school;

public class polymorphism {

	
//	다형성을 사용하는 이유는 코드의 효율성을 위해서다.
//	Product 로 받아서 따로따로 객체를 넣는 메소드를 선정하지 않아도 된다.
//	클래스명(Parent) 변수 = new 클래스명(Child) 로 선언하여 다형성 사용가능
//	이떄 중요한것은 다형성은 부모에서 자식으로는 되지만 자식에서 부모는 안된다.
//	왜냐하면 상속 받은 자식이 메소드가 더 많거나 같을수 있기 떄문이다.
//	참고: https://change-words.tistory.com/24
	public static void main(String[] args) {
		System.out.println("hello world");
		Product tv=new TV();
		Product com=new Computer();
		
		Buyer by=new Buyer();
		System.out.println("tv 의 가격은 "+tv.Price);
		by.buyProduct(tv);
		by.showAccount();
		System.out.println("Computer 의 가격은 "+com.Price);
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
//		Product(부모) 클래스에 100 삽입
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
		System.out.println("남은 잔액은"+this.money);
	}
}





