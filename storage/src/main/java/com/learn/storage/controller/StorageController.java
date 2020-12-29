package com.learn.storage.controller;

import com.learn.storage.dto.DeductReq;
import com.learn.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/storage")
public class StorageController {
    @Autowired
    private StorageService storageService;

    @RequestMapping("/deduct")
    public Map<String, Object> deduct(@RequestBody DeductReq deductReq) {
        storageService.deduct(deductReq.getCommodityCode(), deductReq.getCount());
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("code", 200);
        return resMap;
    }
}
