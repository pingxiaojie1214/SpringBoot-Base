package com.ping.controller;

import com.ping.pojo.Employee;
import com.ping.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author pxj
 */
@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 查询所有员工返回列表页面
     *
     * @return
     */
    @GetMapping(value = "/emps")
    public String list(Model model) {
        Collection<Employee> employees = empService.getAll();
        //放在请求域中
        model.addAttribute("emps", employees);
        return "emp/userList";
    }

    /**
     * 跳转添加页面
     *
     * @return
     */
    @GetMapping(value = "/emp")
    public String toAddEmp() {
        return "emp/add";
    }

    /**
     * 员工添加
     * springMVC自动将请求参数和入参对象的属性进行一一绑定；要求请求参数的名字和javaBean里面属性的名字一样。
     *
     * @param employee
     * @return
     */
    @PostMapping(value = "/emp")
    public String addEmp(Employee employee) {
        System.out.println("员工新增");
        empService.save(employee);
        return "redirect:/emps";
    }

    /**
     * 跳转到修改员工页面
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping(value = "/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id, Model model) {
        Employee employee = empService.get(id);
        model.addAttribute("emp", employee);
        //回到修改页面（add是一个修改添加的二合一页面）
        return "/emp/add";
    }

    /**
     * 员工修改
     *
     * @param employee
     * @return
     */
    @PutMapping(value = "/emp")
    public String updateEmp(Employee employee) {
        System.out.println("员工修改");
        empService.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping(value = "/emp/{id}")
    public String deleEmp(@PathVariable("id") Integer id) {
        empService.delete(id);
        return "redirect:/emps";
    }
}
