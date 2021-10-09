import java.util.Scanner;

public class NumeroPrimo {
 
    public static void main(String[] args) {   
    	Scanner leitor= new Scanner (System.in);
    	
    	System.out.println("Digite um numero primo:");
		int Numero= leitor.nextInt();
		if(Numero<=0) {
			System.out.println("Numero invalido!");
		}
		else {
        for (int i = 1; i <= Numero; i++) {
            if( ehPrimo(i) )
            	System.out.println("(" + i + "): E primo"  + "\t");
            else {
            	System.out.println("(" + i + "): Não e primo"  + "\t");
            }
        }   
		}
    }
 
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}
	

