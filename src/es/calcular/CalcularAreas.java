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
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public float getBas() {
		return bas;
	}
	public void setBas(float bas) {
		this.bas = bas;
	}
	public float getAlt() {
		return alt;
	}
	public void setAlt(float alt) {
		this.alt = alt;
	}

	public int calcularAreaTInt() {
		int area = b*a;
		return area;
		}
	public int calcularAreaTandRInt() {
		int area = b*a/2;
		return area;
	}
	public Float calcularAreaTFloat() {
		Float area = bas*alt;
		return area;
		}
	public Float calcularAreaTandRFloat() {
		Float area = bas*alt/2f;
		return area;
	}
}
