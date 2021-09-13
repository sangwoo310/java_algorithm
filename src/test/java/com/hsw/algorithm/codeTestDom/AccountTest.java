package com.hsw.algorithm.codeTestDom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        Assertions.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void depositAndWithdrawCannotHaveNegativeNumber() {
        Account account = new Account(20);

        Assertions.assertFalse(account.deposit(-20));
        Assertions.assertFalse(account.withdraw(-20));
    }

    @Test
    public void accountCannotOverstepItsOverdraft() {
        Account account = new Account(20);


    }

}