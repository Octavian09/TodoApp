package com.example.cody.todolist;


import android.text.method.DateTimeKeyListener;

import java.util.Date;

public class Item
{
    private int id;
    private String name;
    private Date created;
    private Date deadline;
    private int priority;

    private void setid(int newID)
    {
        id = newID;
    }
    private void setName(String newItemName)
    {
        name = newItemName;
    }
    private void setPriority(int newPriority)
    {
        priority = newPriority;
    }
    private void setDates(Date creationDate, Date deadlineDate)
    {
        created = creationDate;
        deadline = deadlineDate;
    }

}

