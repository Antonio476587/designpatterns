import java.lang.reflect.*;
import java.util.*;

public class MatchMakingTestDemo {
    Hashtable datingDB = new Hashtable();

	public MatchMakingTestDemo() {
		initializeDatabase();
	}
    public static void main(String[] args) {
		MatchMakingTestDemo test = new MatchMakingTestDemo();
		test.demo();
	}
    
    public void demo() {
		PersonBean joe = getPersonFromDatabase("Joe Javabean"); 
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.print("Name is " + ownerProxy.getName() + "\n");
		ownerProxy.setInterests("bowling, Go");
		System.out.print("Interests set from owner proxy\n");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.print("Can't set rating from owner proxy\n");
		}
		System.out.print("Rating is " + ownerProxy.getHotOrNotRating() + "\n");

		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.print("Name is " + nonOwnerProxy.getName() + "\n");
		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.print("Can't set interests from non owner proxy\n");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.print("Rating set from non owner proxy\n");
		System.out.print("Rating is " + nonOwnerProxy.getHotOrNotRating() + "\n");
	}

    PersonBean getOwnerProxy(PersonBean person) {
 		
        return (PersonBean) Proxy.newProxyInstance( 
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
	}

	PersonBean getNonOwnerProxy(PersonBean person) {
		
        return (PersonBean) Proxy.newProxyInstance( 
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
	}

	PersonBean getAdminProxy(PersonBean person) {
		
        return (PersonBean) Proxy.newProxyInstance(
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new AdminInvocationHandler(person));
	}

    PersonBean getPersonFromDatabase(String name) {
		return (PersonBean)datingDB.get(name);
	}

	void initializeDatabase() {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setHotOrNotRating(7);
		datingDB.put(joe.getName(), joe);

		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setHotOrNotRating(6);
		datingDB.put(kelly.getName(), kelly);
	}
}
