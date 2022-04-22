package com.javaex.ex05;

public class Tv {

	private int channel;
	private int volume;
	private boolean power;
	
	public Tv() {
	}
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void power(boolean on) {
		if ( on == true) {
			this.power = true;
		}else {
			this.power = false;
		}
	}
	public void channel(int channel) {
		if (channel >= 255) {
			channel = 255;
		}else if ( channel <= 0 ) {
		}else {
			this.channel = channel;
		}
	}
	public void channel (boolean on) {
		if ( on == true ) {
			this.channel += 1; 
		}else {
			this.channel -= 1;
		}
	}
	public void volume(int volume) {
		if ( volume >= 100) {
			this.volume = 100;
		}else if ( volume <= 0){
			this.volume = 0;
		}else {
			this.volume = volume;
		}
		
	}
	public void volume (boolean on) {
		if ( on == true ) {
			this.volume += 1; 
		}else {
			this.volume -= 1;
		}
	}
	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	public void status() {
		System.out.println(toString());
	}
	
}
