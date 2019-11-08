package com.example.lib;

import java.util.Scanner;

public class Servitor {
    private Scanner scanner = new Scanner(System.in);
    private String Staffnumber;
    private String Name;
    private String SalaryPerHour;
    private String WorkHour;
    private String MonthlyIncome;

    public void setStaffnumber(String setStaffnumber){
        Staffnumber = setStaffnumber;
    }
    public void setName(String setName){
        Name = setName;
    }
    public void setSalaryPerHour(String setSalaryPerHour){
        SalaryPerHour = setSalaryPerHour;
    }
    public void setWorkHour(String setWorkHour){
        WorkHour = setWorkHour;
    }
    public void setMonthlyIncome(String setMonthlyIncome){
        MonthlyIncome = setMonthlyIncome;
    }
    public void setAllVariable(){
        System.out.println("請輸入員工編號");
        setStaffnumber(scanner.next());
        System.out.println("請輸入姓名");
        setName(scanner.next());
        System.out.println("請輸入時薪");
        setSalaryPerHour(scanner.next());
        System.out.println("請輸入工作時數");
        setWorkHour(scanner.next());
    }
    public void calc(){
        int SPH,WH,MI;
        SPH = Integer.parseInt(SalaryPerHour);
        WH = Integer.parseInt(WorkHour);
        setMonthlyIncome(String.valueOf(SPH*WH));
        System.out.printf("員工編號: %s 姓名: %s 時薪: %s 工作時數: %s 月收入: %s \n",Staffnumber,Name,SalaryPerHour,WorkHour,MonthlyIncome);
    }
    public void printAllType(){
        System.out.printf("員工編號: %s 姓名: %s 時薪: %s 工作時數: %s 月收入: %s \n",Staffnumber,Name,SalaryPerHour,WorkHour,MonthlyIncome);
    }
}
