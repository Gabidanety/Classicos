package classicos;

import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,i,resto=0;
		System.out.println("Coloque o numero que deseja:");
		n = in.nextInt();
		  
		for(i=1;i<=n;){
			if(n%i==0){
				resto++;
			}
		}
		if(resto==2){
			System.out.println("e primo!");
		}else{
			System.out.println("Nao e primo!");
		}
			
		}
	}


