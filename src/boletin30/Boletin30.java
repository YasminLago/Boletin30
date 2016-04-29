package boletin30;

import java.util.ArrayList;

/**
 *
 * @author ylagorebollar
 */
public class Boletin30 {
    public static void main(String[] args) {
       ArrayList <SeleccionFutbol> listaEquipo = new ArrayList();
       SeleccionFutbol xogador = new Futbolista(1,"futbolista",1,30,"Xogador1","Apelido1");
       SeleccionFutbol entrenador = new Entrenador(2,2,20,"Entrenador1","Apelido2");
       SeleccionFutbol masaxista = new Masaxista("Masaxista",30,3,50,"Masaxista1","Apelido3");
       SeleccionFutbol seleccion = new Seleccionador(5,30,"Seleccionador1","Apelido4");
       listaEquipo.add(xogador);
       listaEquipo.add(entrenador);
       listaEquipo.add(masaxista);
       listaEquipo.add(seleccion);
       for(SeleccionFutbol s:listaEquipo)
           System.out.println(s.toString());
    }
    
}
