package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig
{
    @Autowired
    private List<String> toDo;

    @Autowired
    private List<String> inProgress;

    @Autowired
    private List<String> done;

    @Autowired
    @Qualifier("ToDo")
    TaskList taskListToDo;

    @Autowired
    @Qualifier("InProgress")
    TaskList taskListInProgress;

    @Autowired
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
        return new TaskList(toDo);
    }

    @Bean(name = "InProgress")
    @Scope("prototype")
    public TaskList getTaskListInProgress()
    {
        return new TaskList(inProgress);
    }

    @Bean(name = "Done")
    @Scope("prototype")
    public TaskList getTaskListDone()
    {
        return new TaskList(done);
    }
}
