package modeloscajas;

import java.util.ArrayList;
import java.util.List;

public class Destino implements Comparable<Destino> {

	private Integer cantidadCajas;
	private String codigoPostal;
	private Integer cantidadDePasadasPorScanner;
	private Integer pasadaEnQueSeMato;	
	private List<Integer> nodosPorLosQuePaso;

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
		nodosPorLosQuePaso = new ArrayList<Integer>();
	}
	
	public void agregarNodoPorDondePaso(Integer nodo) {
		nodosPorLosQuePaso.add(nodo);
	}
	
	public void mostrarNodosPorDondePaso() {
		String mensaje = "El lote de cajas de codigo postal " + this.codigoPostal +  " paso por los nodos/pasadas: 0";
		for (Integer nodo: this.nodosPorLosQuePaso)
			mensaje+=  " " + nodo;
		System.out.println(mensaje);
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

	public Integer getPasadaEnQueSeMato() {
		return pasadaEnQueSeMato;
	}

	public void setPasadaEnQueSeMato(Integer pasadaEnQueSeMato) {
		this.pasadaEnQueSeMato = pasadaEnQueSeMato;
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
