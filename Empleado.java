public class Empleado {
//atributos
private String codigo;
private String nombre;
private String apellido;
private float salario;

//constructor
public Estudiante(String codigo,String nombre,String apellido,float salario){
  this.codigo=codigo;
  this.nombre=nombre;
  this.apellido=apellido;
  this.salario=salario;
}

//Actualizar el salario para cada empleado de la organización

  public String actualizarSalario(float salario){
    String c="Error";
    this.salario=salario;
    return c;
  }

//get and set
  
}