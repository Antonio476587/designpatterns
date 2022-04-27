package iterator;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
        String[] aguacates = {"\naguacate1", "aguacate2", "aguacate3", "aguacate4"};
		Vector v = new Vector(Arrays.asList(aguacates));
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
