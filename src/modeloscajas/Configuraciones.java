package modeloscajas;

public class Configuraciones {

	public static PasadaPorScanner configuracionUnoA() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));

		mostrarConfiguracion(scanner, "CONFIGURACION 1 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionUnoB() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));

		mostrarConfiguracion(scanner, "CONFIGURACION 1 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionDosA() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));

		mostrarConfiguracion(scanner, "CONFIGURACION 2 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionDosB() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));

		mostrarConfiguracion(scanner, "CONFIGURACION 2 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionTresA() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(30, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));

		mostrarConfiguracion(scanner, "CONFIGURACION 3 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionTresB() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(30, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));

		mostrarConfiguracion(scanner, "CONFIGURACION 3 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionCuatroA() {

		Double destinosPorPasdas = 3.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(30, "A"));
		scanner.agregarDestinoAProcesar(new Destino(30, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));

		mostrarConfiguracion(scanner, "CONFIGURACION 4 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionCuatroB() {

		Double destinosPorPasdas = 3.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(30, "A"));
		scanner.agregarDestinoAProcesar(new Destino(30, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));

		mostrarConfiguracion(scanner, "CONFIGURACION 4 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionCincoA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));

		mostrarConfiguracion(scanner, "CONFIGURACION 5 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionCincoB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));

		mostrarConfiguracion(scanner, "CONFIGURACION 5 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionSeisA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));

		mostrarConfiguracion(scanner, "CONFIGURACION 6 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionSeisB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));

		mostrarConfiguracion(scanner, "CONFIGURACION 6 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionSieteA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));
		scanner.agregarDestinoAProcesar(new Destino(10, "P"));
		scanner.agregarDestinoAProcesar(new Destino(10, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(10, "R"));

		mostrarConfiguracion(scanner, "CONFIGURACION 7 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionSieteB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));
		scanner.agregarDestinoAProcesar(new Destino(10, "P"));
		scanner.agregarDestinoAProcesar(new Destino(10, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(10, "R"));

		mostrarConfiguracion(scanner, "CONFIGURACION 7 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionOchoA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));
		scanner.agregarDestinoAProcesar(new Destino(10, "P"));
		scanner.agregarDestinoAProcesar(new Destino(10, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(10, "R"));
		scanner.agregarDestinoAProcesar(new Destino(10, "S"));

		mostrarConfiguracion(scanner, "CONFIGURACION 8 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionOchoB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));
		scanner.agregarDestinoAProcesar(new Destino(10, "P"));
		scanner.agregarDestinoAProcesar(new Destino(10, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(10, "R"));
		scanner.agregarDestinoAProcesar(new Destino(10, "S"));

		mostrarConfiguracion(scanner, "CONFIGURACION 8 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionNueveA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(60, "A"));
		scanner.agregarDestinoAProcesar(new Destino(20, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(40, "D"));
		scanner.agregarDestinoAProcesar(new Destino(80, "E"));
		scanner.agregarDestinoAProcesar(new Destino(900, "F"));
		scanner.agregarDestinoAProcesar(new Destino(50, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(400, "I"));
		scanner.agregarDestinoAProcesar(new Destino(450, "J"));
		scanner.agregarDestinoAProcesar(new Destino(200, "K"));
		scanner.agregarDestinoAProcesar(new Destino(1200, "L"));
		scanner.agregarDestinoAProcesar(new Destino(1000, "M"));
		scanner.agregarDestinoAProcesar(new Destino(50, "N"));
		scanner.agregarDestinoAProcesar(new Destino(90, "O"));
		scanner.agregarDestinoAProcesar(new Destino(500, "P"));
		scanner.agregarDestinoAProcesar(new Destino(30, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(120, "R"));
		scanner.agregarDestinoAProcesar(new Destino(300, "S"));

		mostrarConfiguracion(scanner, "CONFIGURACION 9 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionNueveB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(60, "A"));
		scanner.agregarDestinoAProcesar(new Destino(20, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(40, "D"));
		scanner.agregarDestinoAProcesar(new Destino(80, "E"));
		scanner.agregarDestinoAProcesar(new Destino(900, "F"));
		scanner.agregarDestinoAProcesar(new Destino(50, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(400, "I"));
		scanner.agregarDestinoAProcesar(new Destino(450, "J"));
		scanner.agregarDestinoAProcesar(new Destino(200, "K"));
		scanner.agregarDestinoAProcesar(new Destino(1200, "L"));
		scanner.agregarDestinoAProcesar(new Destino(1000, "M"));
		scanner.agregarDestinoAProcesar(new Destino(50, "N"));
		scanner.agregarDestinoAProcesar(new Destino(90, "O"));
		scanner.agregarDestinoAProcesar(new Destino(500, "P"));
		scanner.agregarDestinoAProcesar(new Destino(30, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(120, "R"));
		scanner.agregarDestinoAProcesar(new Destino(300, "S"));

		mostrarConfiguracion(scanner, "CONFIGURACION 9 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionDiezA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(60, "A"));
		scanner.agregarDestinoAProcesar(new Destino(20, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(40, "D"));
		scanner.agregarDestinoAProcesar(new Destino(80, "E"));
		scanner.agregarDestinoAProcesar(new Destino(900, "F"));
		scanner.agregarDestinoAProcesar(new Destino(50, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(400, "I"));
		scanner.agregarDestinoAProcesar(new Destino(450, "J"));
		scanner.agregarDestinoAProcesar(new Destino(200, "K"));
		scanner.agregarDestinoAProcesar(new Destino(1200, "L"));
		scanner.agregarDestinoAProcesar(new Destino(1000, "M"));
		scanner.agregarDestinoAProcesar(new Destino(50, "N"));
		scanner.agregarDestinoAProcesar(new Destino(90, "O"));
		scanner.agregarDestinoAProcesar(new Destino(500, "P"));
		scanner.agregarDestinoAProcesar(new Destino(30, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(120, "R"));
		scanner.agregarDestinoAProcesar(new Destino(300, "S"));
		scanner.agregarDestinoAProcesar(new Destino(200, "T"));

		mostrarConfiguracion(scanner, "CONFIGURACION 10 SIN TIEMPO DE SETUP");

		return scanner;

	}
	
	public static PasadaPorScanner configuracionDiezB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = new PasadaPorScanner(destinosPorPasdas, tiempoSetup, tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(60, "A"));
		scanner.agregarDestinoAProcesar(new Destino(20, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(40, "D"));
		scanner.agregarDestinoAProcesar(new Destino(80, "E"));
		scanner.agregarDestinoAProcesar(new Destino(900, "F"));
		scanner.agregarDestinoAProcesar(new Destino(50, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(400, "I"));
		scanner.agregarDestinoAProcesar(new Destino(450, "J"));
		scanner.agregarDestinoAProcesar(new Destino(200, "K"));
		scanner.agregarDestinoAProcesar(new Destino(1200, "L"));
		scanner.agregarDestinoAProcesar(new Destino(1000, "M"));
		scanner.agregarDestinoAProcesar(new Destino(50, "N"));
		scanner.agregarDestinoAProcesar(new Destino(90, "O"));
		scanner.agregarDestinoAProcesar(new Destino(500, "P"));
		scanner.agregarDestinoAProcesar(new Destino(30, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(120, "R"));
		scanner.agregarDestinoAProcesar(new Destino(300, "S"));
		scanner.agregarDestinoAProcesar(new Destino(200, "T"));

		mostrarConfiguracion(scanner, "CONFIGURACION 10 CON TIEMPO DE SETUP");

		return scanner;

	}

	
	private static void mostrarConfiguracion(PasadaPorScanner pasadaPorScanner, String nombreConfiguracion) {
		System.out.println("CONFIGURACION: " + nombreConfiguracion + "\n");
		System.out.println("tiempo setup de scanner: " + pasadaPorScanner.getTiempoSetup());
		System.out.println("tiempo procesamiento por caja: " + pasadaPorScanner.getTiempoProcesamintoPorCaja());
		System.out
				.println("cantidad de destinos por pasadas: " + pasadaPorScanner.getCantidadDestinosPorPasada() + "\n");
		System.out.println("CODIGOS POSTALES CARGADOS: \n");

		for (Destino destino : pasadaPorScanner.getDestinos()) {
			System.out.println(destino.getCodigoPostal() + " con cantidad de cajas: " + destino.getCantidadCajas());
		}

	}

}
