import java.util.Date;

public class Administrativo {
//atributos
private String codigo;
private String nombre;
private String apellido;
private int anioIngreso;
private float salario;

//constructor
public Estudiante(String codigo,String nombre,String apellido,String anioIngreso, float salario){
  this.codigo=codigo;
  this.nombre=nombre;
  this.apellido=apellido;
  this.anioIngreso=anioIngreso;
  this.salario=salario;
}

//calcular su antigüedad en años en la organización

  public int calcularAntiguedad(){
    
    int c=this.calcularAnioActual()-this.anioIngreso;
    return c;
  }

  private int calcularAnioActual(){
    Date dt=new Date();
    int year=dt.getYear();
    int c=year+1900;
  }
//get and set
  
}