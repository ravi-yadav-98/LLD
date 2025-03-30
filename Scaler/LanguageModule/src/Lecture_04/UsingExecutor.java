package Lecture_04;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class UsingExecutor {
    public static void main(String[] args) {
        Executor executor = Executors.newCachedThreadPool();
//        executor.execute();
    }
}
