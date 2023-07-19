import java.util.*;

public class Main{
	public static void main(String[] args) {
		final List<String> names = new ArrayList<>();
		names.add("Tatev");
		names.add("Ira");
		names.add("Anahit");
		names.add("Elem");
		names.add("Anna");
		names.add("Gagik");
		System.out.println(names);

		names.add("Tatev");
		names.add("Ira");
		names.add("Anahit");
		names.add("Elem");
		names.add("Anna");
		names.add("Gagik");
		System.out.println(names);

		final Set<String> uniqueNames = new HashSet<>(names);
		final Set<String> uNames = new TreeSet<>(names);
		final Set<String> unNames = new LinkedHashSet<>(names);
/*
		for(String name : names){
			uniqueNames.add(name);
			uNames.add(name);
			unNames.add(name);
		}
*/
		
		System.out.println(names);
		System.out.println("--------------------");
		System.out.println(uniqueNames);
		System.out.println("--------------------");
		System.out.println(uNames);
		System.out.println("--------------------");
		System.out.println(unNames);


	}
}
