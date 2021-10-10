package com.hendisantika.service;

import com.hendisantika.dto.TransferDto;
import com.hendisantika.model.Transfer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

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

    public List<Transfer> findAll() {
        return em.createQuery("select t from Transfer t", Transfer.class).getResultList();
    }

    public Long create(TransferDto transferDto) {
        Transfer transfer = new Transfer();
        transfer.setAccountFrom(transferDto.getAccountFrom());
        transfer.setAccountTo(transferDto.getAccountTo());
        transfer.setAmount(transferDto.getAmount());
        transfer.setTransferDate(new Date());
        em.persist(transfer);

        return transfer.getId();
    }
}
