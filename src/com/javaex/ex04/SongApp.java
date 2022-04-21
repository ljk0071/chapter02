package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
		Song iu = new Song();
		iu.setArtist("아이유");
		iu.setTitle("좋은 날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이민수");
		Song big = new Song();
		big.setArtist("BIGBANG");
		big.setTitle("거짓말");
		big.setAlbum("Always");
		big.setYear(2007);
		big.setTrack(2);
		big.setComposer("G-DRAGON");
		Song busker = new Song ();
		busker.setArtist("버스커버스커");
		busker.setTitle("벚꽃엔딩");
		busker.setAlbum("버스커버스커 1집");
		busker.setYear(2012);
		busker.setTrack(4);
		busker.setComposer("장범준");
		
		iu.showInfo();
		big.showInfo();
		busker.showInfo();
	}

}
