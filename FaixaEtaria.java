package classicos;

import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i,idade,f1=0,f2=0,f3=0,f4=0,f5=0,s1,s2,s3,s4,s5,f;
		
		
		for(i=1;i<=15;i++){
			System.out.println("Insira sua idade:");
			idade = in.nextInt ();
			
			if(idade<=15){
				s1 =f1+1;
				f1=s1;
			}else if (idade<=30 && idade>=16){
				s2 = f2+1;
				f2 = s2;
			}else if(idade>=31&& idade<=45 ){
				s3 = f3+1;
				f3 = s3;
			}else if(idade>=46 && idade<=60) {
				s4 = f4+1;
				f4 = s4;
			}else {
				s5 = f5+1;
				f5 = s5;
			}
			
		}
	System.out.println("Faixa etaria 1: "+f1+" pessoas,equivalente a "+f1*100/15+"%"); 
	System.out.println("Faixa etaria 2: "+f2+" pessoas,equivalente a "+f2*100/15+"%");
	System.out.println("Faixa etaria 3: "+f3+" pessoas,equivalente a "+f3*100/15+"%");
	System.out.println("Faixa etaria 4: "+f4+" pessoas,equivalente a "+f4*100/15+"%");
	System.out.println("Faixa etaria 5: "+f5+" pessoas,equivalente a "+f5*100/15+"%");
		
		
	}

}