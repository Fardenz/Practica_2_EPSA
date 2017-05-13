import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CUsuarios {
    Usuario[] users = new Usuario[100];
    private String usuarios[][] = new String[100][2];
    private int usuariosArray = 0;

    
    //Constructor method, so that when we declare a new object of this type this method gets executed
    //This method basically reads from "usuarios.txt" the input data, the file has to be in the same folder.
    	public CUsuarios(){
		try {
			Scanner in = new Scanner(new FileReader("usuarios.txt"));
			
			for(int i=0;in.hasNextLine();i++){
				String line = in.nextLine();
				users[i]=new Usuario(line.substring(0,3),line.substring(4));
				elements++;
										//Debuging 2m.out.println(s.substring(0,3)+","+s.substring(4));
			}
			in.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
    
 /*   It is not needed to call this method everytime, as our constructor can make that job
 
 
 
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
                users[usuariosArray] = new Usuario(line.substring(0, 3), line.substring(4)); //NO CHUTA xD

        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        usuariosArray--;
    }*/

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
