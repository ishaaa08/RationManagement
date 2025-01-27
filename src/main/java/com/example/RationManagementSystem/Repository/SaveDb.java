package com.example.RationManagementSystem.Repository;
//
//public class SaveDb {
//}


import com.example.RationManagementSystem.Entity.RationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveDb extends JpaRepository<RationEntity, Long> {
    // Add custom query methods if needed
}
