package DataStructures;

public class JavaGenerics {
    public static <E> void printArray(E[] arr) {
        for (E elem : arr) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }
}
