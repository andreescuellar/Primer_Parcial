package power_ranger;
/**
 * @author: Carlos Cuéllar
 */
public class FabricaRanger {

	/**
	 *
	 * Los atributos del monstruo
	 */
	private String nombre = "";
	private String elemento = "";
	private String edad = "";
	private String color = "";
	/**
	 *
	 * Los movimientos del monstruo
	 */
	private String agigantarse = "";
	private String caminar = "";
	private String golpear = "";
	
	public FabricaRanger() {
		
	}
	/**
	 *
	 * Constructor que obtiene todos las atributos
	 */
	public FabricaRanger(String nombre, String elemento,String edad, String color,String agigantarse, String caminar, String golpear){
		this.nombre = nombre;
		this.elemento = elemento;
		this.edad = edad;
		this.color = color;
		this.agigantarse = agigantarse;
		this.caminar = caminar;
		this.golpear = golpear;
	}
	/**
	 *
	 * Get y Set de las atributos del monstruo
	 */
	//Get
	public String getNombre(){
		return this.nombre;
	}
	
	public String getElemento(){
		return this.elemento;
	}
	public String getEdad(){
		return this.edad;
	}
	
	public String getColor(){
		return this.color;
		
	}public String getAgigantarse(){
		return this.agigantarse;
	}
	
	public String getCaminar(){
		return this.caminar;
	}
	
	public String getGolpear(){
		return this.golpear;
	}
	
	//SET
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setElemento(String elemento){
		this.elemento = elemento;
	}
	public void setEdad(String edad){
		this.edad = edad;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setAgigantarse(String agigantarse){
		this.agigantarse = agigantarse;
	}
	
	public void setCaminar(String caminar){
		this.caminar = caminar;
	}
	
	public void setGolpear(String golpear){
		this.golpear = golpear;
	}
	
	/**
	 *
	 * Cadena toString de todos los atributos del monstruo 
	 */
	public String toString(){
		return "Nombre: " + this.nombre + "(Elemento: " + this.elemento + ")"+ "(Edad: " + this.edad + ")"
				+ "(Color: " + this.color + ")" + "(Agrandarse: " + this.agigantarse + ")" 
				+ "(Camino: " + this.caminar + ")" + "(Golpear: " + this.golpear + ")";
	}
	
	

}
