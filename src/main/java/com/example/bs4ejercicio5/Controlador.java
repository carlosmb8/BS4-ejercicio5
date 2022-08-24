package com.example.bs4ejercicio5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Autowired
    MisPropiedades propiedades;



    @GetMapping("valores")
    public String mostrarVar1yVar2() {
        String var1 = propiedades.getVar1();
        String var2 = propiedades.getVar2();
        return "Valor de var1 es: " + var1 + " y valor de my.var2 es: " + var2;
    }

    @GetMapping("var3")
    public String mostrarVar3() {
        String var3 = propiedades.getVar3();
        return "Valor de var3 es: " + var3;
    }
}
