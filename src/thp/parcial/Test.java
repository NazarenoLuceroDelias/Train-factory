package thp.parcial;

import thp.parcial.clases.Ferroviaria;
import thp.parcial.clases.TipoVagon;

public class Test {
	private static Ferroviaria emp;

	public static void main(String[] args) {
		emp = new Ferroviaria();
		
		int tren1 = crearFormacion();
		int tren2 = crearFormacion();
		
		System.out.println();
		agregarVagones(tren1, 15, TipoVagon.MEDIUM);
		agregarVagones(tren1, 15, TipoVagon.LARGE);
		agregarVagones(tren2, 20, TipoVagon.SMALL);
		agregarVagones(tren2, 20, TipoVagon.MEDIUM);
		agregarVagones(999, 2, TipoVagon.LARGE);
		
		System.out.println();
		cargarTren(tren1, 151);
		cargarTren(tren1, 252);
		cargarTren(tren2, 353);
		cargarTren(tren2, 4567);
		cargarTren(999, 1);
		
		System.out.println();
		emp.listarCapacidadDisponible();

		System.out.println();
		sacarVagones(tren1);
		sacarVagones(tren1);
		sacarVagones(999);
	}

	private static int crearFormacion() {
		String metodo = "crearFormacion()";
		int tren = emp.crearFormacion();
		System.out.println(metodo + " -> " + tren);
		return tren;
	}
	
	private static void agregarVagones(int tren, int cantidad, TipoVagon tipo) {
		String metodo = "agregarVagones(" + tren + ", " + cantidad + ", " + tipo + ")";
		System.out.println(metodo + " -> " + emp.agregarVagones(tren, cantidad, tipo));
	}

	private static void cargarTren(int tren, double carga) {
		String metodo = "cargarTren(" + tren + ", " + carga + ")";
		System.out.println(metodo + " -> " + emp.cargarTren(tren, carga));
	}
	
	private static void sacarVagones(int tren) {
		String metodo = "sacarVagonesIncompletos(" + tren + ")";
		System.out.println(metodo + " -> " + emp.sacarVagonesIncompletos(tren));
	}

}
