package pt3_m6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MainClass {
	static Scanner sc;
	static String verificar = "";
	static boolean salida1 = true;

	public static void main(String[] args) throws IOException {

		sc = new Scanner(System.in);
		Becario b1 = new Becario(introducirNombreApellidos(), introducirSexo(), introducirEdad(), introducirSuspensos(),
				introducirResidencia(), introducirIngresos());
		if (b1.toString().contains("null") || b1.toString().contains("-1") || b1.toString().contains("!")) {
			String[] contenidos = b1.toString().split(",");
			for (int i = 0; i < contenidos.length; i++) {
				if (contenidos[i].contains("null") || contenidos[i].contains("-1")
						|| contenidos[i].toString().contains("!")) {
					if (i == 0) {
						b1.setNomCognom(introducirNombreApellidos());
					} else if (i == 1) {
						b1.setSexo(introducirSexo());
					} else if (i == 2) {
						b1.setEdad(introducirEdad());
					} else if (i == 3) {
						b1.setNumeroSuspensos(introducirSuspensos());
					} else if (i == 4) {
						b1.setResidenciaFamiliar(introducirResidencia());
					} else if (i == 5) {
						b1.setIngresosAnualesFamiliares(introducirIngresos());
					}
				}
			}

		} else {
			File f = new File("becadades.dat");
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			raf.writeChars(b1.nomCognom);
			raf.writeChar(b1.sexo);
			raf.writeInt(b1.edad);
			raf.writeInt(b1.numeroSuspensos);
			raf.writeChars(b1.residenciaFamiliar);
			raf.writeFloat(b1.ingresosAnualesFamiliares);
			raf.writeChar('?');
			raf.close();

		}
		sc.close();
	}

	static public String introducirNombreApellidos() {
		String usuario = "";
		System.out.println("Introduce el nombre y apellido del becario: ");
		usuario = sc.nextLine();
		return usuario;
	}

	static public char introducirSexo() {
		System.out.println("Introduce el sexo, H o M");
		verificar = sc.next();
		if (verificar.equalsIgnoreCase("H") || verificar.equalsIgnoreCase("M")) {
			return verificar.charAt(0);
		}
		System.out.println("Sexo no reconocido");
		return '!';
	}

	static public int introducirEdad() {
		System.out.println("Introduce la edad: ");
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (num >= 20 && num <= 60) {
				return num;
			} else {
				System.out.println("Edad fuera de rango(Mayor de 20 y menor de 40)");
			}
		}
		return -1;

	}

	static public int introducirSuspensos() {
		System.out.println("Introduce los modulos suspendidos: ");
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (num >= 0 && num <= 4) {
				return num;
			} else {
				System.out.println("Demasiados suspensos, vas a repetir");
			}
		}
		return -1;

	}

	static public String introducirResidencia() {
		System.out.println("Introduce si reside con la familia o no(SI/NO)");
		verificar = sc.next();
		if (verificar.equalsIgnoreCase("si") || verificar.equalsIgnoreCase("no")) {
			return verificar;
		}
		System.out.println("Residencia no reconocido");
		return null;
	}

	static public float introducirIngresos() {
		System.out.println("Introduce los ingresos aniales familiares ");
		if (sc.hasNextInt()) {
			float num = sc.nextFloat();
			return num;
		} else {
			System.out.println("Salario no reconocido");
		}

		return -1;

	}

}
