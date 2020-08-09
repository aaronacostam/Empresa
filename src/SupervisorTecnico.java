
public class SupervisorTecnico extends Empleado {
	
	private int añosTrabajados;
	
	public SupervisorTecnico(String identificacion, double salario, int añosTrabajados) {
		super(identificacion, salario);
		this.añosTrabajados = añosTrabajados;
	}
	
	public int getAñosTrabajados() {
		return añosTrabajados;
	}
	
	public void setAñosTrabajados(int añosTrabajados) {
		this.añosTrabajados = añosTrabajados;
	}
	
	@Override
	public double getSalario() {
		double salario = super.getSalario();
		double aumento = 0;
		for(int i=0; i<añosTrabajados;i++) {
			aumento += salario * 0.05;
		}
		
		return salario + aumento;
	}

}