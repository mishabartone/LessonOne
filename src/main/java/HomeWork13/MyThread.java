package HomeWork13;

public class MyThread extends Thread {

    private float[] arr;

    public MyThread(float[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        synchronized (arr){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }
}
