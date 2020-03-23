import java.util.Scanner;

public class a1006 {
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		double a = Double.parseDouble(leitor.nextLine());
		double b = Double.parseDouble(leitor.nextLine());
		double c = Double.parseDouble(leitor.nextLine());
		double x = ((a*2)+(b*3)+(c*5))/(2+3+5);
		System.out.printf("MEDIA = %.1f\n", x);
		leitor.close();
		
		
	}
}
