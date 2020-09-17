package com.boot.subdao.dao;

import com.boot.subentity.pojo.DataModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZHL
 * @Date 2020/9/6 17:41
 * @Description:
 */

@Repository
@Mapper
public interface DataDao {

    List<DataModel> getData(@Param("condition")Integer condition);
}
