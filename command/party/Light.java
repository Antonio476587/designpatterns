public class Light {
    String location;
 	int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.print("Lighted it up in " + location + "\n");
    }

    public void off() {
        System.out.print("Lighted it off in " + location + "\n");
    }

	public void dim(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			System.out.println("Light is dimmed to " + level + "%");
		}
	}

	public int getLevel() {
		return level;
	}
}