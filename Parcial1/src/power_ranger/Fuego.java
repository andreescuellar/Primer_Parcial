package power_ranger;
/**
 * @author: Carlos Cuéllar
 */
public class Fuego extends FabricaRanger {
	/**
	 *
	 * Los atributos del monstruo de Fuego, que solo tiene el
	 */
	public Fuego(String quemar) {
		this.quemar = quemar;
	}
	
	public Fuego() {
		// TODO Auto-generated constructor stub
	}
	/**
	 *
	 * Get y Set del atributo del monstruo de fuego
	 */
	public String quemar;
	
	public String getQuemar() {
		return quemar;
	}
	public void setQuemar(String quemar) {
		this.quemar = quemar;
	}
	public void printFuego(){
		
		System.out.println("Soy:" + this.getNombre() + "y estoy quemando ") ;
		
	}
	
	/**
	 *
	 * obtener los atributos del monstruo
	 */
	public void addInfo(String nombre, String elemento,String edad, String color,String agigantarse, String caminar, String golpear){
		this.setNombre(nombre);
		this.setElemento(elemento);
		this.setEdad(edad);
		this.setColor(color);
		this.setAgigantarse(agigantarse);
		this.setCaminar(caminar);
		this.setGolpear(golpear);
	}
	
	public void printInfo(){
	
		System.out.println(this.getNombre() + ": " + this.getElemento() + this.getEdad() + this.getEdad() 
		+ this.getColor() + this.getAgigantarse() + this.getCaminar() + this.getGolpear() );
		
	}

}
