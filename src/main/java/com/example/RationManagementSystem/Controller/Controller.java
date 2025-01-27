package com.example.RationManagementSystem.Controller;
import com.example.RationManagementSystem.Entity.RationEntity;
import com.example.RationManagementSystem.Repository.SaveDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;





@RestController
    @RequestMapping("/api/entities")
    public class Controller {

        @Autowired
        private SaveDb repository;

        @GetMapping("/all/entities")
        public List<RationEntity> getAllEntities() {

            return repository.findAll();
        }

        @PostMapping("save/entity")
        public RationEntity createEntity(@RequestBody RationEntity entity) {
            return repository.save(entity);
        }
    @PostMapping("/checkByID")
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

//        @PostMapping("/deleteByID")
//    public String deleteEntityById(@RequestParam String id) {
//            return repository.deleteById(id);
//        }
    @PostMapping("/findOne")
    public RationEntity findOne(Long id) {
            return repository.findOne(id);
    }
    }






