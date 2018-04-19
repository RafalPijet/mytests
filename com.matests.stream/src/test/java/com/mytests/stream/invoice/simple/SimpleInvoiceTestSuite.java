package com.mytests.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();

        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product_1", 17.28), 2));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product_2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product_3", 6.49), 5));

        //Then
        Assert.assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }

}
