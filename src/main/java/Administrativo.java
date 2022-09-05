import java.util.Date;

public class Administrativo extends Empleado{
//atributos

private int anioIngreso;


//constructor
public Administrativo(String codigo,String nombre,String apellido, float salario,int anioIngreso){
    
    super(codigo, nombre, apellido, salario);
    this.anioIngreso=anioIngreso;

}

//calcular su antigüedad en años en la organización

  public int calcularAntiguedad(){
    
    int c=this.calcularAnioActual()-this.getAnioIngreso();
    return c;
  }

  private int calcularAnioActual(){
    Date dt=new Date();
    int year=dt.getYear();
    int c=year+1900;
    return c;
  }
//get and set

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

}