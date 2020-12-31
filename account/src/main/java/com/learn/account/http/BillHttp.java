package com.learn.account.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("bill-service")
public interface BillHttp {
    @RequestMapping(method = RequestMethod.POST, value = "/create",consumes = "application/json")
    String createBill(@RequestBody BillReq billReq);

}
