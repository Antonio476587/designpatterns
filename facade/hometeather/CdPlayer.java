package hometeather;

public class CdPlayer {
	String description;
	int currentTrack;
	Amplifier amplifier;
	String title;
	
	public CdPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.print(description + " on\n");
	}
 
	public void off() {
		System.out.print(description + " off\n");
	}

	public void eject() {
		title = null;
		System.out.print(description + " eject\n");
	}
 
	public void play(String title) {
		this.title = title;
		currentTrack = 0;
		System.out.print(description + " playing \"" + title + "\"\n");
	}

	public void play(int track) {
		if (title == null) {
			System.out.print(description + " can't play track " + currentTrack + 
					", no cd inserted\n");
		} else {
			currentTrack = track;
			System.out.print(description + " playing track " + currentTrack + "\n");
		}
	}

	public void stop() {
		currentTrack = 0;
		System.out.print(description + " stopped\n");
	}
 
	public void pause() {
		System.out.print(description + " paused \"" + title + "\"\n");
	}
 
	public String toString() {
		return description;
	}
}
