package dam.scif.ej5.pojo;

public class Rueda {
	
	static final double DIAM_INF = 0.8;
	static final double DIAM_SUP = 1.4;
	static final double GROS_INF = 0.25;
	static final double GROS_SUP = 0.4;
	
	private String marca;
	private double diametro;
	private double grosor;
	
	public Rueda(String marca, double diametro, double grosor) {
		this.marca = marca;
		this.diametro = diametro;
		this.grosor = grosor;
	}
	
	public String comprobarDiametro() {
		String mensaje = "";
		
		if (diametro > DIAM_SUP) {
			mensaje = "La rueda es para un vehículo grande";
		} else if (diametro > DIAM_INF) {
			mensaje = "La rueda es para un vehículo mediano";
		} else {
			mensaje = "La rueda es para un vehículo pequeño";
		}
		
		return mensaje;
	}
	
	public String comprobarGrosor() {
		String mensaje = "";
		
		if ((diametro > DIAM_SUP && grosor < GROS_SUP) || 
				(diametro <= DIAM_SUP && diametro > DIAM_INF && grosor < GROS_INF)) {
			mensaje = "El grosor para esta rueda es inferior al recomendado";
		} else {
			mensaje = "La rueda tiene un grosor adecuado";
		}
		
		return mensaje;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + ", Diámetro: " + diametro + ", Grosor:" + grosor;
	}
	
	
}
