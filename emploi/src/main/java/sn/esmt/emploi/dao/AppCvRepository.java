package sn.esmt.emploi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.emploi.entities.AppCvEntity;

@Repository
public interface AppCvRepository extends JpaRepository<AppCvEntity, Integer>{
    AppCvEntity findById(int id);
    
}
