package sn.esmt.emploi.ws;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sn.esmt.emploi.dao.AppCvRepository;
import sn.esmt.emploi.entities.AppCvEntity;

import java.util.List;
@RestController
@RequestMapping
@AllArgsConstructor

public class AppCvController {

    private AppCvRepository appCvRepository;

    @PostMapping(path = "/save")
    public AppCvEntity save(@RequestBody AppCvEntity appCvEntity){
        return appCvRepository.save(appCvEntity);
    }
    @GetMapping(path= "/all")
    public List<AppCvEntity> getAll(){
        return appCvRepository.findAll();
    }

}
