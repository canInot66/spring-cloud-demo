package com.learn.account;

import com.learn.account.http.BillHttp;
import com.learn.account.http.BillReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class AccountApplication {
    private Logger logger = LoggerFactory.getLogger(AccountApplication.class);

    @Autowired
    private BillHttp billHttp;

        //http://localhost:5080/account
    @RequestMapping("/account")
    public Object get() {
        logger.info("--------------");
        BillReq billReq = new BillReq();
        billReq.setAmt(1);
        billReq.setBillNo("21212");
        String bill = billHttp.createBill(billReq);
        logger.info("resp:{}", bill);
        return "ok";
    }


    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}
