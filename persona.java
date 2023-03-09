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
		protected static boolean alopecia;
		protected static boolean otaku;
		protected static boolean inteligente;
		protected static boolean loquito;
		protected static boolean pitufo;
		protected static boolean gym;
	
		
		
		private static final String[] nombres= { "Rodolfo", "Andrea", "Luis", "Karen", "Betty la fea", "David",
				"Milaneso", "Eduardo", "Sandalio", "Monica"};
	
		
		private static final List<String> nombresAleatorios = new ArrayList<String>();
		
		 static {
		        for (String nombre : nombres) {
		            nombresAleatorios.add(nombre);
		        }
		        Collections.shuffle(nombresAleatorios, new Random());
		    
		    }
		
		public persona(String nombre, String nombre1, String nombre2, String nombre3, String nombre4, String nombre5
				, String nombre6, String nombre7, String nombre8, String nombre9) {
			
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
			
			
			this.bizco= new Random().nextBoolean();
			this.pelon= new Random().nextBoolean();
			this.brazos= new Random().nextBoolean();
			this.fuerte= new Random().nextBoolean();
			this.alopecia= new Random().nextBoolean();
			this.otaku= new Random().nextBoolean();
			this.inteligente= new Random().nextBoolean();
			this.loquito= new Random().nextBoolean();
			this.pitufo= new Random().nextBoolean();
			this.gym= new Random().nextBoolean();
		}
		
		
		
	}
