package threadConcept;/** * If you call thread.run method * it will run like other methods, it will execute in main thread * If you call thread.start, it will execute in another thread */class TestCallRun1 extends Thread{     public void run(){         System.out.println("running...");       }       public static void main(String args[]){        TestCallRun1 t1=new TestCallRun1();        t1.run();//fine, but does not start a separate call stack       }      }  