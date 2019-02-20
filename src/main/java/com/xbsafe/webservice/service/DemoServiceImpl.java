package com.xbsafe.webservice.service;

public class DemoServiceImpl implements DemoService {
    public String test(String param) {
        return "webservice demo get param:" + param;
    }
}
