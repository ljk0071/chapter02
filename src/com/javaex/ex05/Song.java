package com.javaex.ex05;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	
	
	public Song() {
		
	}
	public Song(String title, String artist, String album,
			String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	
//	
//	public void setArtist(String art) {
//		artist = art;
//	}
//	public void setTitle(String ti) {
//		title = ti;
//	}
//	public void setAlbum(String a) {
//		album = a;
//	}
//	public void setYear(int y) {
//		year = y;
//	}
//	public void setTrack(int tr) {
//		track = tr;
//	}
//	public void setComposer(String c) {
//		composer = c;
//	}
	public void showInfo() {
		System.out.printf("%s, %s ( %s, %d, %d번 track, %s 작곡)\n", artist, title, album, year, track, composer);
	}
}
