package org.coffeorganisation.lang.impl;


import org.coffeorganisation.lang.Functions_for_Coffee_Machine;


public class Americano implements Functions_for_Coffee_Machine {


    @Override
    public String getCoffee() {

        return "Americano is ready! Warning - the cup is hot!";
    }
}
