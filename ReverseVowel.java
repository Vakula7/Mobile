import java.util.Scanner;

public class ReverseVowel {

	public static void main(String[] args) {
		String result;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer buf=new StringBuffer(str);
		String output1=buf.reverse().toString();
		System.out.println(output1);
		result=output1.replaceAll("[aeiouAEIOU]","");
		System.out.println(result);
	}
}
