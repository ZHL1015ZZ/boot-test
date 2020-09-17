package com.boot.subservice.service.impl;

import com.boot.subdao.dao.DataDao;
import com.boot.subentity.pojo.DataModel;
import com.boot.subservice.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZHL
 * @Date 2020/9/6 17:49
 * @Description:
 */

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private DataDao dataDao;


    @Override
    public List<DataModel> query(Integer condition) {
        return dataDao.getData(condition);
    }
}
