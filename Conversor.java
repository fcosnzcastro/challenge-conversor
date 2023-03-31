import javax.swing.JOptionPane;

public class Conversor {
	
	//Método principal
	public static void main(String[] args) {
		
		String[] monedas = {"Dolares","Euros","Onzas","P. Argentino","Yen"};
		int continuar = 0;
		
		do {
			try {
				
				double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en pesos mexicanos"));
				
				if(cantidad > 0) {
					String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de conversion", "Seleccione una opcion", 3, null, monedas, monedas[0]);
					
					switch(seleccion) {
					
					case("Dolares"):
						double pesoADolar = cantidad / 18.32;
						JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos equivalen a " + Math.round(pesoADolar*100.00)/100.00 + " dólares");
						break;
						
					case("Euros"):
						double pesoAEuro = cantidad / 19.81;
						JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos equivalen a " + Math.round(pesoAEuro*100.00)/100.00 + " euros");
						break;
						
					case("Onzas"):
						double pesoAOnza = cantidad / 22.56;
						JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos equivalen a " + Math.round(pesoAOnza*100.00)/100.00 + " onzas");
						break;
						
					case("P. Argentino"):
						double pesoAArg = cantidad / 11.53;
						JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos equivalen a " + Math.round(pesoAArg*100.00)/100.00 + " pesos argentinos");
						break;
						
					case("Yen"):
						double pesoAYen = cantidad / 7.33;
						JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos equivalen a " + Math.round(pesoAYen*100.00)/100.00 + " yenes");
						break;
					}//Fin del switch
					
				}//Fin del if
			}//Fin del try
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Entrada no válida, por favor intentelo de nuevo.");
			}//Fin del catch
			
			finally{
				continuar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?", "YES_NO_CANCEL_OPTION", JOptionPane.YES_NO_CANCEL_OPTION,
		                JOptionPane.INFORMATION_MESSAGE); 	
			}//Fin finally
		}//Fin del do
		while(continuar == 0);
		
		if(continuar != 0)
			JOptionPane.showMessageDialog(null,"Programa finalizado");
			
	}//Fin método main

}//Fin de la clase Conversor
