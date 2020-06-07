public class Executor {
    Thread1 v1=new Thread1();
    Thread1 v2=new Thread1();
    public Executor(){
        v1.run();
        v2.run();
    }

    public void StartCommunication() throws InterruptedException {
        boolean whichThreadIsActive=false;
        for(int i=0;i<20;i++){
            System.out.println(i);
            if(whichThreadIsActive==false) {
                int num = v1.returnRandomMillis();
                v1.sleep(num);
                v2.soutNumberFromOtherThread(num);
                whichThreadIsActive=true;
            }else{
                int num=v2.returnRandomMillis();
                v2.sleep(num);
                v1.soutNumberFromOtherThread(num);
                whichThreadIsActive=false;
            }
        }
    }
}