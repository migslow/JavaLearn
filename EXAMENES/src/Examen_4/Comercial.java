package Examen_4;

public class Comercial extends Empleado {
	private double VentasMensuales;

	public Comercial(String nombre, int edad, double salarioBase, double ventasMensuales) {
		super(nombre, edad, salarioBase);
		VentasMensuales = ventasMensuales;
	}

	public double getVentasMensuales() {
		return VentasMensuales;
	}

	public void setVentasMensuales(double ventasMensuales) {
		VentasMensuales = ventasMensuales;
	}

	@Override
	public String toString() {
		return "Comercial [" + super.toString() + " VentasMensuales=" + VentasMensuales + "]";
	}

	public double salarioTotal() {
		return getSalarioBase() + (VentasMensuales / 100);
	}

}
