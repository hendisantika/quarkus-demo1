package com.hendisantika.controller;

import com.hendisantika.service.TransferService;

import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-demo1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/10/21
 * Time: 18.42
 */
@Path("/transfer")
public class TransferController {

    @Inject
    TransferService transferService;

}
