package Thread;
// crate thread
class MyTHread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

// implement runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using runnable");
    }
}

public class ThreadConcept {
    public static void main(String[] args) throws InterruptedException {
        MyTHread t = new MyTHread(); // create a instace of the thread
        t.start(); // start the thread

        MyRunnable r = new MyRunnable();
        Thread th = new Thread(r); // pass the runnable instance to thread
        th.start(); // start the thread

        // usign lambda expression
        Thread g = new Thread(() -> System.out.println("thread is running using lambda"));
        g.start();

        // example of thread sleep and join
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 4; i++) {
                System.out.println("thread 1:" + i);
                try {
                    Thread.sleep(500); // pause for 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 4; i++) {
                System.out.println("thread 2:" + i);
                try {
                    Thread.sleep(500); // pause for 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join(); // wait for t1 to finish
        t2.join(); // wait for t1 to finish

        System.out.println("Main Thread finished");

        // Thread priorities -> rang from 1 to 10
        Thread b1 = new Thread(() -> System.out.println("thredd 1 prior"));
        Thread b2 = new Thread(() -> System.out.println("thredd 2 prior"));

        b1.setPriority(Thread.MIN_PRIORITY); // priority 1
        b2.setPriority(Thread.MAX_PRIORITY); // priority 10

        b1.start();
        b2.start();

    }
}

// thread is a lightweight process that enable to perform multiple task
// simultaneously

// thread lifecycle :
// 1.New ->object is created but not yet started
// 2.runnable -> thread is ready to run and awaiting for cpu time
// 3. running-> thread is currently executing
// 4. blocked / waiting-> thread is paused ,waiting for resources or condition
// 5. termination -> thread has finished execution

// method of thread class
// start()->start the thread
// run()-> contain code and define the thread behaviour
// sleep(milisecond)->pause for specific time
// getName()->return the thread name
// setName()->set the thread getName
// isAlive()->check the thread is still running
// yield()->pause current thread and executing other thread
// setPriority()->set the thread priority( 1 to 10)
// join()-> wait for thread to finished execution