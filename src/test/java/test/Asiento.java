package test;

public class Asiento {

	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		if(color == "rojo" || color == "verde" || color == "amarillo" || color == "negro" || color == "blanco") {
			this.color = color;
		} else {
			System.out.println("Este valor de color no está permitido");
		}
	}
}
