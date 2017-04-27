package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	TV() {
		System.out.println("TV default constructor");
	}
	
	TV (int channel, int volume, boolean power) {
		System.out.println("TV(int,int,boolean) constructor");
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public void power(boolean p) {
		if(p) {
			System.out.println("power on.");
		} else {
			System.out.println("power off.");
		}
	}
	
	public void channel(int c) {
		if(c < 1 || c > 255)
			return;
		channel = c;
	}
	public void channel(boolean c) {
		if(c) {
			channel++;
			if(channel > 255)
				channel = 1;
		} else {
			channel--;
			if(channel < 1)
				channel = 255;
		}
	}
	
	public void volume(int v) {
		if(v < 0 || v > 100)
			return;
		volume = v;
	}
	public void volume(boolean v) {
		if(v) {
			volume++;
			if(volume > 100)
				volume = 0;
		} else {
			if(volume > 0)
				volume--;
		}
	}
	
	public void status() {
		System.out.println("channel : " + channel
				+ ", volume : " + volume
				+ ", power : " + power);
	}
}
