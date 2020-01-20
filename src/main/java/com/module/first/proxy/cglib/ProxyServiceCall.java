package com.module.first.proxy.cglib;

import com.module.first.common.dao.SongDao;
import com.module.first.proxy.manual.ProxyImpl;
import org.springframework.cglib.proxy.Proxy;

public class ProxyServiceCall {

    public static void main(String[] args) {
         SongDao songDaoProxy = (SongDao) Proxy.newProxyInstance(SongDao.class.getClassLoader(),
                ProxyImpl.class.getInterfaces(), new ProxyInvocationHandler(new SongDao()));

        songDaoProxy.search("Value");
    }
}
