package chapter02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private int year;
	private int track;
	private String composer;
	
	public Song(String artist, String title, String album,
				int year, int track, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	public Song(String artist, String title) {
		this(artist, title, "", 0, 0, ""); //기존 생성자 호출
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public void show() {
		System.out.println(
				artist + " " +
				title + "(" +
				album + "," +
				year + "," +
				track + "번 track," +
				composer + " 작곡)");
	}
}
