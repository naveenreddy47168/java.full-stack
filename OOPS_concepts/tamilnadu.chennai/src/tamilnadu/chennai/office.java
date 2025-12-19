package tamilnadu.chennai;

public class office {
	protected int salary=30000;

	public static void main(String[] args) {
		office Off=new office();
		Off.work();
		Off.wfh();
		Off.recurit();
		Off.travelallowance();
		Off.dobusinessplan();
		
		System.out.println(Off.salary);
	}
	public void work() {
		System.out.println("working");
	}
	public void wfh()
	{
		System.out.println("work from home");
	}
	  public void recurit() {
		  System.out.println("recurit");
	  }
	  void travelallowance()
	  {
		  System.out.println("travel _ allows are provide");
	  }
	  private void dobusinessplan()
	  {
		  System.out.println("planning");
	  }
}
