package com.pdg.provider.service.impl;

import com.pdg.common.entity.Label;
import com.pdg.provider.mapper.LabelMapper;
import com.pdg.provider.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {
    @Autowired
    private LabelMapper labelMapper;
    @Override
    public List<Label> query() {
        return labelMapper.queryAll();
    }

    @Override
    public Label getOne(Integer lid) {
        return labelMapper.getOne(lid);
    }
}
