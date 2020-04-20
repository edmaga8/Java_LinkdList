import java.util.*;
import java.util.Iterator;


public class Linkdlst {

	public static void main (String [] args)
	{
		
		System.out.println("Listas enlazadas");
		// Crearé un arreglo de números y lo llevaré a una lista enlazada
		
		System.out.println("Primero voy con las listas");
		List<Integer> lista= new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(3);
		lista.add(3);
		lista.add(3);
		
		System.out.println("Esto es la impresión del ArrayList:\n"  +lista);
		
		System.out.println("Ahora pruebo si está un valor:");
		boolean a= lista.contains(5);
		if(a==true)
			System.out.println("Contiene el valor");
		else 
			System.out.println("No lo contiene");
		// Ajá, chévere. Ahora voy a empezar a recortar la lista.
		
		//lista.remove(3);
		System.out.println(lista);
		int siz= lista.size();
		System.out.println("El tamaño de la lista es:" + siz);
		
		// Ahora convertiré la lista en una lista enlazada
		System.out.println("Aquí convierto el Arraylist en una lista enlazada:");
		LinkedList<Integer> enlazada= new LinkedList<>(lista);
		//Ahora enlazada es una lista enlazada.
		
		System.out.println(enlazada);
		
		//Ahora quiero agregar elementos en la lista enlazada y borrar y eso:
		
		//Agregar elementos en la lista enlazada:
		System.out.println("Agregué el elemento 8");
		
		enlazada.add(8);
		
		
		System.out.println(enlazada);
		
		//Ahora le agregaré un array.
		
		List<Integer> lista2= new ArrayList<>();
		
		for(int i=1; i<11 ; i++)
		{
			lista2.add(i);
		}
		
		enlazada.addAll(lista2); // Le agregué a la lista enlazada un ArrayList completo
		
		System.out.println("Agregué una lista al final");
		System.out.println(enlazada);
		
		//Lista enlazada a String
		
		String Str= enlazada.toString();
		System.out.println(Str);
		char w= Str.charAt(1);
		
		System.out.println(w);
		
		System.out.println("Ahora quiero imprimir y trabajar con una lista:");
		
		int x1= lista2.size();
		System.out.println(x1);
		lista2.add(25);
		System.out.println(lista2);
		x1 =lista2.size();
		System.out.println(x1);
		
		//Crear iterador para recorrer:
		/*Iterator itera= enlazada.iterator();// = enlazada.itera();
		while(itera.hasNext())
		{
			System.out.print(itera.next() + " ");
		}
		
	}*/
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		//																								//
		//																								//
		//					                  Ahora trabajaré con otra cosa     						//
		//																								//
		//																								//
		//																								//
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//// Queue
		
		Queue<Integer> cola = new LinkedList<>(); // La cola se implementa a base de lista enlazada
		
		cola.add(8);
		cola.add(10);
		cola.add(12);
		
		System.out.println(cola);
		cola.remove();
		System.out.println(cola);
		cola.add(25);
		System.out.println(cola);
		cola.remove();
		System.out.println(cola);
		
		///////Stack 
		
		System.out.println("Ahora una pila");
		
		Stack<Integer> pila = new Stack<>();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		pila.push(6);
		pila.push(7);
		pila.push(8);
		pila.push(9);
		pila.push(10);
		pila.push(11);
		
		
		int az= pila.capacity();
		
		System.out.println(az);
		
		System.out.println(pila);
		pila.pop();
		System.out.println(pila);
		
		//////////////// SETSSSSSSSSSS/////////////////////
		//
		//
		//
		//
		//
		////////////////////////////////////////////////////
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Ahora unos sets:");
		
		Set<String> set1 = new HashSet<>();
		set1.add("Caracas");
		set1.add("Puerto Cabello");
		set1.add("Maracay");
		set1.add("Valencia");
		set1.add("Valle de la pascua");		
		set1.add("El Palmar");
		
		System.out.println(set1);
		set1.add("Caicara");
		System.out.println(set1);
		System.out.println(set1);
		System.out.println(set1);
		set1.add("Táchira");
		System.out.println(set1);
		set1.remove("Maracay");
		System.out.println(set1);
		
		Set<String> set2= new LinkedHashSet<>(set1);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Ahora con LinkedHashSet");
		System.out.println(set2);
		///// Otro estilo de impresión:
		//
		//
		//
		System.out.print("[");
		for(Object cosa: set2)
		{
			System.out.print(cosa + " ");
			
		}
		
		System.out.println("]");
		
		System.out.println("Otra manera:");
		
		Iterator <String> it= set2.iterator()  ;
		
		System.out.print("[");
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");

		}
		System.out.println("]");
		
		
		//// Ahora el betica de TreeHash
		//
		//
		///////////////////////////////////////////
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Ahora los TreeSet:");
		Set<String> set3 = new TreeSet<>(set2);
		System.out.println(set3);
		System.out.println("Ahora con el foreach:");
		set3.forEach(i-> System.out.print(i + " "));
		
		//Ahora un método de stream... Quizá luego.
		//
		//
			
	
	
	}
}