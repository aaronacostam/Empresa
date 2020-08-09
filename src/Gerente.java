
public class Gerente extends SupervisorTecnico {
	
	private static int a�osTrabajados;
	private double viaticos;
	
	public Gerente(String identificacion, double salario, int a�osTrabjados, double viaticos) {
		super(identificacion, salario, a�osTrabajados);
		this.viaticos = viaticos;
	}
	

	@Override
	public double getSalario() {
		return super.getSalario() + viaticos;

	}

}
