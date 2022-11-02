package java_khjInstance;
public class Gugudan{
	
	void printGugu(int num) {
		int gugunum = num;
		for(int i =1;i<=gugunum;i++) {
			for(int j = 1; j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
	}

public static void main(String[]arg) {
	Gugudan gugudan = new Gugudan();
	gugudan.printGugu(10);
	gugudan.printGugu(20);
}
}