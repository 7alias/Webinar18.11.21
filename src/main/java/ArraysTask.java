import java.util.Arrays;

public class ArraysTask {

    public static void main(String[] args) {


        int[] rand = new int[]{1, 2, 3, 4, 5};

        int[][] arr1 = new int[5][5];
        int[][] arr2 = {{5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
        };


        int[][] arr3;


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++)
                arr1[i][j] += rand[i] * (j + i + 1);

        }


        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println();
        arr3 = Arrays.copyOf(arr1, arr1.length);
        arr1 = Arrays.copyOf(arr2, arr1.length);
        arr2 = Arrays.copyOf(arr3, arr1.length);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
        System.out.println();


    }

}
