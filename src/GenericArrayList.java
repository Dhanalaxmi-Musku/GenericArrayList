import java.util.ArrayList;

public class GenericArrayList {
	public static <T> void printArrayList(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("Integer List:");
        printArrayList(intList);
        
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        System.out.println("\nString List:");
        printArrayList(stringList);
        
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5);
        doubleList.add(20.7);
        doubleList.add(30.9);
        System.out.println("\nDouble List:");
        printArrayList(doubleList);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        System.out.println("\nPerson List:");
        printArrayList(personList);

	}

}
