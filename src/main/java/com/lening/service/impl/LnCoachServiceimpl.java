package com.lening.service.impl;

import com.lening.entity.LnCoach;
import com.lening.mapper.LnCoachMapper;
import com.lening.service.LnCoachService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LnCoachServiceimpl implements LnCoachService {
    @Resource
    private LnCoachMapper lnCoachMapper;
    @Override
    public List<LnCoach> findAllCoach() {
        return lnCoachMapper.selectAll();
    }
}
