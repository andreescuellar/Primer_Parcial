package power_ranger;
/**
 * @author: Carlos Cuéllar
 */
public class Tierra extends FabricaRanger{
	/**
	 *
	 * Get y Set del atributo del monstruo de Tierra
	 * 
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
