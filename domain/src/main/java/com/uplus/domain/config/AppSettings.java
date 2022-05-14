package com.uplus.domain.config;

import com.uplus.domain.common.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/application.yml")
public class AppSettings {
    final static Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Value(value = "${my.secret}")
    private String mySecret;

    public String getMySecret() {return mySecret;}

    public void setMySecret(String mySecret) {this.mySecret = mySecret;}
}
