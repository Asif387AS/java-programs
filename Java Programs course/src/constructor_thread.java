class myThr extends Thread{
    public myThr(String name) {
        super(name);
    }
       public void run(){
            int i=52;
//           System.out.println("thank u");
//            while (i<44){
//                System.out.println("I am thread");
//            }
        }
    }

public class constructor_thread {
    public static void main(String[] args) {
        myThr t1=new myThr("asif");
        myThr t2=new myThr("Hassan");
        t1.start();
        t2.start();
        System.out.println("The id of this thread t is  "+t1.getId());
        System.out.println("The name of this thread t is  "+t1.getName());
        System.out.println("The id of this thrd t is  "+t2.getId());

        System.out.println("The name of this thread t is  "+t2.getName());
    }
}
