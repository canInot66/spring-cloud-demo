package com.learn.storage.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class StorageServiceImpl implements StorageService {
    private AtomicInteger storageCount = new AtomicInteger(10);
    private Logger logger = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Override
    public void deduct(String commodityCode, int count) {
        int newCount = storageCount.addAndGet(-count);
        logger.info("仓储服务:commodityCode:{},数量：{}，库存剩余:{}", commodityCode, count, newCount);
    }
}
