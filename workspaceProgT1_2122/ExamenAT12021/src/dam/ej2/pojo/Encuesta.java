package dam.ej2.pojo;

import java.util.StringTokenizer;

public class Encuesta {
	
	public static final String PREG_EDAD = "Edad: ";
	public static final String PREG_COVID = "¿Ha pasado usted el COVID-19? ";
	public static final String PREG_SINTOMAS = "¿Qué síntomas padeció? ";
	public static final String PREG_GRAVEDAD = "Nivel de gravedad: ";
	
	private int edad;
	private String respCovid;
	private String sintomas;
	private int gravedad;
	
	public Encuesta(int edad, String respCovid, String sintomas, int gravedad) {
		this.edad = edad;
		this.respCovid = respCovid;
		this.sintomas = sintomas;
		this.gravedad = gravedad;
	}

	@Override
	public String toString() {
		return PREG_EDAD + edad + " años\n" 
				+ PREG_COVID + respCovid + "\n"
				+ PREG_SINTOMAS + sintomas + "\n"
				+ PREG_GRAVEDAD + traducirGravedad();
	}
	
	/*
	 * 1: Ninguna, el 2: Leve, el 3: Media, el 4: Alta y el 5: Hospitalización
	 */
	private String traducirGravedad() {
		String sGravedad = "";
		
		switch (gravedad) {
		case 1:
			sGravedad = "Ninguna";
			break;
		case 2:
			sGravedad = "Leve";
			break;
		case 3:
			sGravedad = "Media";
			break;
		case 4:
			sGravedad = "Alta";
			break;
		case 5:
			sGravedad = "Hospitalización";
			break;
		}
		
		return sGravedad;
	}

	public int calcularNumSintomas() {
		StringTokenizer st = new StringTokenizer(sintomas, ",");
		return st.countTokens();
	}

	public String getRespCovid() {
		return respCovid;
	}

	public int getGravedad() {
		return gravedad;
	}

	public int getEdad() {
		return edad;
	}
	
	

}
