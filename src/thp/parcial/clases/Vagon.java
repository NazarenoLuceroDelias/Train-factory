package thp.parcial.clases;

public class Vagon {
	private TipoVagon tipo;
	private double carga;
	
	public Vagon(TipoVagon tipo) {
		this.tipo = tipo;
		this.carga = 0;
	}

	public double capacidadVagon() {
		double capacidad = 0;
		switch (tipo) {
		case SMALL:
			capacidad = 30;
			break;
		case MEDIUM:
			capacidad = 40;
			break;
		case LARGE:
			capacidad = 50;
			break;
		}
		return capacidad;
	}
	
	public double capacidadLibre() {
		return capacidadVagon() - carga;
	}
                                        //20
	public double cargarVagon(double cantidad) {
	                                             //  20
		double espacioLibre = capacidadVagon() - carga;
		                                        //10
		double aCargar = Math.min(cantidad, espacioLibre);
		        //10
		carga += aCargar;
		
		return cantidad - aCargar;
	}
	
	public boolean estaVacio() {
		return carga == 0;
	}

	public boolean estaLleno() {
		return carga == capacidadVagon();
	}

	public boolean estaIncompleto() {
		return carga > 0 && carga < capacidadVagon();
	}

 }