//La matriz creada tiene una fila por reserva, siendo la primera columna de estas la matricula, la segunda la marca y modelo
//la tercera el número de reservas, cuarta el día de la reserva y la quinta el código del usuario

import java.io.*;
import java.util.*;

import epsa.*;

public class CVehiculos {

    private int elementosArray = 0;
    private String vehiculos[][] = new String[100][100];

    private void inicializaString() {
        for (int i = 0; i < 100; i++) {
            vehiculos[i][1] = "";
            vehiculos[i][2] = "";
            vehiculos[i][0] = "";
        }
    }

    private void buscar() {
        inicializaString();
        File file = new File("/Users/leandroalbero/IdeaProjects/Practica 2/src/vehiculos.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                char[] caracteres = line.toCharArray();
                String a = "";
                char c = caracteres[0];
                if (c >= 'A' && c <= 'Z') {
                    try {
                        vehiculos[elementosArray][0] = a + caracteres[0] + caracteres[1] + caracteres[2];
                        try {
                            for (int i = 4; i < 50; i++) {
                                char d = caracteres[i];
                                vehiculos[elementosArray][1] += d;
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {

                        }
                        vehiculos[elementosArray][2] += scanner.nextLine();
                        int numReservas = Integer.parseInt(vehiculos[elementosArray][2]);
                        for(int i=0;i<numReservas;i++){
                            vehiculos[elementosArray][3+i]=scanner.nextLine();
                        }
                        elementosArray++;
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                } else {

                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //System.out.println(vehiculos[3][0] + " " + vehiculos[3][1]);
    }

    public String buscar(String matricula) {
        buscar();
        for (int i = 0; i <= elementosArray; i++) {
            try {
                if (vehiculos[i][0].equals(matricula)) {
                    //System.out.println("Encontrado" + vehiculos[i][0]);
                    elementosArray = 0;
                    return vehiculos[i][1];
                } else {
                    //System.out.println("Buscando...");
                }
            } catch (java.lang.NullPointerException e) {

            }
        }
        elementosArray = 0;
        return null;

    }

    public String get(int i) {
        buscar();
        elementosArray = 0;
        if (!vehiculos[i][0].isEmpty()) {
            return vehiculos[i][0] + " " + vehiculos[i][1];
        }

        return null;
    }

    public int numero() {

        buscar();
        int tmp = this.elementosArray;
        this.elementosArray = 0;
        return tmp;
    }
    public String reservas(){
        buscar();
        for(int i=0;i<elementosArray;i++){
            if(!vehiculos[i][2].equals("0")){
                System.out.println(vehiculos[i][0]+ " " + vehiculos[i][1] + " ----- Número de reservas: "+vehiculos[i][2]);
            }
        }
        return "";
    }
    public String buscar(String busqueda, int a){
        if (a==0){

        }
        return null;
    }

} // CVehiculos
