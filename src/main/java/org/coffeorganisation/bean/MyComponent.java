package org.coffeorganisation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Autowired
    private MyRepository repository;

    public String showAppInfo_and_date() {
        System.out.println("Coffee is ready at: "+ repository.getSystemDateTime());
        System.out.println("App Name: "+ repository.getAppName());
        return repository.getSystemDateTime().toString();
    }

}
