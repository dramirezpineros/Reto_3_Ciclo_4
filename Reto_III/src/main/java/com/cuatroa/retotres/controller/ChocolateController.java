
package com.cuatroa.retotres.controller;

import java.util.List;
import java.util.Optional;

import com.cuatroa.retotres.model.Chocolate;
import com.cuatroa.retotres.service.ChocolateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chocolate")
@CrossOrigin("*")

public class ChocolateController
{
   
    @Autowired
    private ChocolateService accessoryService;
    @GetMapping("/all")
    public List<Chocolate> getAll() 
    {
        return accessoryService.getAll();
    }

    @GetMapping("/{reference}")   
    public Optional<Chocolate> getClothe(@PathVariable("reference") String reference) 
    {
        return accessoryService.getClothe(reference);
    }
 
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Chocolate create(@RequestBody Chocolate gadget) 
    {
        return accessoryService.create(gadget);
    }
    

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Chocolate update(@RequestBody Chocolate gadget) 
    {
        return accessoryService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) 
    {
        return accessoryService.delete(reference);
    }
    
}