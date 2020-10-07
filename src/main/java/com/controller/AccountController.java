package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.AccountService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("accountController")
@RequestMapping("/main")
public class AccountController {
    private AccountService accountService;
    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String string = mapper.writeValueAsString(accountService.findAll());
        Integer count = accountService.count();
        JSONObject object = new JSONObject();
        object.put("code", 0);
        object.put("msg", "");
        object.put("count",count);
        object.put("data",string);
        return object.toString();
    }
}
