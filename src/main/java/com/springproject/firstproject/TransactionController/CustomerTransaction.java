package com.springproject.firstproject.TransactionController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerTransaction {
//    int tranNumber;
//    getUserAction();
//    deposit();
//    withdraw();

    @RequestMapping("/withdraw")
    public String withdrawal(Model model)
    {
        return "withdraw";
    }

    @RequestMapping("/deposit")
    public String desposit(Model model)
    {
        return "deposit";
    }
}
