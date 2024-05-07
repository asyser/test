package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping(method = RequestMethod.GET)
    public String displayEmployee(ModelMap model) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Brinsi Lina", "Разработчик", 1000));
        employees.add(new Employee("Kozlova Anastasiya", "Дизайнер", 1000));
        employees.add(new Employee("Shoman Viktoria", "Менеджер", 800));

        model.addAttribute("employees", employees);

        return "employee";
    }
}