public class Consumer  extends Thread{
    
Company c ;
Consumer(Company c){
    this.c=c;
}
    public void run(){
        while(true){
            this.c.consumeItem();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
