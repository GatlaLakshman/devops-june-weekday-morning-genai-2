package basic;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	//from b1 branch , in real time it could be a bug fix or new fix or modification or deletion of the feature( dx )
	public void m1() {
		System.out.println("from method-1");//from c1 branch (for merge conflict) PLUS //from d1 branch (from developer-2 point of view)
	}
	//code change can be one or more files 
}
