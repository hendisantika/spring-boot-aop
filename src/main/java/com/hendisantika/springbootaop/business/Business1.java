package com.hendisantika.springbootaop.business;

import com.hendisantika.springbootaop.data.Dao1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-aop
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/02/18
 * Time: 06.35
 * To change this template use File | Settings | File Templates.
 */
@Service
public class Business1 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Dao1 dao1;

    public String calculateSomething() {
        //Business Logic
        String value = dao1.retrieveSomething();
        logger.info("In Business - {}", value);
        return value;
    }
}
