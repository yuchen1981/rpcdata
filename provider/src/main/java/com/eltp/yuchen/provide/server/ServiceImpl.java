package com.eltp.yuchen.provide.server;

import com.eltp.yuchen.interfaceservice.IService;
import com.eltp.yuchen.provide.bean.DruidConfiguration;
import com.eltp.yuchen.provide.dao.SharesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Service(value = "ServiceImpl")
public class ServiceImpl implements IService {

    @Resource
    private SharesMapper sharesmapper;
    @Override
    public List findShares() {

        return sharesmapper.findShares();
    }

    @Override
    public String ShowRPC(String str) {
        return "hello "+str;
    }
}
