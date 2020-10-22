package apllication;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		//String a = "Ricardo";
		//String b = "Larissa";
		
		// Fun��o HashCode mais r�pido porem pode apresentar falso em algum momento raro poque geara um numero e compara
		//Fun��o Equals mais r�ido com garantia de teste dos objetos. 
		
		//System.out.println(a.contentEquals(b)); compara variaveis se os objetos s�o iguais 
		

		//System.out.println(a.hashCode());
		//System.out.println(b.hashCode());
		
		Client c1 = new Client("Ricardo", "ricarrdo@gmail.com");
		Client c2 = new Client("Ricardo","ricarrdo@gmail.com");
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");// tratamento especial na compara��o == resul ser� falso 
		String s4 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		System.out.println(c1 == c2);// resultado ser� false para objeto instanciado com new  porque ele compara a referencia onde esta alocado o objeto na memoria que e diferente 
		// j� utilizando variavel iguais o resultado � true
		
		System.out.println(s1 == s2);
		
		System.out.println(s3 == s4);
		
	}

}
