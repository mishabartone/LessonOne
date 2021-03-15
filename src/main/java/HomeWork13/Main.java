package HomeWork13;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final int size = 10000000;
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        makeFloat1(arr);
        makeFloat2(arr);

    }

    public static void makeFloat1(float[] arr){

        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);

    }

    public static void makeFloat2(float[] arr) throws InterruptedException {

        final int h = arr.length / 2;

        float[] a1 = new float[h];
        float[] a2 = new float[arr.length - h];

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread thread1 = new Thread(new MyThread(a1));
        Thread thread2 = new Thread(new MyThread(a2));

        thread1.join();
        thread2.join();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println(System.currentTimeMillis() - a);

    }

}
