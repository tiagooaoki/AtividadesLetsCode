package com.letscode.ecommerce.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    
    Logger logger = LoggerFactory.getLogger(HelloEndpoints.class);
    @Autowired
    HelloService helloServices;

    @RequestMapping("/")
    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> hello(){
        logger.info("INFO: Este endpoint vem com a mensagem de Hello");
        return new ResponseEntity<String>("Hello world!", HttpStatus.OK);
    }

    @RequestMapping(path = "/hello/{nome}", method = RequestMethod.GET)
    public ResponseEntity<String> helloPerson(@PathVariable String nome){
        logger.info("INFO: Este endpoint vem com a mensagem de Hello + nome");
        return new ResponseEntity<String>("Hello "+ nome, HttpStatus.OK);
    }
    @RequestMapping(path = "/hello/{nome}/horario", method = RequestMethod.GET)
    public ResponseEntity helloPersonTime(@PathVariable String nome){
        logger.info("INFO: Este endpoint vem com a mensagem de Hello + nome + a hora");
        return new ResponseEntity<>("Hello "+ nome + "! Agora são " + helloServices.helloComHorario() + ", não esqueça!", HttpStatus.OK);
    }
    
}
