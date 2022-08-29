package com.letscode.ecommerce.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letscode.ecommerce.services.HelloService;

@RestController
public class HelloEndpoints {

    @Autowired
    HelloService helloServices;

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> hello(){
        return new ResponseEntity<String>("Hello world!", HttpStatus.OK);
    }

    @RequestMapping(path = "/hello/{nome}", method = RequestMethod.GET)
    public ResponseEntity<String> helloPerson(@PathVariable String nome){
        return new ResponseEntity<String>("Hello "+ nome, HttpStatus.OK);
    }
    @RequestMapping(path = "/hello/{nome}/horario", method = RequestMethod.GET)
    public ResponseEntity helloPersonTime(@PathVariable String nome){
        return new ResponseEntity<>("Hello "+ nome + "! Agora são " + helloServices.helloComHorario() + ", não esqueça!", HttpStatus.OK);
    }
    
}
