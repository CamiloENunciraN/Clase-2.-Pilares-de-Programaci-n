public class Estudiante {
//atributos
private String codigo;
private String nombre;
private String apellido;
private String carrera;
private int semestre;
private int credito;

//constructor
public Estudiante(String codigo,String nombre,String apellido,String carrera,int semestre,int credito){
  this.codigo=codigo;
  this.nombre=nombre;
  this.apellido=apellido;
  this.carrera=carrera;
  this.semestre=semestre;
  this.credito=credito;
}

//Calcular matricular proyecto de grado

  public String matricularProyectoGrado(){
String c="";
//Debe cumplir con el 90% de los créditos de la carrrera


    if(this.credito=>90){
    c+="Estudiante"+this.nombre+this.apellido+" ya puedes matricular Proyecto de Grado";
    }else{
    c+="Estudiante"+this.nombre+this.apellido+" aun no puedes matricular Proyecto de Grado, no alcanzas el 90% de los creditos";
    }
    
    return c;
  }

//get and set
  
}