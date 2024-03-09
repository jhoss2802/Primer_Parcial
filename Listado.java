package listado;

import javax.swing.JOptionPane;

public class Listado {
 public static void main (String[] args) {
	 String palabra[] = new String [10];
	 int i=0;
	 while (i<10) {
		 String nom = JOptionPane.showInputDialog("ingrese la palabra; "+(i+1));
		 palabra[i]=nom;
		 i++;
     }
	 JOptionPane.showMessageDialog (null, "Listado de palabras \n"
	 		+ "Palabra 1: "+palabra+"\n"
	 		+"Palabra  2: "+palabra+"\n"
	 		+"Palabra  3: "+palabra+"\n"
	 		+"Palabra  4: "+palabra+"\n"
	 		+"Palabra 5: "+palabra+"\n"
	 		+"Palabra 6: "+palabra+"\n"
	 		+"Palabra 7: "+palabra+"\n"
	 		+"Palabra 8: "+palabra+"\n"
	 		+"Palabra 9: "+palabra+"\n"
	 		+"Palabra 10: "+palabra+"\n"
	 		+ "");
	 		
 }
}

