package ASSIGNMENTS;

public class Assignment2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3, c, k, space = 1;

		space = n - 1;

		for (k = 1; k <= n; k++) {
			for (c = 1; c <= space; c++)
				System.out.print(" ");

			space--;

			for (c = 1; c <= 2 * k - 1; c++) {
				if(c==n && k==n) 
				System.out.print("c");
				else if(c==n-1 || c==n+1)
					System.out.print("b");
				else
					System.out.print("a");
			}
			System.out.println("");
		}

		space = 1;

		for (k = 1; k <= n - 1; k++) {
			for (c = 1; c <= space; c++)
				System.out.print(" ");

			space++;

			for (c = 1; c <= 2 * (n - k) - 1; c++)
			{
			if (c==n-1 || c==n+1)
				System.out.print("b");
			else
				System.out.print("a");
			}
			System.out.println("");
		}
	}
}
