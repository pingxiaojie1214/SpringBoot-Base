package com.ping.mapper;

import com.ping.bean.Employee;

/**
 * @author pxj
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
