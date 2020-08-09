public class Oficinista extends Empleado {
	private String nombre;
	private String apellidos;
	private String identifiicacion;
	private double salario;
	
	
	public Oficinista(String identificacion, double salario) {
		super(identificacion, salario);
		this.identifiicacion = identificacion;
		this.salario = salario;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getIdentifiicacion() {
		return identifiicacion;
	}

	public void setIdentifiicacion(String identifiicacion) {
		this.identifiicacion = identifiicacion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
		
}
