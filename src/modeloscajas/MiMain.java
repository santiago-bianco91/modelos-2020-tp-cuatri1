package modeloscajas;

public class MiMain {

	// CONFIGURACION ultima

	private static Double TIEMPO_PROC_CAJA = 1.0;
	private static Double TIEMPO_SETUP = 100.0;
	private static Double DESTINOS_POR_PASADA = 9.0;

	private static PasadaPorScanner inicializarScanner() {

		// CAMBIAR ESTO SEGUN EL SET DE DATOS

		PasadaPorScanner scanner = new PasadaPorScanner(DESTINOS_POR_PASADA);
		scanner.agregarDestinoAProcesar(new Destino(100, "A"));
		scanner.agregarDestinoAProcesar(new Destino(100, "B"));
		scanner.agregarDestinoAProcesar(new Destino(100, "C"));
		scanner.agregarDestinoAProcesar(new Destino(100, "D"));
		scanner.agregarDestinoAProcesar(new Destino(100, "E"));
		scanner.agregarDestinoAProcesar(new Destino(100, "F"));
		scanner.agregarDestinoAProcesar(new Destino(100, "G"));
		scanner.agregarDestinoAProcesar(new Destino(100, "H"));
		scanner.agregarDestinoAProcesar(new Destino(100, "I"));
		scanner.agregarDestinoAProcesar(new Destino(100, "J"));
		scanner.agregarDestinoAProcesar(new Destino(100, "K"));
		scanner.agregarDestinoAProcesar(new Destino(100, "L"));
		scanner.agregarDestinoAProcesar(new Destino(100, "M"));
		scanner.agregarDestinoAProcesar(new Destino(100, "N"));
		scanner.agregarDestinoAProcesar(new Destino(100, "O"));
		scanner.agregarDestinoAProcesar(new Destino(100, "P"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(100, "R"));
		scanner.agregarDestinoAProcesar(new Destino(100, "S"));
		scanner.agregarDestinoAProcesar(new Destino(100, "T"));
		scanner.agregarDestinoAProcesar(new Destino(100, "U"));
		scanner.agregarDestinoAProcesar(new Destino(100, "V"));
		scanner.agregarDestinoAProcesar(new Destino(100, "W"));
		scanner.agregarDestinoAProcesar(new Destino(100, "X"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Y"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Z"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AA"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AB"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AC"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AD"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AE"));

		scanner.setearTiempoProcesamiento(TIEMPO_PROC_CAJA);

		return scanner;

	}

	private static void mostrarConfiguracion(PasadaPorScanner pasadaPorScanner) {
		System.out.println("CONFIGURACION:\n");
		System.out.println("tiempo setup de scanner: " + TIEMPO_SETUP);
		System.out.println("tiempo procesamiento por caja: " + TIEMPO_PROC_CAJA);
		System.out.println("cantidad de destinos por pasadas: " + DESTINOS_POR_PASADA + "\n");
		System.out.println("CODIGOS POSTALES CARGADOS: \n");

		for (Destino destino : pasadaPorScanner.getDestinos()) {
			System.out.println(destino.getCodigoPostal() + " con cantidad de cajas: " + destino.getCantidadCajas());
		}

	}

	public static void main(String[] args) {
		PasadaPorScanner scanner = inicializarScanner();
		mostrarConfiguracion(scanner);
		scanner.procesarCajas();
		Double tiempoTotal = 0.0;
		for (Destino destino : scanner.getDestinos()) {
//			System.out.println(destino.getCodigoPostal() + ": " + destino.getCantidadDePasadasPorScanner());
			tiempoTotal += scanner.getTiempoProcesamiento() * destino.getCantidadDePasadasPorScanner()
					* destino.getCantidadCajas();
		}
		tiempoTotal += scanner.obtenerCantidadPasdasHijas() * TIEMPO_SETUP;
		System.out.println("TIEMPO TOTAL: " + tiempoTotal);
//		System.out.println("Cantidad de setups: " + scanner.obtenerCantidadPasdasHijas());

	}

}
