package pt3_m6;

import java.text.ParseException;
import java.util.Scanner;

public class MainClass {
	static Scanner sc;
	static String verificar = "";

	public static void main(String[] args) {
		//Becario b1=new Becario(introducirNombreApellidos(), introducirSexo(), introducirEdad(), introducirSuspensos(), residenciaFamiliar, ingresosAnualesFamiliares)
	introducirSexo();
	}

	static public String introducirNombreApellidos() {
		sc = new Scanner(System.in);
		String usuario = "";
		System.out.println("Introduce el nombre y apellido del becario: ");
		usuario = sc.nextLine();
		sc.close();
		return usuario;
	}

	static public String introducirSexo() {
		sc = new Scanner(System.in);
		while(true) {
			sc.nextLine();
			System.out.println("Introduce el sexo, H o M");
		
		verificar = sc.next();
		sc.close();
		if (verificar.equalsIgnoreCase("H") || verificar.equalsIgnoreCase("M")) {
			return verificar;
		}
		System.out.println("Sexo no reconocido");
		}
	}

	static public String introducirEdad() {
		sc = new Scanner(System.in);
		System.out.println("Introduce la edad: ");
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			sc.close();
			if (num >= 20 && num <= 40) {
				return Integer.toString(num);
			} else {
				System.out.println("Edad fuera de rango(Mayor de 20 y menor de 40)");
			}
		}sc.close();
		return null;

	}
	static public String introducirSuspensos() {
		sc = new Scanner(System.in);
		System.out.println("Introduce los modulos suspendidos: ");
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			sc.close();
			if (num >= 0 && num <= 4) {
				return Integer.toString(num);
			} else {
				System.out.println("Demasiados suspensos, vas a repetir");
			}
		}sc.close();
		return null;

	}

}
