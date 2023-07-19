import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class MapMain{
	public static void main(String[] args) {
		final List <Integer> list1 = new ArrayList<>();
		final List <String> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(3);
		list1.add(1);
		list1.add(-4);

		list2.add("Tatev");
		list2.add("Elen");
		list2.add("Anahit");
		list2.add("Anna");
		list2.add("Gagik");

		final ListUtils listUtils = new ListUtils();

		System.out.println(listUtils.getMaxNumber(list1));
		System.out.println(listUtils.getMinNumber(list1));
		System.out.println("douplicate Count is");
		System.out.println(listUtils.getCountOfDouplicatedElems(list1));
		System.out.println("-------------");
		System.out.println(listUtils.counterRepeatedElem(list1));
		System.out.println(listUtils.counterRepeatedElem1(list1));
		System.out.println("***");
		System.out.println(list1);
		System.out.println(listUtils.reverseArray(list1));
		System.out.println(listUtils.reverse(list1));
		System.out.println("***");
		System.out.println(list1);
		System.out.println("--------------------------");
		System.out.println(listUtils.returnCountOfEvenNumbers(list1));
		System.out.println(listUtils.IsASDOrdered(list1));
		System.out.println(listUtils.returnMapWithKeyValue(list2));
		System.out.println(listUtils.sortByASD(list2));
		System.out.println(listUtils.sortByASD1(list2));
		System.out.println(listUtils.returnMaxNumOfArray(list1));
		System.out.println(listUtils.returnMin(list1));
		System.out.println(listUtils.getMinValue(list1));
		System.out.println(listUtils.getMaxValue(list1));

		//System.out.println(listUtils.sortByASD(list2));
		// System.out.println(listUtils.getOnlyUnique(list1));
		// String a = "Anahit";
		// String b = "Anna";
		// boolean bool = b.compareTo(a) < 0;
		// System.out.println(bool);
		
	}
}