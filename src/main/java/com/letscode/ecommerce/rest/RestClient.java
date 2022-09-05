package com.letscode.ecommerce.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        value = "restClient",
        url = "https://dummyjson.com")
public interface RestClient {

    @RequestMapping(path="/products/categories", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    List<String> findAll();
}

