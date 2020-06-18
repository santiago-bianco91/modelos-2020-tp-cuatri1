package modeloscajas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasadaPorScanner {

	private Integer id;
	private List<Destino> destinos;
	private Double cantidadDestinosPorPasada;
	private Double totalCajasAprocesar;
	private List<PasadaPorScanner> pasadasPorScannerHijas;
	private Double umbralScanner;
	private double tiempoProcesamintoPorCaja;
	private double tiempoSetup;
	private GeneradorIDsPasadasPorScanner generadorIDsPasadasPorScanner;

	public Double getDestinosPorPasadas() {
		return cantidadDestinosPorPasada;
	}

	public double getTiempoProcesamintoPorCaja() {
		return tiempoProcesamintoPorCaja;
	}

	public double getTiempoSetup() {
		return tiempoSetup;
	}

	public void agregarDestinoAProcesar(Destino destino) {
		this.destinos.add(destino);
		this.totalCajasAprocesar += destino.getCantidadCajas();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Destino> getDestinos() {
		return destinos;
	}

	public Double getCantidadDestinosPorPasada() {
		return cantidadDestinosPorPasada;
	}

	public void setCantidadDestinosPorPasada(Double cantidadDestinosPorPasada) {
		this.cantidadDestinosPorPasada = cantidadDestinosPorPasada;
	}

	private void actualizarNumeroProcesamientoDestinos() {
		for (Destino destino : this.destinos) {
			destino.incrementarCantidadDePasadas();
		}
	}

	private void setearEnQuePasadaSeMataronLosDestinos() {
		for (Destino destino : this.destinos) {
			destino.setPasadaEnQueSeMato(this.id);
		}
	}

	public Double getTotalCajasAprocesar() {
		return totalCajasAprocesar;
	}

	public void setTotalCajasAprocesar(Double totalCajasAprocesar) {
		this.totalCajasAprocesar = totalCajasAprocesar;
	}

	private Boolean esElUltimoScanner() {
		return (this.pasadasPorScannerHijas.size() == this.cantidadDestinosPorPasada);
	}

	public List<PasadaPorScanner> getPasadasPorScannerHijas() {
		return pasadasPorScannerHijas;
	}

	public PasadaPorScanner crearPasadaPorScannerHija() {
		return new PasadaPorScanner(this.cantidadDestinosPorPasada, this.tiempoSetup, this.tiempoProcesamintoPorCaja,
				this.generadorIDsPasadasPorScanner);
	}

	public static PasadaPorScanner crearPasadaPorScanner(Double cantidadDestinosPorPasada, Double tiempoSetup,
			Double tiempoProcesamintoPorCaja) {
		return new PasadaPorScanner(cantidadDestinosPorPasada, tiempoSetup, tiempoProcesamintoPorCaja, null);
	}

	public PasadaPorScanner(Double cantidadDestinosPorPasada, Double tiempoSetup, Double tiempoProcesamintoPorCaja,
			GeneradorIDsPasadasPorScanner generadorIDsPasadasPorScanner) {
		super();
		this.cantidadDestinosPorPasada = cantidadDestinosPorPasada;
		this.umbralScanner = (double) (1 / cantidadDestinosPorPasada);
		this.pasadasPorScannerHijas = null;
		this.destinos = new ArrayList<Destino>();
		this.totalCajasAprocesar = 0.0;
		this.tiempoSetup = tiempoSetup;
		this.tiempoProcesamintoPorCaja = tiempoProcesamintoPorCaja;
		this.pasadasPorScannerHijas = new ArrayList<PasadaPorScanner>();
		if (generadorIDsPasadasPorScanner != null) {
			this.generadorIDsPasadasPorScanner = generadorIDsPasadasPorScanner;
		} else {
			this.generadorIDsPasadasPorScanner = new GeneradorIDsPasadasPorScanner();
		}
		this.id = this.generadorIDsPasadasPorScanner.generarID();

	}

	// devuelve true si = la cantidad de cajas que va a tener el scanner hijo
	// superara el umbral y tiene mas de un destino
	public Boolean estaLlenoElScanner(PasadaPorScanner pasadaScannerHijo, Destino destinoNuevo) {
		Double cantidadCajasRelativasDestino = (double) ((pasadaScannerHijo.getTotalCajasAprocesar()
				+ destinoNuevo.getCantidadCajas()) / totalCajasAprocesar);
		return (cantidadCajasRelativasDestino > this.umbralScanner && !pasadaScannerHijo.getDestinos().isEmpty());
	}

	private void asignarDestinosAScannersHijos() {
		// creo primer pasada de scanner hija
		PasadaPorScanner pasadaPorScannerHija = crearPasadaPorScannerHija();
		this.pasadasPorScannerHijas.add(pasadaPorScannerHija);

		for (Destino destinoAAsignar : this.destinos) {
			PasadaPorScanner ultimaPasadaPorScanner = this.pasadasPorScannerHijas
					.get(this.pasadasPorScannerHijas.size() - 1);
			if (!this.estaLlenoElScanner(ultimaPasadaPorScanner, destinoAAsignar) || esElUltimoScanner()) {
				ultimaPasadaPorScanner.agregarDestinoAProcesar(destinoAAsignar);
			} else {
				PasadaPorScanner nuevaPasadaPorScanner = crearPasadaPorScannerHija();
				nuevaPasadaPorScanner.agregarDestinoAProcesar(destinoAAsignar);
				this.pasadasPorScannerHijas.add(nuevaPasadaPorScanner);
			}
		}
	}

	public void procesarCajas() {
		// ordeno descendentemente por cantidad de cajas
		Collections.sort(destinos, Collections.reverseOrder());
		// si tengo mas o igual vias que periodos el problema se acaba aca
		if (this.destinos.size() > 1) {
			asignarDestinosAScannersHijos();
			actualizarNumeroProcesamientoDestinos();
		}
		setearEnQuePasadaSeMataronLosDestinos();
		procesarScannerHijos();
	}

	private void procesarScannerHijos() {
		for (PasadaPorScanner scannerHijo : this.pasadasPorScannerHijas) {
			scannerHijo.procesarCajas();
		}
	}

	public ContadorPasadas obtenerCantidadPasdasHijas(ContadorPasadas contadorPasadas) {
		if (this.pasadasPorScannerHijas == null) {
			return contadorPasadas;
		} else {
			for (PasadaPorScanner pasada : this.pasadasPorScannerHijas) {
				if (pasada.getPasadasPorScannerHijas() != null && pasada.getPasadasPorScannerHijas().size() > 1) {
					contadorPasadas.incrementar();
					pasada.obtenerCantidadPasdasHijas(contadorPasadas);
				}
			}
		}

		return contadorPasadas;
	}

	public Integer obtenerCantidadPasdasHijas() {
		ContadorPasadas contadorPasadas = new ContadorPasadas();
		obtenerCantidadPasdasHijas(contadorPasadas);
		return contadorPasadas.getContador();
	}

}