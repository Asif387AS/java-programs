class MyThreadRunable1 implements Runnable{
    public  void run(){
        int i=0;
        while (i<500){
            System.out.println("my thread 1 is running not threat1");
        }
    }

}class MyThreadRunable2 implements Runnable{
    public  void run(){
        int i=0;
        while (i<500){
            System.out.println("my thread 2 is running not threat 2");
        }
    }

}

public class runnable_mthod_threading {
    public static void main(String[] args) {
MyThreadRunable1 bullet1=new MyThreadRunable1();
Thread gun1=new Thread(bullet1);
MyThreadRunable2 bullet2=new MyThreadRunable2();
Thread gun2=new Thread(bullet2);
  gun1.start();
  gun2.start();

    }
}
