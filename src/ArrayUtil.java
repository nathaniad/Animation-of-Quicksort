import java.util.Random;
public class ArrayUtil {
    public static int[] randomArray(int size, int min, int max){
        Random generator = new Random();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = generator.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}
