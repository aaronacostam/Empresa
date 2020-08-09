
public class SupervisorTecnico extends Empleado {
	
	private int a�osTrabajados;
	
	public SupervisorTecnico(String identificacion, double salario, int a�osTrabajados) {
		super(identificacion, salario);
		this.a�osTrabajados = a�osTrabajados;
	}
	
	public int getA�osTrabajados() {
		return a�osTrabajados;
	}
	
	public void setA�osTrabajados(int a�osTrabajados) {
		this.a�osTrabajados = a�osTrabajados;
	}
	
	@Override
	public double getSalario() {
		double salario = super.getSalario();
		double aumento = 0;
		for(int i=0; i<a�osTrabajados;i++) {
			aumento += salario * 0.05;
		}
		
		return salario + aumento;
	}

}