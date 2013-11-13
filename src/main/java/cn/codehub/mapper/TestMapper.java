package cn.codehub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.codehub.entity.Test;
import cn.codehub.page.PageInfo;

public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
    
    public void insertUser(Test user);  
	public Test getUser(String name); 
	public List<Test> getUserList(String name);
	public List<Test> getUserListPage(@Param("page") PageInfo page);
}