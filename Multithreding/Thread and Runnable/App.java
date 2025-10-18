

class MyThread extends Thread{

    @Override
	public void run(){
      for (int i=1;i<=10;i++ ) {
      	System.out.println(Thread.currentThread().getName()+"mythread");
      }
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run(){
      for (int i=1;i<=10;i++ ) {
      	System.out.println(Thread.currentThread().getName()+"myRunnable");
      }
	}
}


class App{

 
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		//if you do t1.run() thread will be not create
		t1.start();

           
		MyRunnable r1=new MyRunnable();
		Thread t2=new Thread(r1);
		t2.start();

		for (int i=1;i<=10;i++ ) {
      	System.out.println(Thread.currentThread().getName()+"main");
      }
	}
}