package com.pdg.consumer.controller;

import com.pdg.common.entity.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {
//    private static String REST_LABEL_PREFIX="http://localhost:8002";
    private static String REST_LABEL_PREFIX="http://microservice-provider";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/query")
    @ResponseBody
    public List<Label> getList(){
       return restTemplate.postForObject(REST_LABEL_PREFIX+"/label/query","",List.class);
    }
}
