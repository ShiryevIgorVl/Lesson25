public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static float[] getArr() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    public static float[] newArr(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }

    public static void main(String[] args){
        getArr();
        long a = System.currentTimeMillis();
        newArr(arr);
        System.out.println(System.currentTimeMillis() - a);


    }
}
