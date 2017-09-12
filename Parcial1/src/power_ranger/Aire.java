package power_ranger;
/**
 * @author: Carlos Cu�llar
 */
public class Aire extends FabricaRanger{
	/**
	 *
	 * Los atributos del monstruo de Aire, que solo tiene el
	 */
	public Aire() {
		this.volar = volar;
	}
	
	public String volar;
	
	public String getVolar() {
		return volar;
	}
	public void setQuemar(String volar) {
		this.volar = volar;
	}
	/**
	 *
	 * Get y Set del atributo del monstruo de Aire
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
