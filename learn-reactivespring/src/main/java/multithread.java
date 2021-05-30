import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class multithread implements Callable<String> {
//    @Override
//    public void run() {
//        System.out.println("in multi thread");
//    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Thread t = new Thread(new multithread());
//        t.run();

        ExecutorService executorService = Executors.newFixedThreadPool(100);

        List<Future<String>> list = new ArrayList<Future<String>>();

        Callable<String> callable = new multithread();

    
        for(int i = 0 ; i <100 ; i++){

            Future<String> future = executorService.submit(callable);
            list.add(future);
        }

        for (Future<String> fut: list
             ) {

            System.out.println(new Date() +"::"+ fut.get());
        }

        executorService.shutdown();
    }

    @Override
    public String call() throws Exception {
//        System.out.println("in ,multithread");
Thread.sleep(100);
        return String.valueOf("in ,multithread");
    }
}
