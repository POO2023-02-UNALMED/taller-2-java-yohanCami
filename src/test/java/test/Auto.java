package test;

public class Auto {

	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		
		int num_asientos = 0;
		
		for (int i = 0; i <= 3; i++) {
			
		    if(this.asientos[i] != null) {
		    	num_asientos++;
		    }
		}
		
		return num_asientos;
	}
	
	String verificarIntegridad() {
		
		if (this.registro == motor.registro) {
			
			for (int i = 0; i <= 3; i++) {
				
			    if(this.asientos[i].registro != this.registro) {
			    	return "Las piezas no son originales";
			    }
			}
			
			return "Auto original";
			
		}
		
		return "Las piezas no son originales";
		
	}
	
}
