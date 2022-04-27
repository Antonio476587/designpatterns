package iterator;

import java.util.*;

public class EI {
	public static void main (String args[]) {
        String[] aguacates = {"\naguacate1", "aguacate2", "aguacate3", "aguacate4"};
		Vector v = new Vector(Arrays.asList(aguacates));
		Enumeration enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		Iterator iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
