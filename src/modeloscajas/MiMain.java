package modeloscajas;

public class MiMain {

	public static void main(String[] args) {

		long tiempoInicial = System.currentTimeMillis();
		
		
		PasadaPorScanner scanner = Configuraciones.seleccionarConfiguracion(args);
		scanner.procesarCajas();
		Double tiempoTotal = 0.0;
		System.out.println("\nRESULTADOS: \n");

		for (Destino destino : scanner.getDestinos()) {
			tiempoTotal += scanner.getTiempoProcesamintoPorCaja() * destino.getCantidadDePasadasPorScanner()
					* destino.getCantidadCajas();
			destino.mostrarNodosPorDondePaso();
			System.out.println("El destino "+ destino.getCodigoPostal() +" se mato en la pasada: " + destino.getPasadaEnQueSeMato() + "\n");
		}

		tiempoTotal += scanner.obtenerCantidadPasdasHijas() * scanner.getTiempoSetup();
		System.out.println("\n" + "TIEMPO TOTAL: " + tiempoTotal + "\n");

		Double duracionAlgoritmo = (double) (System.currentTimeMillis() - tiempoInicial);
		System.out.println("Tiempo de duracion de la corrida del algoritmo: " + duracionAlgoritmo + " milisegundos");

	}

}
