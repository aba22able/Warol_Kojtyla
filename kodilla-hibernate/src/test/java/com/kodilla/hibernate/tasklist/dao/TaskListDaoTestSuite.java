package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class TaskListDaoTestSuite
{

    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "Sample Task";
    private static final String DESCRIPTION = "Sample Description";

    @Test
    public void testFindByListName()
    {
        //Given
        TaskList taskList = new TaskList(1, NAME, DESCRIPTION);
        taskListDao.save(taskList);
        String list1 = taskList.getListName();

        //When
        List<TaskList> taskLists = taskListDao.findByListName(list1);

        //Then
        Assertions.assertEquals(1, taskLists.size());

        //CleanUp
        int id = taskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
