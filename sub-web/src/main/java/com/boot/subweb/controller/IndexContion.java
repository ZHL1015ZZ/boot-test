package com.boot.subweb.controller;

import com.boot.subservice.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZHL
 * @Date 2020/9/6 17:50
 * @Description:
 */

@RestController
@RequestMapping("/data")
public class IndexContion {

    @Resource
    private DataService dataService;

    @GetMapping("dataModels")
    @Async
    public Object getDataModels(){
        Integer condition=1;
        return dataService.query(condition);
    }

    //test信息

}
