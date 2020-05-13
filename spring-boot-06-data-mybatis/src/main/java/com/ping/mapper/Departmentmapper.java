package com.ping.mapper;

import com.ping.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author pxj
 */
//@Mapper
public interface Departmentmapper {

    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id = #{id}")
    public int deleteDeptById(Integer id);

    //useGeneratedKeys是不是使用自动生成的主键，keyProperty哪个属性是来封装主键的
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name = #{departmentName} where id = #{id}")
    public int updateDept(Department department);
}
