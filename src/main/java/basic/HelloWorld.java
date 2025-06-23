package basic;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");//from x1 branch - for stash demo PLUS //from y1 branch 
	}
	
	public void m1() {
		System.out.println("from method-1");//from c1 branch (for merge conflict) PLUS //from d1 branch (from developer-2 point of view)
	}
	//code change can be one or more files 
}
