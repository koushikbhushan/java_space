package learn;

public class Learn {
	public final int var;
	public transient int test;
	public Learn(){
		this(5);
	}
	public Learn(int a){
		this.var = a;
	}
}
