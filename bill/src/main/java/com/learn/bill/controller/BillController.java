package com.learn.bill.controller;

import com.learn.bill.dto.BillReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {
    
    private final Logger logger = LoggerFactory.getLogger(BillController.class);

    @RequestMapping("/create")
    public Object createBill(@RequestBody BillReq billReq) {
        logger.info("create bill :{}", billReq);
        return "200";
    }
}
