package p2024_07_18;

class Product{
	protected String name;
	protected int price = 0;
	
	void printPrice() {
		System.out.println("name:"+ name+ ", price:"+price);
	}
}

class TV extends Product{
	String name = "TV";
	int price = 100;

	void printPrice() {
		System.out.println("name:"+ name+ ", price:"+price);
	}
}

class Computer extends Product{
	String name = "Computer";
	int price = 200;
	
	void printPrice() {
		System.out.println("name:"+ name+ ", price:"+price);
	}
}

class Phone extends Product{
	String name = "Phone";
	int price = 300;
	
	void printPrice() {
		System.out.println("name:"+ name+ ", price:"+price);
	}
}

class LastPhone extends Phone{
	String name = "LastPhone";
	int price = 100000;
	
	@Override
	void printPrice() {
		System.out.println("name:"+ name+ ", price:"+price);
	}
}

class Buyer{
	
	void buyerPrice(Product p) {
		//필드는 타입의 필드값을 가져온다
		System.out.println("구입한 물품은 " + p.name + "가격은 " + p.price);
		//메소드는 인스턴스에서 오버로딩된 메소드를 가져온다
		p.printPrice();  
		System.out.println();
	}
}

public class PrductEx {

	public static void main(String[] args) {
		//타입 참조변수 = new연산자 인스턴스;
		Product tv2 = new TV();
		Product computer2 = new Computer();
		Product phone2 = new Phone();
		Product lastPhone = new LastPhone();
		
		Buyer buyer2 = new Buyer();
		buyer2.buyerPrice(tv2);
		buyer2.buyerPrice(computer2);
		buyer2.buyerPrice(phone2);
		buyer2.buyerPrice(lastPhone);
		
	}

}
