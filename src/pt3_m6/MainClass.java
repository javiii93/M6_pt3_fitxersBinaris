package pt3_m6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MainClass {
	static Scanner sc;
	static String verificar = "", nom, nom2;
	static boolean salida1 = true;
	static int opcion = 0, h = 1;

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);
		while (salida1) {
			menu();
			if (sc.hasNextInt()) {
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					nom = "b" + h;
					sc.nextLine();
					Becario nom = new Becario(introducirNombreApellidos(), introducirSexo(), introducirEdad(),
							introducirSuspensos(), introducirResidencia(), introducirIngresos());
					while (nom.toString().contains("null") || nom.toString().contains("-1")
							|| nom.toString().contains("!")) {
						String[] contenidos = nom.toString().split(",");
						for (int i = 0; i < contenidos.length; i++) {
							if (contenidos[i].contains("null") || contenidos[i].contains("-1")
									|| contenidos[i].toString().contains("!")) {
								if (i == 0) {
									nom.setNomCognom(introducirNombreApellidos());
								} else if (i == 1) {
									nom.setSexo(introducirSexo());
								} else if (i == 2) {
									nom.setEdad(introducirEdad());
								} else if (i == 3) {
									nom.setNumeroSuspensos(introducirSuspensos());
								} else if (i == 4) {
									nom.setResidenciaFamiliar(introducirResidencia());
								} else if (i == 5) {
									nom.setIngresosAnualesFamiliares(introducirIngresos());
								}
							}
						}
					}
					nom2 = nom2 + h;
					File nom2 = new File("becadades.dat");
					RandomAccessFile raf = new RandomAccessFile(nom2, "rw");
					System.out.println(raf.getFilePointer());
					raf.writeChars(nom.nomCognom);
					raf.writeChar(nom.sexo);
					raf.writeInt(nom.edad);
					raf.writeInt(nom.numeroSuspensos);
					raf.writeChars(nom.residenciaFamiliar);
					raf.writeFloat(nom.ingresosAnualesFamiliares);
					raf.writeChar('?');
					System.out.println(raf.length());
					System.out.println(raf.getFilePointer());
					raf.close();

					break;
				case 2:
					break;
				case 3:
					salida1 = false;
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Opcion no reconocida");
				}
			} else {
				sc.next();
				System.out.println("Opcion no reconocida, vuelva a introducirla");
			}
			h++;
		}

		sc.close();
	}

	static public void menu() {
		System.out.println("Elige una opcion: ");
		System.out.println("1.- Ingresar alumno");
		System.out.println("2.- Listar archivo becadades.dat ");
		System.out.println("3.- Salir ");
		System.out.println("---------------------------------");
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
