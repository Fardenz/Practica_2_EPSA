import java.util.Scanner;

public class Usuario
{
private String codigo;
private String nombre;
public void Usuario(String codigo, String nombre){
    this.codigo=codigo;
    this.nombre=nombre;
}
public void setCodigo(){
    Scanner tec = new Scanner(System.in);
    System.out.println("Introduzca el código: ");
    this.codigo= tec.nextLine();
    tec.close();
}
public void setNombre(){
    Scanner tec = new Scanner(System.in);
    System.out.println("Introduzca el nombre: ");
    this.nombre= tec.nextLine();
    tec.close();
}
public String getCodigo(){
    return this.codigo;
}
public String getNombre(){
    return this.nombre;
}
} // Usuario
