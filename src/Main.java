import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task1();//обьявление массива
        //task2();//распечатка массива
        //task3();//распечатка в обратной последовательности
        task4();//нечетное в четное
    }

    private static void task1() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = new int[]{2, 4, 5, 8, 10};
    }

    private static void task2() {
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = new int[]{2, 4, 5, 8, 10};

        for (int i = 0; i < arr1.length; i++ ){
            System.out.print(arr1[i]);
            if (i!=arr1.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++ ){
            System.out.print(arr2[i]);
            if (i!=arr2.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++ ){
            System.out.print(arr3[i]);
            if (i!=arr3.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task3(){
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = new int[]{2, 4, 5, 8, 10};

        for (int i = arr1.length -1; i >= 0; i-- ){
            System.out.print(arr1[i]);
            if (i!= 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr2.length -1; i >= 0; i-- ){
            System.out.print(arr2[i]);
            if (i!= 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr3.length -1; i >= 0; i-- ){
            System.out.print(arr3[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task4(){
        System.out.println("Задача 4");
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}