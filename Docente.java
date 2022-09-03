public class Docente {
//atributos
private String codigo;
private String nombre;
private String apellido;
private String profesion;
private float salario;
private float estatura;
private float peso;

//constructor
public Docente(String codigo,String nombre,String apellido,String profesion,float salario,float estatura,float peso){
  this.codigo=codigo;
  this.nombre=nombre;
  this.apellido=apellido;
  this.profesion=profesion;
  this.salario=salario;
  this.estatura=estatura;
  this.peso=peso;
}

//Calcular el IMC de los docentes y mostrar su composición corporal

  public String calcularIMC(){
String c="";
//IMC = peso [kg]/ (estatura [m])2
    float IMC=this.peso/(this.estatura*2);
    c="IMC: "+IMC+"/n peso corporal : ";

    if(IMC<18.5){
    c+="inferior al normal";
    }else if(IMC=>18.5 && IMC=<24.9){
    c+="normal";
    }else if(IMC=>25 && IMC<=29.9){
    c+="superior al normal";
    }else{
    c+="obesidad";
    }
    
    return c;
  }

//get and set
  
}