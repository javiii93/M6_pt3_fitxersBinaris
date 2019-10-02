package pt3_m6;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void IntroducirDatos() {
		String usuario="",verificar="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el nombre y apellido del becario: ");
		usuario=usuario+sc.nextLine();
		System.out.println("Introduce el sexo, H o M");
		verificar=sc.next();
		if(verificar.equalsIgnoreCase("H")||verificar.equalsIgnoreCase("M")) {
			usuario=usuario+verificar;
		}else {
			System.out.println("Sexo no reconocido");
		}
		
		sc.close();
	}

	
}
