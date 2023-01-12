package com.example.mywabApp.service;

import com.example.mywabApp.entity.GIIT;
import com.example.mywabApp.repoitory.GIITRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GIITService {

    @Autowired
    private GIITRepository giitRepository;
    public GIIT saveGIIT(GIIT giit){
        return giitRepository.save(giit);
    }
    public List<GIIT> saveGIITs(List<GIIT>giits){
        return giitRepository.saveAll(giits);
    }
    public List<GIIT>getGIITs(){
        return giitRepository.findAll();
    }
    public GIIT getGIITById(int id){
        return giitRepository.findById(id).orElse(null);
    }
    public GIIT getGIITByEmployeeName(String name){
        return giitRepository.findByEmployeeName(name);
    }
    public String deleteGIIT(int id){
        giitRepository.deleteById(id);
        return "giit removed ||"+id;
    }
    public GIIT updateGIIT(GIIT giit){
        GIIT existingGIIT=giitRepository.findById(giit.getId()).orElse(null);
        existingGIIT.setEmployeeName(giit.getEmployeeName());
        existingGIIT.setStatus(giit.getStatus());
        existingGIIT.setSalary(giit.getSalary());
        return giitRepository.save(existingGIIT);
    }


}
