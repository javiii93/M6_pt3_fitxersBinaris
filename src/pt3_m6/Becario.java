package pt3_m6;


public class Becario {
public String nomCognom;
public char sexo;
public int edad, numeroSuspensos;
public String residenciaFamiliar;
public float ingresosAnualesFamiliares;




	
public Becario(String nomCognom, char sexo, int edad, int numeroSuspensos, String residenciaFamiliar,
		float ingresosAnualesFamiliares) {
	super();
	this.nomCognom = nomCognom;
	this.sexo = sexo;
	this.edad = edad;
	this.numeroSuspensos = numeroSuspensos;
	this.residenciaFamiliar = residenciaFamiliar;
	this.ingresosAnualesFamiliares = ingresosAnualesFamiliares;
}

public String getNomCognom() {
	return nomCognom;
}





public void setNomCognom(String nomCognom) {
	this.nomCognom = nomCognom;
}





public char getSexo() {
	return sexo;
}





public void setSexo(char sexo) {
	this.sexo = sexo;
}





public int getEdad() {
	return edad;
}





public void setEdad(int edad) {
	this.edad = edad;
}





public int getNumeroSuspensos() {
	return numeroSuspensos;
}





public void setNumeroSuspensos(int numeroSuspensos) {
	this.numeroSuspensos = numeroSuspensos;
}





public String getResidenciaFamiliar() {
	return residenciaFamiliar;
}





public void setResidenciaFamiliar(String residenciaFamiliar) {
	this.residenciaFamiliar = residenciaFamiliar;
}





public float getIngresosAnualesFamiliares() {
	return ingresosAnualesFamiliares;
}





public void setIngresosAnualesFamiliares(float ingresosAnualesFamiliares) {
	this.ingresosAnualesFamiliares = ingresosAnualesFamiliares;
}





@Override
public String toString() {
	return "Becario [nomCognom=" + nomCognom + ", sexo=" + sexo + ", edad=" + edad + ", numeroSuspensos="
			+ numeroSuspensos + ", residenciaFamiliar=" + residenciaFamiliar + ", ingresosAnualesFamiliares="
			+ ingresosAnualesFamiliares + "]";
}



}
