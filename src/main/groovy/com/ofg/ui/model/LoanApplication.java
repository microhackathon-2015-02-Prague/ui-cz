package com.ofg.ui.model;

import java.math.BigDecimal;

public class LoanApplication {
    
    private long clientId;
    
    private BigDecimal amount;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    
}
