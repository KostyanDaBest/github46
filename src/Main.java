import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        int i = 0;
            for (i = 1; i < arr.length; i++) {
                if (arr[i] <= arr[i - 1]) {
                    System.out.println("Массив не является возрастающей последовательностью." + Arrays.toString(arr));
                    break;
                }
                else if (arr[i] == arr.length) ;
                {
                    System.out.println(" Массив не является возрастающей последовательностью. "+ Arrays.toString(arr));
                }

            }
        }

    }
