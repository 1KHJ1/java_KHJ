package java_khjInstance;
public class TV{
	
	String maker;
	int years;
	int size;
	
	public void show(String maker, int years, int size) {
		
		System.out.println(maker+"에서 만든"+years+"년형"+size+"인치 TV");
	}	
	public static void main(String[] arg) {
		
		TV myTV = new TV();
		myTV.show("LG", 2017, 32);
	}
}