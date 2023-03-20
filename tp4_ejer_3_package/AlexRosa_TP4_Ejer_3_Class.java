package tp4_ejer_3_package;
import java.io.*;

public class AlexRosa_TP4_Ejer_3_Class {

	public static void main(String[] args) {
		// Tome el ejercicio 2 de la clase 3, escriba en un archivo la lista de los nombres tratados.
		String listaNombres = "Mateo_Martin_Romina_Lucas_Leo_Daniel_Mariana_Alejandro_Manuel_Carolina_Jimena";
		String archivoUrl = "listaNombres.txt";
		
		String[]nombresEnArray = listaNombres.split("_");
		
		File archivo = new File(archivoUrl);
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(archivo);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			for(int i = 0; i < nombresEnArray.length; i++) {
				pw.write(nombresEnArray[i] + "\n");
			}
			
			System.out.println("El archivo de ha creado exitosamente!!!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pw != null) {
				pw.close();
			}
		}
		
		
		
	}

}
