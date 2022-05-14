package com.uplus.domain.common;

import com.uplus.domain.config.AppSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataBaseTestController {
    final static Logger logger = LoggerFactory.getLogger(DataBaseTestController.class);
    private final AppSettings config;

    @Autowired
    public DataBaseTestController(AppSettings config) {
        this.config = config;
    }
    @GetMapping("/secret")
    public ResponseEntity getSecret() {
        logger.debug("secret test",config.getMySecret());
        return ResponseEntity.ok(config.getMySecret());
    }
}
