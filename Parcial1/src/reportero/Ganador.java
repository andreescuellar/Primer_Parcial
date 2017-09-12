package reportero;
/**
 * @author: Carlos Cuéllar
 */
public class Ganador implements Reportero {

	public Ganador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String calcularGanador(int a, int b) {
		if (a != b) {
			if(a>b) {
				System.out.println("Jugador A lleva la delantera ");	
			}else {
				System.out.println("Jugador B lleva la delantera ");
			}
		}else {
			System.out.println("Pares, jugador que haga dos puntos gana ");
		}
		
		return null;
	}

	@Override
	public String calcularCampeon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String recordarGanador(int juego) {
		// TODO Auto-generated method stub
		return null;
	}

}
