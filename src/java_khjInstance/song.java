package java_khjInstance;

import java.util.Scanner;

	
public class song {
	private String title;
	private String artist;
	private int year;
	private String country;

	void show(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
		System.out.println(this.year + "년" + this.country + "국적의" + this.artist + "가 부른" + this.title);
	}

	public static void main(String[] arg) {
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		System.out.println(value);
		value = scanner.nextInt();
		System.out.println(value);
		
		/*
		 * song music = new song(); music.show("Dancing Queen","ABBA",1978,"스웨덴");
		 * music.show("에잇", "아이유", 2018, "한국");
		 */
	}
}