package com.hendisantika.springbootaop.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-aop
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/02/18
 * Time: 06.43
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
