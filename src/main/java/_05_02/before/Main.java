package _05_02.before;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new ThreadExample();
        Thread t2 = new ThreadExample();

        // Set custom name
        t1.setName("1st T");
        t2.setName("2nd T");

        // Both started in same time
        t1.start();
        t2.start();
    }

}
