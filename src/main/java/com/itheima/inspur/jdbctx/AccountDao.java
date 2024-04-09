package com.itheima.inspur.jdbctx;

public interface AccountDao {
    //增加账户金额
    public void addMoney(String username, Double money);

    //减少账户金额
    public void subMoney(String username, Double money);

    //查询账户金额
    public String queryAcountMoney(String username);
    //转账
    public  void tranfAccount(String sourceName, String targetName,Double money);

}


