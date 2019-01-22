package com.ps.fescar.account;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.ps.fescar.account.dao.mapper")
public class AccountApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AccountApplication.class).build().run(args);
    }
}
