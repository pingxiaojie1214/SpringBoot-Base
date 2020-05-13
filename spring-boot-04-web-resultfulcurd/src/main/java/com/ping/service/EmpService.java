package com.ping.service;

import com.ping.pojo.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pxj
 */
@Repository
public class EmpService {
    private static Map<Integer, Employee> emps = new HashMap<>();

    static {
        emps.put(1001, new Employee(1001, "张三", "男", 26, "JAVA106", new Date("1994/12/14")));
        emps.put(1002, new Employee(1002, "董一", "女", 22, "JAVA106", new Date("1992/12/14")));
        emps.put(1003, new Employee(1003, "董二", "男", 24, "JAVA106", new Date("1993/12/01")));
        emps.put(1004, new Employee(1004, "董三", "女", 28, "JAVA106", new Date("1996/12/13")));
        emps.put(1005, new Employee(1005, "董四", "男", 22, "JAVA106", new Date("1994/12/12")));
    }

    private static Integer initId = 1006;

    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        emps.put(employee.getId(), employee);
    }

    /**
     * 查询所有员工
     *
     * @return
     */
    public Collection<Employee> getAll() {
        return emps.values();
    }

    public Employee get(Integer id) {
        return emps.get(id);
    }

    public void delete(Integer id) {
        emps.remove(id);
    }
}
