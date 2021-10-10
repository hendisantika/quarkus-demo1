package com.hendisantika.dto;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-demo1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/10/21
 * Time: 18.37
 */
public class TransferDto {
    private String accountFrom;
    private String accountTo;
    private BigDecimal amount;

    public TransferDto() {
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public String getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
