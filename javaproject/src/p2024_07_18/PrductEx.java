package p2024_07_18;

class Product{
	String name = "product";
	int price = 1111;
	
	void printPrice() {
		System.out.println("name:"+ name+ ", price:"+price);
	}
}

class Computer extends Product{
	String name = "Computer";
	int price = 300;
	
	@Override
	void printPrice() {
		System.out.println("Computer에서 name:"+ name+ ", price:"+price);
	}
	
	void ComputerMethod() {
		System.out.println("Computer의 Method");
	}
}

class LastComputer extends Computer{
	String name = "LastComputer";
	int price = 100000;
	
	@Override
	void printPrice() {
		System.out.println("LastComputer에서 name:"+ name+ ", price:"+price);
	}
	
	void lastComputerMethod() {
		System.out.println("LastComputer의 Method");
	}
}

class Buyer{
	
	void buyerPrice(Product p) {
		//필드는 타입의 필드값을 가져온다
		System.out.println("Product변수:" + p.name + " ,"+ p.price);
		//메소드는 인스턴스에서 오버로딩된 메소드를 가져온다
		p.printPrice();  
	}
}

public class PrductEx {

	public static void main(String[] args) {
		//타입 참조변수 = new연산자 인스턴스
		Product computer = new Computer();
		Computer computer2 = new Computer();
		
		Buyer buyer = new Buyer();
		buyer.buyerPrice(computer);
		buyer.buyerPrice(computer2);
		
		System.out.println();
		
		Product lastComputer = new LastComputer();
		LastComputer lastComputer2 = new LastComputer();
		
		buyer.buyerPrice(lastComputer);
		buyer.buyerPrice(lastComputer2);
	}
}
