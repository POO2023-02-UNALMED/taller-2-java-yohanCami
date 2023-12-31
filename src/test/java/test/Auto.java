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
		
		for (int i = 0; i < asientos.length; i++) {
			
		    if(this.asientos[i] != null) {
		    	num_asientos++;
		    }
		}
		
		return num_asientos;
	}
	
	String verificarIntegridad() {
		
		if (this.registro == this.motor.registro) {
			
			for (int i = 0; i < this.asientos.length; i++) {
			    
			    if(this.asientos[i] != null) {

			    	if(this.asientos[i].registro != this.registro) {
				    	return "Las piezas no son originales";
				    }
			    	
			    }
			}
			
			return "Auto original";
			
		}
		
		return "Las piezas no son originales";
		
	}
	
}
