package com.springproject.firstproject.CustomerController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CustomerController {

    @RequestMapping("/home")
    public String home (){
        return "index";
    }
    @RequestMapping(value="/home", method= RequestMethod.POST, params="withdraw")
    public String getWithdrawPage() {
        return "/withdraw";
    }

    @RequestMapping(value="/home", method= RequestMethod.POST, params="Deposit")
    public String getDepositPage() {
        return "deposit";
    }

    @RequestMapping(value="/home", method= RequestMethod.POST, params="Transaction")
    public String getTransactionPage() {
        return "transaction";
    }
}
