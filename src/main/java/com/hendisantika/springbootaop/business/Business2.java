package com.hendisantika.springbootaop.business;

import com.hendisantika.springbootaop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-aop
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/02/18
 * Time: 06.38
 * To change this template use File | Settings | File Templates.
 */
@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething() {
        //Business Logic
        return dao2.retrieveSomething();
    }
}