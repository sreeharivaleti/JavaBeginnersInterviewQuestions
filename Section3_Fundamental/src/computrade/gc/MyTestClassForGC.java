package computrade.gc;

public class MyTestClassForGC {
	
	
	public MyTestClassForGC(){
		System.out.println("MyTestClassForGC initialized");
		
	}
	
	
	public void doingSomething()  {
		System.out.println("running doingSomething method.");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Inside the MyTestClassForGC.finalize method before it is being garabge collected.");
		super.finalize();
	}

}
