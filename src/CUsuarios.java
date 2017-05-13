import java.util.*;

import epsa.*;
import sun.java2d.UnixSurfaceManagerFactory;

import java.io.*;

public class CUsuarios {
    private String usuarios[][] = new String[100][2];
    private int usuariosArray = 0;

    private void buscar() {
        int j = 0;
        File file = new File("/Users/leandroalbero/IdeaProjects/Practica 2/src/usuarios.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                char[] caracteres = line.toCharArray();
                String s1 = "";
                String s2 = "";
                try {
                    s1 = s1 + caracteres[0] + caracteres[1] + caracteres[2];
                } catch (ArrayIndexOutOfBoundsException e) {

                }
                usuariosArray++;
                usuarios[usuariosArray][0] = s1;
                try {
                    for (int i = 4; i < 250; i++) {
                        s2 = s2 + caracteres[i];
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    usuarios[usuariosArray][1] = s2;
                }
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        usuariosArray--;
    }

    public String buscar(String codigo) {
        buscar(); //Construye la array de usuarios
        for (int i = 0; i <= usuariosArray; i++) {
            if (codigo.equals(usuarios[i][0])) {
                usuariosArray=0;
                return usuarios[i][1];

            } else {
                //System.out.println("Buscando...");
            }
        }
        usuariosArray=0;
        return "DNF";
    }

    public String get(int i) {
        buscar();
        usuariosArray=0;
        return usuarios[i][1];
    }

    public int numero() {
        buscar();
        int tmp=this.usuariosArray;
        this.usuariosArray=0;
        return tmp;
    }
} // CUsuarios
