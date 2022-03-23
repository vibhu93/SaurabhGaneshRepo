package saurabh_Automation.saurabh_Automation;

public class java2 {
	public static void main(String[] args) {
		/*
											 * int n=1;
											 * 
											 * Scanner sc=new Scanner(System.in); n=sc.nextInt();
											 * 
											 * while(n<=10) { System.out.println("vaibhu"); n++; }
											 */
		String ac = "ad78a";
		for (int i = 0; i <= ac.length()- 1; i++) {
			if (!(ac.charAt(i) == '7' || ac.charAt(i) == '8'))
			{
				System.out.print(ac.charAt(i));
			}
		}
	}

}
