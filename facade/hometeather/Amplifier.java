package hometeather;

public class Amplifier {
	String description;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.print(description + " on\n");
	}
 
	public void off() {
		System.out.print(description + " off\n");
	}
 
	public void setStereoSound() {
		System.out.print(description + " stereo mode on\n");
	}
 
	public void setSurroundSound() {
		System.out.print(description + " surround sound on (5 speakers, 1 subwoofer)\n");
	}
 
	public void setVolume(int volume) {
		System.out.print(description + " setting volume to " + volume + "\n");
	}

	public void setTuner(Tuner tuner) {
		System.out.print(description + " setting tuner to " + dvd + "\n");
		this.tuner = tuner;
	}
  
	public void setDvd(DvdPlayer dvd) {
		System.out.print(description + " setting DVD player to " + dvd + "\n");
		this.dvd = dvd;
	}
 
	public void setCd(CdPlayer cd) {
		System.out.print(description + " setting CD player to " + cd + "\n");
		this.cd = cd;
	}
 
	public String toString() {
		return description;
	}
}