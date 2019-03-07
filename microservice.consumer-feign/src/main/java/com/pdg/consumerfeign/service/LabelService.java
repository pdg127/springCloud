package com.pdg.consumerfeign.service;

import com.pdg.common.entity.Label;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "microservice-provider")
public interface LabelService {

    @RequestMapping(value = "label/query",method = RequestMethod.POST)
    public List<Label> query();
}
