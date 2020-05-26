package com.tengyun.script;

import lombok.Data;

/**
 * @author Adam
 */
@Data
public class LogTemplatePrinter {

    private int year = 2020;

    private int weekStart = 1;

    private int weekEnd = 52;

    private int perWeekWalk = 12;

    private String taskPrefix = "- [ ] ";

    public void printWeekInfo(int week){
        System.out.println("### " + year + "年第" + week + "周\n\nTasks:\n");
    }

    public void printLogTemplate(){
        for (int i = weekStart; i < weekEnd + 1; i++){
            printWeekInfo(i);
            printWalkInfo(i);
        }
    }

    public void printWalkInfo(int week){
        int amount = 0;
        if (week >= 22 && week <= 36){
            int perWeek = (perWeekWalk * 36) / (36 - 22);
            System.out.println(taskPrefix + (week - 22) * perWeek + "km.\n");
        }
        else if (week <= 52){
            System.out.println(taskPrefix + week * perWeekWalk + "km.\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("----------main----------");
        LogTemplatePrinter ltp = new LogTemplatePrinter();
        ltp.weekStart = 22;
        ltp.printLogTemplate();
    }
}
