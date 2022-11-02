package java_khjInstance;

public class CircleTest {
	public static void main(String[] args) {
		int num = 1; //변수선언하고 해당 방에 값을 할당
		
		
		Rectangle rec = new Rectangle(10,20);
		System.out.println(rec.getArea());
		
		Circle circle ; //클래스명(참조형 데이터타입) 변수명, 즉 변수선언
		
		circle = new Circle(); //new 뒤에는 클래스 이름으로 함수가 온다(생성자함수)

		circle.radius = 10;
		
		System.out.println(circle.getArea());
	

		Circle circle2 = new Circle();

		circle2.radius = 5;

		System.out.println(circle2.getArea());

		
		Circle circle3 = new Circle();

		circle3.radius = 7;

		System.out.println(circle3.getArea());
	}
}
	
	
