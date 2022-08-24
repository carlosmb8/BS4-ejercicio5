package com.example.bs4ejercicio5;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class MisPropiedades {

    @Value("${VAR1}")
    private String var1;
    @Value("${My.VAR2}")
    private String var2;

    @Value("${VAR3:var3 no tiene valor}")
    private String var3;
}
