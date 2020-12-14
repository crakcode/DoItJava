package doitjava.chapter6;



class User{
	
	String name;
	int accountNum;
	int money;
	
	User(String name,int accountNum,int money){
		this.name=name;
		this.accountNum=accountNum;
		this.money=money;
	}
	
	void deposit(Bank bk,int money) {
		bk.deposit(money);
		this.money-=money;
	}
	
	void withdraw(Bank bk,int money) {
		bk.withdraw(money);
		this.money+=money;
	}
}

class Bank{
	int userCount;
	int wMoney;
	
	void deposit(int money) {
		this.wMoney+=money;
	}
	void withdraw(int money) {
		this.wMoney-=money;
	}

	
	void showInfo() {
		System.out.println("ÃÑ±Ý¾×"+wMoney);
	}
	
	
	
}





public class example {

}
