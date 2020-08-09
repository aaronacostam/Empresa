
public class Gerente extends SupervisorTecnico {
	
	private static int añosTrabajados;
	private double viaticos;
	
	public Gerente(String identificacion, double salario, int añosTrabjados, double viaticos) {
		super(identificacion, salario, añosTrabajados);
		this.viaticos = viaticos;
	}
	

	@Override
	public double getSalario() {
		return super.getSalario() + viaticos;

	}

}
