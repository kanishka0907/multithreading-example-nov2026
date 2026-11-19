package extend.inbuilt.threadclass;

public class DemoThread1 extends Thread{

    public DemoThread1(){
        start();
    }

    @Override
    public void run(){
        try {
            System.out.println("Part1 - printing the numbers in ascending order 1-10");
            for (int i = 1; i <= 10; i++) {
                System.out.println("i is :" + i);
                Thread.sleep(1);
            }
        }
        catch (Exception e) {
            System.out.println("Exception occurred :"+e.getMessage()+"---"+e.getClass());
        }
    }
}
