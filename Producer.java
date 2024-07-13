public class Producer extends Thread {
    
    Company c;
    Producer(Company c ){
        this.c=c;

    }

public void run(){
int i=1;
    while(true){
        this.c.produceItem(i);
        try{
            
            Thread.sleep(1000);
        }catch(Exception e ){
            e.getMessage();
        }
        i++;
    }
}
}
