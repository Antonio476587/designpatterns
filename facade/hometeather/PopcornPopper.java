package hometeather;

public class PopcornPopper {
	String description;
	
	public PopcornPopper(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.print(description + " on\n");
	}
 
	public void off() {
		System.out.print(description + " off\n");
	}

	public void pop() {
		System.out.print(description + " popping popcorn!\n");
	}
 
  
        public String toString() {
                return description;
        }
}
