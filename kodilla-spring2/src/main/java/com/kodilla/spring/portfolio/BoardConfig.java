package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BoardConfig
{
    @Qualifier("ToDo")
    TaskList taskListToDo;

    @Qualifier("InProgress")
    TaskList taskListInProgress;

    @Qualifier("Done")
    TaskList taskListDone;

    @Bean
    public Board board()
    {
        return new Board(taskListToDo,taskListInProgress,taskListDone);
    }

    @Bean(name = "ToDo")
    @Scope("prototype")
    public TaskList getTaskListToDo()
    {
        return new TaskList(taskListToDo.getTasks());
    }

    @Bean(name = "InProgress")
    @Scope("prototype")
    public TaskList getTaskListInProgress()
    {
        return new TaskList(taskListInProgress.getTasks());
    }

    @Bean(name = "Done")
    @Scope("prototype")
    public TaskList getTaskListDone()
    {
        return new TaskList(taskListDone.getTasks());
    }
}
