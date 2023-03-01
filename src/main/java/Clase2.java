
public class Clase2 {

    public static void main(String[] args) {
        
        //RF1
        Docente d=new Docente("123","camilo","xxxxx","nada",555,1.90f,85);
        System.out.println(d.calcularIMC());
        //RF2
        Estudiante e=new Estudiante("789","camilo","zzzzz","ing",5,60);
        System.out.println(e.matricularProyectoGrado());
        //RF3
        Administrativo a=new Administrativo("456","admin","yyyy",1990,555);
        System.out.println(a.calcularAntiguedad());
        //RF4
        System.out.println(d.actualizarSalario(666));
        System.out.println(a.actualizarSalario(999));
    }
}
