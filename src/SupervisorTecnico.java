
public class SupervisorTecnico extends Empleado {
	
	private int aņosTrabajados;
	
	public SupervisorTecnico(String identificacion, double salario, int aņosTrabajados) {
		super(identificacion, salario);
		this.aņosTrabajados = aņosTrabajados;
	}
	
	public int getAņosTrabajados() {
		return aņosTrabajados;
	}
	
	public void setAņosTrabajados(int aņosTrabajados) {
		this.aņosTrabajados = aņosTrabajados;
	}
	
	@Override
	public double getSalario() {
		double salario = super.getSalario();
		double aumento = 0;
		for(int i=0; i<aņosTrabajados;i++) {
			aumento += salario * 0.05;
		}
		
		return salario + aumento;
	}

}