package Model;

import Interface.IStreamable;

public class Music implements IStreamable {
	
	private String artist;
	private String album;
	private int length;
	private int byteSent;
	
	public Music(String artist, String album, int length, int byteSent) {
		this.artist = artist;
		this.album = album;
		this.length = length;
		this.byteSent = byteSent;
	}

	@Override
	public int getLength() {
		return this.length;
	}

	@Override
	public int getByteSent() {
		return this.byteSent;
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

	public void setByteSent(int byteSent) {
		this.byteSent = byteSent;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
