package static2.ex;

public class MathArrayUtils {
    public static int sum(int[] array){
        int num=0;
        for (int s: array){
            num+=s;
        }
        return num;
    }

    public static int average(int[] array){
        return sum(array)/array.length;
    }

    public static int min(int[] array){
        int min=array[0];
        for(int i=0; i< array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public static int max(int[] array){
        int max=array[0];
        for(int i=0; i< array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    private MathArrayUtils() {
    }
}
