package power_ranger;
/**
 * @author: Carlos Cuéllar
 */
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	/**
	 *
	 * se crea la instancia, de le da valor a los parametros y se imprime
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fuego M1 = new Fuego(); //instancia
		M1.addInfo("Pedrin" , "Fuego","20", "Rojo", "20m", "5 km/h", "Puñetazo loco");
		System.out.println(M1.toString());
	
		Agua M2 = new Agua(); //instancia
		M2.addInfo("Roquito" , "Agua","21", "Azul", "30m", "8 km/h", "Puñetazo atravezado");
		System.out.println(M2.toString());

		Tierra M3 = new Tierra (); //instancia
		M3.addInfo("Piedras" , "Tierra","18", "Cafe", "20m", "3 km/h", "Puñetazo derrumbador");
		System.out.println(M3.toString());
		
		Aire M4 = new Aire (); //instancia
		M4.addInfo("Piedras" , "Tierra","18", "Cafe", "20m", "3 km/h", "Puñetazo derrumbador");
		System.out.println(M4.toString());
		
		FabricaRanger fuego = (FabricaRanger) M1;
		FabricaRanger aire = (FabricaRanger) M4;
	}

}
