package com.example.projectreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.projectreview.model.Donor;
import com.example.projectreview.service.DonorService;

@RestController
public class DonorController {
    @Autowired
    DonorService ds;

    @PostMapping("/postdonordetails")
    public ResponseEntity<Donor> add(@RequestBody Donor d)
    {
        Donor newuser = ds.create(d);
        return new ResponseEntity<>(newuser,HttpStatus.CREATED);
    }
    
    @GetMapping("/getdonordetails")
    public ResponseEntity <List<Donor>> show()
    {
        List<Donor>obj = ds.getAlldetails();
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    @GetMapping("/api/donor/{offset}/{pagesize}/{field}")
    public List<Donor> getsorting(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
        return ds.getsort(offset,pagesize,field);
    }

    @PutMapping("/api/donor/{donorId}")
    public ResponseEntity<Donor> putMethodName(@PathVariable("donorId") int id, @RequestBody Donor employee) {
        if(ds.updateDetails(id,employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/donor/petBreed/{petBreed}")
    public ResponseEntity<?>getPetByBreed(@PathVariable("petBreed") String petBreed)
    {
            return new ResponseEntity<>(ds.getPetByBreed(petBreed),HttpStatus.OK);
    }

    @DeleteMapping("/api/donor/{donorId}")
    public ResponseEntity<Boolean> delete(@PathVariable("donorId") int id)
    {
        if(ds.deleteDonor(id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
}
