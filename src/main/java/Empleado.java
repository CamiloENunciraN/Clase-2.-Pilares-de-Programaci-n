public class Empleado {
//atributos
private String codigo;
private String nombre;
private String apellido;
private float salario;

//constructor
public Empleado(String codigo,String nombre,String apellido,float salario){
  this.codigo=codigo;
  this.nombre=nombre;
  this.apellido=apellido;
  this.salario=salario;
}

//Actualizar el salario para cada empleado de la organización

  public String actualizarSalario(float salario){
    String c;
    this.setSalario(salario);
    c="salario actualizado a: "+salario;
    return c;
  }

//get and set

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}