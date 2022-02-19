public class Main {
    public static void main(String[] args) {
        ABC abc = new ABC();
        Thread thread1 = new Thread(abc::printA);
        Thread thread2 = new Thread(abc::printB);
        Thread thread3 = new Thread(abc::printC);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
