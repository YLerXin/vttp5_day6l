package p1;

//javac -d classes --source-path src src/p1/App.java 
//-d classes is the target folder -d bin also can
//-cp target
//java -cp classes p1.App

public class App {
    public static void main(String[] args) {
        Thread thr = new Thread(new Runnable() {
            public void run(){
                for (int i = 0; i<10;i++){
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                }
            }    
        });
        thr.start();
    }
}
