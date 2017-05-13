import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import epsa.Cio;

import java.util.Currency;
import java.util.Scanner;

public class Reservas {

    public static void main(String[] args) {
        CUsuarios u1 = new CUsuarios();
        CVehiculos u2 = new CVehiculos();
        Scanner tec = new Scanner(System.in);

        System.out.println("Menu principal: \n --------------------\n 1.Usuarios \n 2.Vehiculos \n 3.Reservas \n 4.Salir \n --------------------\nSeleccione una opcion (1-4): ");
        switch (tec.nextLine()) {
            case "1":
                for (int i = 1; i < 100; i++) {
                    if (!u1.get(i).isEmpty()) {
                        System.out.println(u1.get(i));
                    } else {
                        break;
                    }
                }
                break;
            case "2":
                try {
                    for (int i = 1; i < 100; i++) {
                        if (!u2.get(i).isEmpty()) {
                            System.out.println(u2.get(i));
                        } else {
                            break;
                        }
                    }
                } catch (NullPointerException e) {
                    break;
                }
                break;
            case "3":
                System.out.println("Menu de reservas: \n -------------------- \n 1.Todas las reservas \n 2.Reservas de un usuario \n 3.Reservas de un vehículo \n 4.Reservar" +
                        " \n 5.Cancelar \n 0.Salir \n -------------------- \n Seleccione una opción (0-5)");
                switch (tec.nextLine()){
                    case "0":
                        break;
                    case "1":
                        System.out.println(u2.reservas());
                        break;
                    case "2":
                        System.out.println("Introduzca el CDU: ");
                        break;
                    case "3":
                        System.out.println("Introduzca el CDV: ");
                        String busqueda=tec.nextLine();
                        System.out.println(u2.buscar(busqueda,0));

                }

                break;
            case "4":
                System.out.println("Adiós puto");
                break;
        }


    }
} // Empresa
