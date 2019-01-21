package com.ps.fescar.business.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ps.fescar.storage.service.StorageService;

public class ProxyService {
    private StorageService storageService;
}
