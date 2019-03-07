package com.pdg.provider.controller;

import com.pdg.common.entity.Label;
import com.pdg.provider.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;

    @RequestMapping(value ="/query")
    @ResponseBody
    public List<Label> queryAll(){
        return labelService.query();
    }

    @ResponseBody
    @RequestMapping(value="/getOne",produces = {"application/json;charset=UTF-8"})
    public Label getOne(@RequestBody Integer lid){
        return labelService.getOne(lid);
    }
}
