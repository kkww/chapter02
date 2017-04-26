package chapter02;

public class SongTest {
	public static void main(String[] args) {
		Song song1 = new Song("아이유", "좋은날", "Real", 2010, 3, "이민수");
		
		song1.show();
		
		Song song2 = new Song("혁오", "TOMBOY");
		
		song2.show();
	}
}
