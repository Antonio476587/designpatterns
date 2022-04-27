package iterator;

import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
        String[] aguacates = {"\naguacate1", "aguacate2", "aguacate3", "aguacate4"};
		ArrayList l = new ArrayList(Arrays.asList(aguacates));
		Enumeration enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
