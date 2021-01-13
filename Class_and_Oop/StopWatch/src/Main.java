import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array =  new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        StopWatch watch = new StopWatch();
        watch.start();
        sort(array);
        watch.stop();
        print(array);
        System.out.println("Thời gian thực thi thuật toán: " + watch.getElapsedTime() + " ms");
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index_min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index_min])
                    index_min = j;
            }
            int temp = arr[index_min];
            arr[index_min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int[] arr) {
        for (int x:arr) {
            System.out.println(x);
        }
    }
}
class StopWatch {
    private long startTime, endTime;

    public StopWatch () {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}

