package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Slf4j
@Controller
public class CustomerController {
    //This points to the website url

    @Autowired
    private CustomerDAO customerDao;

    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");
        log.info("In create customer with no args ");
        return response;
    }

    @GetMapping("/customer/createSubmit")
    public ModelAndView createCustomerSubmit(CreateCustomerFormBean form) {
        ModelAndView response = new ModelAndView("customer/create");

        System.out.println("firstName:" + form.getFirstName());
        System.out.println("lastName:" + form.getLastName());
        System.out.println("phone:" + form.getPhone());
        System.out.println("city:" + form.getCity());

        Customer customer = new Customer();
        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setCity(form.getCity());
         customerDao.save(customer);
        log.info("In create customer with incoming args ");
        return response;
    }
//public ModelAndView createCustomer()
// The requestparams refers to the name attribute in form
    /*public ModelAndView createCustomer(@RequestParam(required = false)String firstName,
                                        @RequestParam(required = false)String lastName,
                                        @RequestParam(required = false)String phone,
                                        @RequestParam(required = false)String city)
    {
        //This points to the customer folder path
        ModelAndView response = new ModelAndView("customer/create");

        System.out.println("firstName:"+firstName);
        System.out.println("lastName:"+lastName);
        System.out.println("phone:"+phone);
        System.out.println("city:"+city);



        return response;
    }*/
}