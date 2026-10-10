
package Pack3;

import java.util.ArrayList;


public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }
        System.out.println("Original List: " + list);

        list.add(2, 50);
        System.out.println("After add(index, element): " + list);

        list.set(4, 100);
        list.set(9, 200);
        System.out.println("After updating two elements: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Contains 100? " + list.contains(100));
        System.out.println("Contains 500? " + list.contains(500));
        System.out.println("Element at index 4: " + list.get(4));

        list.add(100);
        System.out.println("First index of 100: " + list.indexOf(100));
        System.out.println("Last index of 100: " + list.lastIndexOf(100));

        list.remove(0);
        System.out.println("After removing index 0: " + list);

        list.remove(Integer.valueOf(200));
        System.out.println("After removing value 200: " + list);
        System.out.println("Elements greater than 10:");

        list.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);



        ArrayList<Integer> anotherList = new ArrayList<>(list);
        System.out.println("Lists are equal? " + list.equals(anotherList));

        anotherList.add(999);
        System.out.println("After modification, lists are equal? "
                + list.equals(anotherList));


        System.out.println("Final List: " + list);

        ArrayList<Integer> tempList = new ArrayList<>(list);
        tempList.clear();
        System.out.println("After clear(): " + tempList);
        System.out.println("Size after clear(): " + tempList.size());
    }
}