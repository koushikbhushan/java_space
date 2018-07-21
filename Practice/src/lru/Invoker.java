package lru;

public class Invoker {

	public static void main(String[] args) {
		Solution sol = new Solution(2);
		
		//S 2 1 S 1 1 S 2 3 S 4 1 G 1 G 2
		sol.set(2, 1);
		sol.set(1, 1);
		sol.set(2, 3);
		sol.set(4, 1);
		System.out.println("");
	}

}
