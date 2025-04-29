package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Cine;
import co.edu.uniquindio.poo.model.FVIP;
import co.edu.uniquindio.poo.model.Funcion;
import co.edu.uniquindio.poo.model.Festandar;
import co.edu.uniquindio.poo.model.F3D;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Cine Cinemark = new Cine("Cinemark", "51215");
    Funcion funcion1 = new FVIP("Rey Leon", 240, "9:00PM", 15000, 4500);
    Funcion funcion2 = new Festandar("Spiderman", 300, "9:00PM", 15000);
    Funcion funcion3 = new F3D("Avengers", 180, "9:00PM", 15000, 2500);
    double precioEntrada1 = funcion1.calcularPrecioEntrada();
    double precioEntrada2 = funcion2.calcularPrecioEntrada();
    double precioEntrada3 = funcion3.calcularPrecioEntrada();


    System.out.println("PRECIOS DEL DIA");
    System.out.println("El rey leon:" + precioEntrada1);
    System.out.println("SpiderMan:" + precioEntrada2);
    System.out.println("Avengers:" + precioEntrada1);

}