package org.gabrielffguimaraes.controller;

import org.gabrielffguimaraes.exceptions.FullReservatoryException;
import org.gabrielffguimaraes.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppRestController {
    @GetMapping("/")
    public List<String> app() {
        Car carro1 = new FordFiesta();
        Car carro2 = new Fusca();
        Fuel gas = new Gas();

        carro2.getFuels().put("gas",gas);
        ArrayList<String> response = new ArrayList<String>();
        try {
            carro1.getFuels().get("gas").fill(80);
            carro2.getFuels().get("gasoline").fill(150);

            response.add(carro1.getFuels().get("gas").fuelInfo());
            response.add(carro2.getFuels().get("gasoline").fuelInfo());

        } catch (FullReservatoryException ex) {
            ex.printStackTrace();
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,ex.getMessage());
        }
        return response;
    }
}
