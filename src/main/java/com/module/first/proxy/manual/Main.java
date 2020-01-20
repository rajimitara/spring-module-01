package com.module.first.proxy.manual;

import com.module.first.common.dao.SongDao;

public class Main {
    public static void main(String[] args) {

        ProxyImpl proxy = new ProxyImpl( new SongDao());

        proxy.search("d");

    }
}
