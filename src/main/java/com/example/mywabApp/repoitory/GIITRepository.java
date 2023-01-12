package com.example.mywabApp.repoitory;

import com.example.mywabApp.entity.GIIT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GIITRepository extends JpaRepository<GIIT,Integer> {
    GIIT findByEmployeeName(String name);
}
