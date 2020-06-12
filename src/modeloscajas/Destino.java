package modeloscajas;

public class Destino implements Comparable<Destino> {

	private Integer cantidadCajas;
	private String codigoPostal;
	private Integer cantidadDePasadasPorScanner;

	public Integer getCantidadDePasadasPorScanner() {
		return cantidadDePasadasPorScanner;
	}

	public void setCantidadDePasadasPorScanner(Integer cantidadDePasadasPorScanner) {
		this.cantidadDePasadasPorScanner = cantidadDePasadasPorScanner;
	}

	public void incrementarCantidadDePasadas() {
		this.cantidadDePasadasPorScanner++;
	}

	public Destino(Integer cantidadCajas, String codigoPostal) {
		super();
		this.cantidadCajas = cantidadCajas;
		this.codigoPostal = codigoPostal;
		this.cantidadDePasadasPorScanner = 0;
	}

	public Integer getCantidadCajas() {
		return cantidadCajas;
	}

	public void setCantidadCajas(Integer cantidadCajas) {
		this.cantidadCajas = cantidadCajas;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public int compareTo(Destino destino) {
		if (cantidadCajas < destino.cantidadCajas) {
			return -1;
		}
		if (cantidadCajas > destino.cantidadCajas) {
			return 1;
		}
		return 0;
	}

}
