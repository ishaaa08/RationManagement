package com.example.RationManagementSystem.Controller;
import com.example.RationManagementSystem.Entity.RationEntity;
import com.example.RationManagementSystem.Repository.SaveDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;





@RestController
    @RequestMapping("/api/entities")
    public class Controller {

        @Autowired
        private SaveDb repository;

        @GetMapping
        public List<RationEntity> getAllEntities() {
            return repository.findAll();
        }

        @PostMapping
        public RationEntity createEntity(@RequestBody RationEntity entity) {
            return repository.save(entity);
        }
    }






