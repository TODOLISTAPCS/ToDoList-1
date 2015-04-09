/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrjaffesclass.apcs.todolist;
import java.util.*;
/**
 *
 * @author Michael
 */
public class descend implements Comparator<ToDoItem> {
 @Override
 public int compare(ToDoItem obj1, ToDoItem obj2){
    String input1 = obj1.getDate();
    String input2 = obj2.getDate();
    Date date1 = obj1.calcDate(input1);
    Date date2 = obj2.calcDate(input2);
    return date2.compareTo(date1);    
}
}
