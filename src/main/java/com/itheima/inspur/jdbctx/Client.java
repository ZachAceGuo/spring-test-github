package com.itheima.inspur.jdbctx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取AccountDao的实例
        AccountDao accountDao = (AccountDao)ctx.getBean("accountDao");
        // 使用实例调用非静态方法
        accountDao.tranfAccount("tom","smith",10000.0);
        // 打印账户余额
        System.out.println(accountDao.queryAcountMoney("smith"));
    }
}
