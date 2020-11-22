package org.coffeorganisation.bean;
import org.coffeorganisation.lang.Functions_for_Coffee_Machine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CoffeeService {
    @Autowired
    private Functions_for_Coffee_Machine CF;

    public CoffeeService() {
    }
    public String show() {
        String coffee_info = CF.getCoffee();
        String result_info = "Coffee: " + coffee_info;
        System.out.println(result_info);
        return result_info;
    }

}
