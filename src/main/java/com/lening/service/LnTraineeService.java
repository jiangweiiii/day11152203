package com.lening.service;

import com.github.pagehelper.PageInfo;
import com.lening.entity.LnTrainee;

public interface LnTraineeService {

    PageInfo<LnTrainee> findAll(LnTrainee lnTrainee, Integer pageNum, Integer pageSize);
}
