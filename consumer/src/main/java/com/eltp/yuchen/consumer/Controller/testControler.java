package com.eltp.yuchen.consumer.Controller;

import com.eltp.yuchen.interfaceservice.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class testControler {
    @Resource
    private IService iserviceShares;
    @RequestMapping(value = "/getallShares",method = RequestMethod.GET)
    public List getallShares()
    {
        List shares = iserviceShares.findShares();
        return shares;
    }

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String gethello(@RequestParam(name="name") String  name)
    {
        return iserviceShares.ShowRPC(name);
    }

}
