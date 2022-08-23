package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite
{
    @Test
    public void publicationYearMedianTest()
    {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Set<Book> bookSet= new HashSet<>();
        Book book1 = new Book("Walaszek", "W pustyni i w puszczy", 1999, "1");
        Book book2 = new Book("Walaszek", "Krzyżacy", 2000, "2");
        Book book3 = new Book("Walaszek", "Ogniem i mieczem", 2001, "3");
        Book book4 = new Book("Walaszek", "Łysek z pokładu Idy", 2002, "4");
        Book book5 = new Book("Walaszek", "Balladyna", 2003, "5");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        //When
        int medianPubYear = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println(medianPubYear);
        assertEquals(medianPubYear, 2001);
    }
}
