package p2024_07_10;

class Singleton{
	//싱클톤(singleton) : 객체 생성을 한번만 수행하는 것.
	private static Singleton s = new Singleton(); //정적 필드
	//private:외부에서 막고, static:공유를 하기 위해 사용 - 모순 발생
	//누구나 쉽게 접근할 수는 있지만 외부에서 접근을 1번만 할 수 있다
	
	private Singleton() { } //직접 클래스로부터 객체 생성하는 것을 막아주는 역할
	
	public static Singleton getInstance() { //정적 메소드, 리턴 타입이 클래스인 경우 return은 객체
		return s;
	}
	
	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}
}

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println("obj1:"+obj1+" ,obj2:"+obj2); //객체 생성은 1번만 하기 때문에 같은 주소가 나온다. new를 사용x, static에서 new 1번만 사용
		
		if(obj1 == obj2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		obj1.check();
		obj1.check1();
		
		obj2.check();
		obj2.check1();
		
		//기본 생성자의 접근 제어자가 private이기 때문에 접근할 수 없다.
		//Singleton s = new Singleton();
	}

}
