public class MultthreadingThing extends  Thread{
    @Override
    public  void  run(){
        // write program you want to excute
        for (int i = 0; i <= 5 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
//                Todo auto generate
//                e.printStackTrace();
            }

        }
    }
}
