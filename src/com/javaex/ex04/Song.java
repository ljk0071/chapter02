package com.javaex.ex04;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void setArtist(String art) {
		artist = art;
	}
	public void setTitle(String ti) {
		title = ti;
	}
	public void setAlbum(String a) {
		album = a;
	}
	public void setYear(int y) {
		year = y;
	}
	public void setTrack(int tr) {
		track = tr;
	}
	public void setComposer(String c) {
		composer = c;
	}
	public void showInfo() {
		System.out.printf("%s, %s ( %s, %d, %d번 track, %s 작곡)\n", artist, title, album, year, track, composer);
	}
}
