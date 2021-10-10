package com.hendisantika.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-demo1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/10/21
 * Time: 18.39
 */
@Transactional
@ApplicationScoped
public class TransferService {
    @Inject
    EntityManager em;
}
