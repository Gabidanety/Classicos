package classicos;
import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1,media,idade,maior=0,menor=200,soma,apos=0;
		do {
			System.out.println("Coloque sua idade:");
			idade = in.nextInt();
			soma = idade+apos;
			i++;
			apos=soma;
			if(maior<=idade){
				maior =idade;
			}else if(menor>=idade) {
				menor = idade;
			}
		}while(i<=10);
		media = apos/10;
		
		
		System.out.println("A media das idades e:"+media);
		System.out.println("O mais velho tem "+maior);
		System.out.println("O mais novo tem "+menor);
		
	}

}
