package personas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
	
	public abstract class persona{
		
		//creacion de variables
		protected static String nombre;
		protected static String nombre1;
		protected static String nombre2;
		protected static String nombre3;
		protected static String nombre4;
		protected static String nombre5;
		protected static String nombre6;
		protected static String nombre7;
		protected static String nombre8;
		protected static String nombre9;
		
		protected static boolean bizco;
		protected static boolean pelon;
		protected static boolean brazos;
		protected static boolean fuerte;
		
		
		private static final String[] nombres= { "Rodolfo", "Andrea", "Luis", "Karen", "Betty la fea", "David",
				"Milaneso", "Eduardo", "Sandalio", "Monica"};
		
		private static final String[] atributos1= { "bizco", "pelon", "brazos", "fuerte"};
		
		private static final String[] atributos2= { "pelon", "alopecia", "inteligente","otaku"};
		
		private static final String[] atributos3= { "bizco", "otaku", "gym", "Karen"};
		
		private static final String[] atributos4= { "brazos", "inteligente", "alopecia", "gym"};
		
		protected static String atributo;
		protected static String atributo_2;
		protected static String atributo_3;
		protected static String atributo_4;
		Random numrand = new Random();


		
		
		private static final List<String> nombresAleatorios = new ArrayList<String>();
		
		public persona(String nombre, String nombre1, String nombre2, String nombre3, String nombre4, String nombre5
				, String nombre6, String nombre7, String nombre8, String nombre9, String atributo, String atributo_2, String atributo_3, String atributo_4) {
			
			int rando_num = numrand.nextInt(atributos1.length);
			int top;
			top = rando_num;
			atributo = atributos1[top];
			
			int rando_num2 = numrand.nextInt(atributos2.length);
			int top2;
			top2 = rando_num2;
			atributo_2= atributos2[top2];
			
			int rando_num3 = numrand.nextInt(atributos3.length);
			int top3;
			top3 = rando_num3;
			atributo_3 = atributos3[top3];
			
			int rando_num4 = numrand.nextInt(atributos4.length);
			int top4;
			top4 = rando_num4 ;
			atributo_4 = atributos4[top4];

			
			//Asignar los nombres a sus variables
			this.nombre=nombresAleatorios.remove(0);
			this.nombre1=nombresAleatorios.remove(0);
			this.nombre2=nombresAleatorios.remove(0);
			this.nombre3=nombresAleatorios.remove(0);
			this.nombre4=nombresAleatorios.remove(0);
			this.nombre5=nombresAleatorios.remove(0);
			this.nombre6=nombresAleatorios.remove(0);
			this.nombre7=nombresAleatorios.remove(0);
			this.nombre8=nombresAleatorios.remove(0);
			this.nombre9=nombresAleatorios.remove(0);
			
		}
		static {
	        for (String nombre : nombres) {
	            nombresAleatorios.add(nombre);
	        }
	        Collections.shuffle(nombresAleatorios, new Random());
	    
	    }
	
		
		
	}
