package com.tengyun.script;

import lombok.Data;

import java.util.Calendar;

/**
 * @author Adam
 */
@Data
public class LogTemplatePrinter {

    private int year = 2020;

    private int month = Calendar.JANUARY;

    private int date = 1;

    private int firstDayOfWeek = Calendar.MONDAY;

    private int perWeekWalk = 12;

    private String taskPrefix = "- [ ] ";

    public void printWeekInfo(int week){
        System.out.println("### " + year + "年第" + week + "周\n\nTasks:\n");
    }

    public void printLogTemplate(){
        Calendar cld = Calendar.getInstance();
        cld.set(year, month, date);
        cld.setFirstDayOfWeek(firstDayOfWeek);

        for (int i = cld.get(Calendar.WEEK_OF_YEAR); i < cld.getWeeksInWeekYear() + 1; i++){
            printWeekInfo(i);
            printWalkInfo(i);
        }
        System.out.println(cld.getTime());
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
        ltp.setMonth(Calendar.MAY);
        ltp.setDate(26);

        ltp.printLogTemplate();
    }
}
