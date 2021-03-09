package es.calcular;

public class CalcularAreas {
	private int b;
	private int a;
	private double base;
	private double altura;
	private float bas;
	private float alt;

	public CalcularAreas(int b, int a) {
		this.b = b;
		this.a = a;
	}

	public CalcularAreas(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public CalcularAreas(float bas, float alt) {
		this.bas = bas;
		this.alt = alt;
	}

// METODOS QUE CALCULAN LAS DISTINTAS AREAS SEGUN LO SOLICITADO POR LOS RADIO BUTTONS
//CALCULO AREAS INTS
	public int calcularAreaTInt() {
		int area = 0;
		area = b * a;
		return area;
	}

	public int calcularAreaTandRInt() {
		int area = 0;
		area = b * a / 2;
		return area;
	}

//CALCULO AREAS FLOAT
	public Float calcularAreaTFloat() {
		Float area = 0f;
		area = (bas * alt);
		return area;
	}

	public Float calcularAreaTandRFloat() {
		Float area = 0f;
		area = (bas * alt / 2f);
		return area;
	}

//CALCULO AREAS DOUBLE
	public double calcularAreaTDouble() {
		double area = 0.0;
		area = base * altura;
		return area;
	}

	public double calcularAreaTandRDouble() {
		double area = 0.0;
		area = base * altura / 2;
		return area;
	}
}
