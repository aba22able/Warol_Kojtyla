package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class invoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
//
//    @Autowired
//    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave(){

        //Given
        Item item1 = new Item(new BigDecimal(12), 0, new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(100), 1, new BigDecimal(80));

//        Product product1 = new Product("Kosmoslimy Mentolowe");
//
//        product1.getItems().add(item1);
//        product1.getItems().add(item2);
//
//        item1.setProduct(product1);
//        item2.setProduct(product1);

        Invoice invoice1 = new Invoice("01/01");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);

        //When
//        productDao.save(product1);
//        int product1Id = product1.getId();

        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //Then
//        assertNotEquals(0, product1Id);
        assertNotEquals(0, invoice1Id);

        //CleanUp
//        productDao.deleteById(product1Id);
//        invoiceDao.deleteById(invoice1Id);
    }

}
