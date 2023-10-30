package lambda;


public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable basic=()->	{ String threadname=Thread.currentThread().getName();
		System.out.println("thread name:"+threadname);};
		Thread t1=new Thread(basic);
		Thread t2=new Thread(basic);
		t1.start();
		t2.start();
		
	}

}


