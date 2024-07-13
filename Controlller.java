public class Controlller {
    public static void main(String[] args) {
        System.out.println("Program starts ..!!");
        Company comp= new Company();
        Producer p =new Producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();

        System.out.println("Program ends ..!!");
    }
    
}
