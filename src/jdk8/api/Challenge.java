/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author nagnello
 */
public class Challenge {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate first;
        LocalDate second;
        LocalDate third;
        LocalDate fourth;
        LocalDate fifth;
        date = date.with(TemporalAdjusters.lastDayOfMonth());
        //System.out.println(date);
        first = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        
        
        
        second = first.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        third = second.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        fourth = third.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        
        if(fourth.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)).isBefore(date.plusMonths(1))){
           fifth = fourth.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)); 
        }
        else
            fifth = null;
        
        
        
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
    }
    
}
