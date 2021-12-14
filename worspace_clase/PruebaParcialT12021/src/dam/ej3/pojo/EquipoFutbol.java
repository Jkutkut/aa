package dam.ej3.pojo;

public class EquipoFutbol {
	
	static final int PTOS_GAN = 3;
	static final int PTOS_EMP = 1;
	static final int PTOS_PER = 0;
	
	private String nombre;
	private String ciudad;
	private int numPartGan;
	private int numPartEmp;
	private int numPartPer;
	
	public EquipoFutbol(String nombre, String ciudad, int numPartGan, int numPartEmp, 
			int numPartPer) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numPartGan = numPartGan;
		this.numPartEmp = numPartEmp;
		this.numPartPer = numPartPer;
	}

	public int calcularPuntos() {
		return numPartGan * PTOS_GAN + numPartEmp * PTOS_EMP + numPartPer * PTOS_PER;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return nombre + " - " + ciudad 
				+ "\nNúmero de partidos ganados: " + numPartGan 
				+ "\nNúmero de partidos empatados: " + numPartEmp 
				+ "\nNúmero de partidos perdidos: " + numPartPer;
	}
	
	
}
