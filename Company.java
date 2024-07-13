public class Company {
    
    int n;
    boolean item = false;

    public synchronized void produceItem(int n) {
        if(item){
            try {
                wait();
                
            } catch (Exception e) {
                e.getMessage();
            }
        }
        this.n=n;
        System.out.println("produced : "+this.n);
        item =true;
        notify();
    }
    public synchronized int consumeItem() {
        if(!item){
            try {
                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        System.out.println("Consumed : "+this.n);
        item = false;
        notify();
        return this.n;
    }
}
