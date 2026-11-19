package implement.runnablrinterface;

public class SampleThread2 implements Runnable{

    public SampleThread2(){
        Thread thread2 = new Thread(this,"SampleThread1");
        thread2.start();
    }
    @Override
    public void run() {
        try {
            System.out.println("Part2 - printing the numbers in descending order 10-1");
            for (int j = 10; j > 0; j--) {
                System.out.println("j is :" + j);
                Thread.sleep(1);
            }
        }
        catch (Exception e) {
            System.out.println("Exception occurred :"+e.getMessage()+"---"+e.getClass());
        }

    }
}
