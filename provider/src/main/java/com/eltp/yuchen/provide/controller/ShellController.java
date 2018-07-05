package com.eltp.yuchen.provide.controller;


import com.eltp.yuchen.interfaceservice.IService;
import com.eltp.yuchen.pojo.Shares;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShellController {

    @Autowired
    private IService iserviceShares;
    @RequestMapping(value = "/getallShares",method = RequestMethod.GET)
    public List getallShares()
    {
        List<Shares> shares =(List<Shares>) iserviceShares.findShares();
        return shares;
    }
}
