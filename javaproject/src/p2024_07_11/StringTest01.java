package p2024_07_11;

public class StringTest01 {

	//toUpperCase() : 대문자로 변환 해주는 함수 
	//toLowerCase() : 소문자로 변화 해주는 함수
	public static void main(String[] args) {

		/*
		- String
		String 객체를 생성한 후에 메소드에 의해서 값의 변화가 일어나면 변경된 값은 새로운 힙(heap) 메모리 영역에 다시 저장
		- 가비지 컬렉션(Garbage Collection) 기능
		재활용할 수 없는 heap메모리 영역의 데이터를 모아서 지워주는 기능
		참조 가능한 주소가 없는 경우 가비지가 처리
		*/
		
		String str1 = "Java Programming";
		
		str1.toUpperCase(); //새로운 메모리상에 공간을 할당받아 대문자를 입력
		System.out.println(str1); //Java Programming, 기존의 str1 값이 출력
		System.out.println(str1.toUpperCase()); //JAVA PROGRAMMING
		
		str1 = str1.toLowerCase(); //str1.toLowerCase()의 결과값의 주소값을 str1에 저장
		System.out.println(str1); //Java Programming
	}

}
