package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class BoardTestSuite
{
    @Test
    public void testTaskAdd1()
    {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList taskList = board.getToDoList();
        List<String> list1 = taskList.getTasks();
        list1.add("Example1");
        //Then
        Assertions.assertEquals("Example1", list1.get(0));
    }

    @Test
    public void testTaskAdd2()
    {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList taskList = board.getToDoList();
        List<String> list2 = taskList.getTasks();
        list2.add("Example2");
        //Then
        Assertions.assertEquals("Example2", list2.get(0));
    }

    @Test
    public void testTaskAd3()
    {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList taskList = board.getToDoList();
        List<String> list3 = taskList.getTasks();
        list3.add("Example3");
        //Then
        Assertions.assertEquals("Example3", list3.get(0));
    }
    @Test
    public void showBeans()
    {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}
