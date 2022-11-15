package com.lening.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lening.entity.LnCoach;
import com.lening.entity.LnTrainee;
import com.lening.entity.Subject;
import com.lening.mapper.LnCoachMapper;
import com.lening.mapper.LnSubjectMapper;
import com.lening.mapper.LnTraineeMapper;
import com.lening.service.LnTraineeService;
import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LnTraineeServiceimpl implements LnTraineeService {
    @Resource
    private LnTraineeMapper lnTraineeMapper;
    @Resource
    private LnCoachMapper lnCoachMapper;
    @Resource
    private LnSubjectMapper lnSubjectMapper;
    @Override
    public PageInfo<LnTrainee> findAll(LnTrainee lnTrainee, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Example example = new Example(LnTrainee.class);
        Example.Criteria criteria = example.createCriteria();
        if (lnTrainee!=null){
            if (!StringUtils.isEmpty(lnTrainee.getTlnname())){
                criteria.andLike("tlnname","%"+lnTrainee.getTlnname()+"%");
            }
            if (lnTrainee.getsLnid()!=null&&lnTrainee.getsLnid()!=-1){
                Integer sid = lnTrainee.getsLnid();
                criteria.andEqualTo("sLnid",sid);
            }
        }
        List<LnTrainee> list = lnTraineeMapper.selectByExample(example);
        for (LnTrainee lntrainee : list) {
            Integer cid = lntrainee.getcLnid();
            LnCoach lncoach = lnCoachMapper.selectByPrimaryKey(cid);
            lntrainee.setLnCoach(lncoach);
            Integer sid = lntrainee.getsLnid();
            Subject subject = lnSubjectMapper.selectByPrimaryKey(sid);
            lntrainee.setSubject(subject);
        }
        PageInfo<LnTrainee> pageInfo = new PageInfo<LnTrainee>(list);
        return pageInfo;
    }
}
