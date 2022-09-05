public class Docente extends Empleado{
//atributos

private String profesion;
private float estatura;
private float peso;

//constructor
public Docente(String codigo,String nombre,String apellido,String profesion,float salario,float estatura,float peso){

    super(codigo, nombre, apellido, salario);
    this.profesion=profesion;
    this.estatura=estatura;
    this.peso=peso;
}

//Calcular el IMC de los docentes y mostrar su composición corporal

  public String calcularIMC(){
String c;
//IMC = peso [kg]/ (estatura [m])2
    float IMC=this.getPeso()/(this.getEstatura()*2);
    c="IMC: "+IMC+"/n peso corporal : ";

    if(IMC<18.5){
    c+="inferior al normal";
    }else if(IMC>=18.5 && IMC<=24.9){
    c+="normal";
    }else if(IMC>=25 && IMC<=29.9){
    c+="superior al normal";
    }else{
    c+="obesidad";
    }
    
    return c;
  }

//get and set

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
  
}