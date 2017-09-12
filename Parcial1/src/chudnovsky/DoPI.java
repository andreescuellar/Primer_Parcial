package chudnovsky;
/**
 * @author: Carlos Cuéllar
 */
	public class DoPI implements Chudnovsky{
		private int x;
		public DoPI(int x) {

			this.x=x;
		}
		/**
		 * Metodo: Factorial
		 * obtenemos el factorial por medio de recursividad
		 */
		public int factorial(int x) {
			if(x==0) {
				return 1;
			}else {
				return x * factorial(x-1);
			}		
		}
		/**
		 * Metodo: Numerador de la formula
		 * obtenemos el resultado de la parte superior de la formula
		 */
		public double numeradorf() {
			return numerador1()*numerador2();
		}
		public double numerador1() {		
			return factorial(6*x);
		}
		public double numerador2() {		
			return (545140134*x+13591409);
		}
		
		/**
		 * Metodo: denominador de la formula
		 * obtenemos el resultado de la parte inferior de la formula
		 */
		
		public double deminadorf() {
			return denominador1()*denominador2()*denominador3();
		}
		public int denominador1() {		
			return factorial(3*x);
		}
		public double denominador2() {
			return Math.pow((double)factorial(x),3);
		}
		public double denominador3() {
			return Math.pow(-262537412640768000.0, x);
		}
		/**
		 * Metodo: union de numerador y denominador
		 * juntamos el numerador con el denominador para obtener el resultado 
		 */
		public double result () {
			return numeradorf()/deminadorf();
		}
	}


