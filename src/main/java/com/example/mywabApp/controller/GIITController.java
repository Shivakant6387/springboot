package com.example.mywabApp.controller;

import com.example.mywabApp.entity.GIIT;
import com.example.mywabApp.service.GIITService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GIITController {
    @Autowired
    private GIITService giitService;    
    @PostMapping("/addEmployee")
    public GIIT addEmployee(@RequestBody GIIT giit){
        return giitService.saveGIIT(giit);
    }
    @PostMapping("/addEmployees")
    public List<GIIT>addEmployees(@RequestBody List<GIIT>giits){
        return giitService.saveGIITs(giits);
    }
    @PostMapping("/giits")
    public List<GIIT> findAllGIITs(){
        return giitService.getGIITs();
    }
    @PostMapping("/giit/{id}")
    public GIIT findGIITById(@PathVariable int id){

        return giitService.getGIITById(id);
    }
    @GetMapping("/giit/{name}")
    public GIIT findGIITByName(@PathVariable String name){
        return giitService.getGIITByEmployeeName(name);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteGIIT(@PathVariable int id){
        return giitService.deleteGIIT(id);
    }

}
