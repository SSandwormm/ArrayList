
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayList {

    public static void main(String[] args) {
        //forma de llamar un ArrayList
        List<Integer> listaNombre = new ArrayList<Integer>();
        listaNombre.add(23);
        System.out.println(listaNombre);
        
        //forma de llamar un ArrayList
        ArrayList nombre=new ArrayList();
        nombre.add("camilo");
        System.out.println(nombre);
        
        
        //ejeplos de arraylist con acciones 
        ArrayList personas=new ArrayList();
        personas.add("camilo");
        personas.add("antonio");
        personas.add("mendez");
        personas.add("rodrigo");
        personas.add("juan");
        personas.add("david");
        personas.add("anderson");

        //acceder a un articulo
        personas.get(0);
        //cambiar articulos
        personas.set(0, "ANDRES");
        //quitar un articulo
        personas.remove(2);
        //eliminar doto de la ArrayList
        personas.clear();
        //tamaño del ArrayList
        personas.size();
        //ordena los datos del ArrayList  ayudese con un for each
        Collections.sort(personas); 
        
        //___________________________________________________________
        // 
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(23);
        numeros.add(07);
        numeros.add(1);
        numeros.add(2135);
        numeros.add(32);
        numeros.add(70);
        numeros.add(0);
        
        //for
        
        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            System.out.println(numero);
        }
        //foreach
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        
    }
    
}
