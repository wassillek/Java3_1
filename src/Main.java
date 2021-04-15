import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};
        printArray(array);

        swap( array, 0, 4);

        printArray(array);

        System.out.println(changeArrayToArrayList(array));

        Box<Apple> boxApple = new Box<>();
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        System.out.println(boxApple.getWeight());

        Box<Orange> boxOrange= new Box<>();
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());
        System.out.println(boxOrange.getWeight());

        System.out.println(boxApple.compare(boxOrange));
        System.out.println(boxApple.compare(boxApple));

        Box<Apple> boxApple1 = new Box<>();
        
        boxApple.changeBox(boxApple1);
        System.out.println(boxApple.getWeight());
        System.out.println(boxApple1.getWeight());
    }

    public static <T> void swap(T[] array, int i, int j){
        T savedElement = array[i];
        array[i] = array[j];
        array[j] = savedElement;
    }

    public static <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T> ArrayList<T> changeArrayToArrayList(T[] array){
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(array));
        return arrayList;
    }

}
