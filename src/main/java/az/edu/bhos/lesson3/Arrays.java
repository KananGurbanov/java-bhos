package az.edu.bhos.lesson3;

public class Arrays {
    public static void main(String[] args) {
        // data_type [] var_name = new data_type[length];
        // data_type [] var_name = {1,2,3};
        int [] arr = new int [10];
        arr[0] = 23;
        arr[1] = 24;
        System.out.println(arr.length);

        printMatrix();


    }

    static void printMatrix(){
        int [][] nums = new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j){
                    System.out.print("K" + " ");
                }
                System.out.print(nums[i][j] + " ");

            }

            System.out.println();
        }
    }
}
