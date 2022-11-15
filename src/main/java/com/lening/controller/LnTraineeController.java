package com.lening.controller;

import com.github.pagehelper.PageInfo;
import com.lening.entity.LnCoach;
import com.lening.entity.LnTrainee;
import com.lening.service.LnCoachService;
import com.lening.service.LnTraineeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/trainee")
public class LnTraineeController {
    @Resource
    private LnTraineeService lnTraineeService;
    @Resource
    private LnCoachService lnCoachService;
    @RequestMapping("/findAll")
    public PageInfo<LnTrainee> findAll(@RequestBody(required = false)LnTrainee lnTrainee,
                                       @RequestParam(defaultValue = "1")Integer pageNum,
                                       @RequestParam(defaultValue = "3")Integer pageSize){
            return lnTraineeService.findAll(lnTrainee,pageNum,pageSize);

    }
    @RequestMapping("/findAllCoach")
    public List<LnCoach> findAllCoach(){
        return lnCoachService.findAllCoach();
    }
}
