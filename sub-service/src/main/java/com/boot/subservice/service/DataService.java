package com.boot.subservice.service;

import com.boot.subentity.pojo.DataModel;

import java.util.List;

/**
 * @author ZHL
 * @Date 2020/9/6 17:47
 * @Description:
 */
public interface DataService {

    List<DataModel>  query(Integer condition);
}
