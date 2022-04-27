public class Hottub {
	boolean on;
	int temperature;

	public Hottub() {
	}

	public void on() {
		on = true;
        System.out.print("Hottub is on\n");
	}

	public void off() {
		on = false;
        System.out.print("Hottub is off\n");
	}

	public void circulate() {
		if (on) {
			System.out.print("Hottub is bubbling!\n");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.print("Hottub jets are on\n");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.print("Hottub jets are off\n");
		}
	}

	public void setTemperature(int temperature) {
		if (temperature > this.temperature) {
			System.out.print("Hottub is heating to a steaming " + temperature + " degrees\n");
		}
		else {
			System.out.print("Hottub is cooling to " + temperature + " degrees\n");
		}
		this.temperature = temperature;
	}
}
