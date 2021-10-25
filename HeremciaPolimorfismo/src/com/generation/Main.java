
package com.generation;

import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.uber.UberDriver;
import com.generation.uber.ConductorUberBlack;

public class Main {

    public static void main(String[] args) {

        UberDriver driver = new UberDriver();
        ConductorUberBlack driverBlack = new ConductorUberBlack();

        System.out.println("Uber");
        System.out.println(driver.calculatePrice(6));
        System.out.println("UberBlack");
        System.out.println(driver.calculatePrice(8));
    }
}

        /*
        Ave ave = new Ave("Piolin");
        System.out.println(ave.getNombre());
        //ave.comunicarse();
        //ave.comer();

        System.out.println("-----------------------");
        Perro lomito = new Perro("Coraje");
        //lomito.jugar();
        //lomito.comer("Croquetas");

        */