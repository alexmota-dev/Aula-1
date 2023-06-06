import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import listas.MinhaLista;

public class Main{
    public static void main(String[] args) {
       List<Integer> numeros = new LinkedList<Integer>();
       
       numeros.add(5);
       numeros.add(11);
       numeros.add(11);
       numeros.add(11);
       numeros.add(11);
       numeros.add(11);
       numeros.add(11);
       numeros.add(11);
       numeros.add(11);
       numeros.add(11);
       numeros.add(11);
       numeros.stream().filter(numero -> numero > 10).forEach(numero -> {
        System.out.println(numero);
       });

    }
}