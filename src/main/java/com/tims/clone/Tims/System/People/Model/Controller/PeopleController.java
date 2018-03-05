package com.tims.clone.Tims.System.People.Model.Controller;

import com.tims.clone.Tims.System.People.Model.PeopleModel;
import com.tims.clone.Tims.System.People.Model.PeopleRepositry.PeopleRespositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    PeopleRespositry repositry;

    @Autowired
    public void setRepositry(PeopleRespositry repositry){
        this.repositry=repositry;
    }


    @GetMapping("/all")
    public List<PeopleModel> getAll(){
        List<PeopleModel> list = new ArrayList<>();
        for(PeopleModel people :repositry.findAll() ){
            list.add(people);
        }

        return list;

    }
}
