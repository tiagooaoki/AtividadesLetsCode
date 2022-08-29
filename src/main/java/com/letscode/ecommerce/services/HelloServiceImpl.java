package com.letscode.ecommerce.services;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {
        

    @Override
    public String helloComHorario() {
        LocalTime agora = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        String horaAgora = dtf.format(agora);
        return horaAgora;
    }
}
