package com.itheima.inspur.jdbctx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;


public class AccountDaoImpl implements AccountDao{

    private DataSource dataSource;
    private Connection conn;
    public DataSource getDataSource() {
        return dataSource;
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        try {
            conn = this.dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 增加账户金额
     */
    @Override
    public void addMoney(String username, Double money) {
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement("UPDATE t_account SET money = money + ? WHERE username = ?");
            psmt.setDouble(1, money);
            psmt.setString(2, username);
            psmt.executeUpdate();
            System.out.println("增加账户金额成功");
        } catch (SQLException e) {
            try {
            conn.rollback();
            System.out.println("增加账户金额失败");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
    /**
     * 减少账户金额
     */
    @Override
    public void subMoney(String username, Double money) {
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement("UPDATE t_account SET money = money - ? WHERE username = ?");
            psmt.setDouble(1, money);
            psmt.setString(2, username);
            psmt.executeUpdate();
            System.out.println("减少账户金额成功");
        } catch (SQLException e) {
            try {
                conn.rollback();
                System.out.println("减少账户金额失败");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }

    @Override
    public String queryAcountMoney(String username) {
        return null;
    }
    /**
     * 账号转账
     */
    @Override
    public void tranfAccount(String sourceName, String targetName, Double money) {
        try {
            // 设置为手动提交事务
            conn.setAutoCommit(false);
            subMoney(sourceName, money);
            // 模拟出现异常
            //Integer.parseInt("asdfas");
            addMoney(targetName, money);
            System.out.println("转账成功");
            // 提交事务
            conn.commit();
        } catch (Exception e){
            e.printStackTrace();
            try {
                //回滚事务
                conn.rollback();
                System.out.println("转账失败");
            } catch (SQLException e1){
                e1.printStackTrace();
            }
        }
    }
}
