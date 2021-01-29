package org.codejudge.sb.controller;

import io.swagger.annotations.ApiOperation;

import org.codejudge.sb.entity.Leads;
import org.codejudge.sb.repository.LeadsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

    @ApiOperation("This is the hello world api")
    @GetMapping("/")
    public String hello() {
        return "Hello World!!";
    }
    
    @Autowired
    private LeadsRepository leadsRespository;
    
    //fetch a lead   -- GET
    
    @GetMapping("/{id}")
    public Leads fetchLead(@PathVariable (value = "id") int id){
    	return this.leadsRespository.getOne(id); //or findOne method??
    }
    
    //generate a lead -- POST
    
    @PostMapping
    public Leads generateLead(@RequestBody Leads leads) {
    	return this.leadsRespository.save(leads);
    }
    
    //update a lead   -- UPDATE
    
    @PutMapping("/{id}")
    public Leads updateLead(@RequestBody Leads leads , @PathVariable (value = "id") int id) {
    	return this.leadsRespository.save(leads);  	
    }
    
    //remove a lead   -- DELETE
    
    @DeleteMapping("/{id}")
    public void removeLead(@PathVariable (value = "id") int id) {
    	this.leadsRespository.delete(id);   	
    }
    
    //mark a lead     -- PUT

}
