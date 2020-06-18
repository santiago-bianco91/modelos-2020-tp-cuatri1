package modeloscajas;

public class GeneradorIDsPasadasPorScanner {

	private int id;

	public Integer generarID() {
		Integer snapshootID = new Integer(id);
		id++;
		return snapshootID;
	}

	public GeneradorIDsPasadasPorScanner() {
		id = 0;
	}
}
