public class Estudiante {
//atributos
private String codigo;
private String nombre;
private String apellido;
private int semestre;
private int credito;
private Carrera carrera;

//constructor
public Estudiante(String codigo,String nombre,String apellido,String carrera,int semestre,int credito){
  this.codigo=codigo;
  this.nombre=nombre;
  this.apellido=apellido;
  this.generarCarrera(carrera);
  this.semestre=semestre;
  this.credito=credito;
}

private void generarCarrera(String carrera){
    Carrera c=new Carrera(carrera,100);
    this.carrera=c;
}



//Calcular matricular proyecto de grado

  public String matricularProyectoGrado(){
String c="";
//Debe cumplir con el 90% de los créditos de la carrrera
int porcentaje=(this.getCredito()*100)/this.carrera.getNumCredito();

    if(porcentaje>=90){
    c+="Estudiante"+this.nombre+this.apellido+" ya puedes matricular Proyecto de Grado";
    }else{
    c+="Estudiante"+this.nombre+this.apellido+" aun no puedes matricular Proyecto de Grado, no alcanzas el 90% de los creditos";
    }
    
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
  
}