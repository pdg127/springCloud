package com.pdg.provider.service;
import com.pdg.common.entity.Label;

import java.util.List;

public interface LabelService {

    List<Label> query();

    Label getOne(Integer lid);
}
