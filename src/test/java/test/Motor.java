package test;

public class Motor {

	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		
		this.registro = registro;
	}
	
	void asignar(String tipo) {
	
		if(tipo == "electrico" || tipo == "gasolina") {
			this.tipo = tipo;
		} else {
			System.out.println("Este valor de tipo no está permitido");
		}
		
	}
}
