package com.actutator.actuator.controller;

import com.actutator.actuator.helper.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// # 1 To check the health of application we use acutator ,it will tell all the condition of application
//     1.1 just add dependency of spring-actutator  ,it will give you three urls
//     1.2 first one is health ,if its status is up  then the applciation is fine
import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private Student student;

    @GetMapping("/get-data")
    public Map<String, String> getData() {
        return Map.of("Name","Kiran Dhumal");
    }


}
