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
        System.out.println("�п�J���u�s��");
        setStaffnumber(scanner.next());
        System.out.println("�п�J�m�W");
        setName(scanner.next());
        System.out.println("�п�J���~");
        setSalaryPerHour(scanner.next());
        System.out.println("�п�J�u�@�ɼ�");
        setWorkHour(scanner.next());
    }
    public void calc(){
        int SPH,WH,MI;
        SPH = Integer.parseInt(SalaryPerHour);
        WH = Integer.parseInt(WorkHour);
        setMonthlyIncome(String.valueOf(SPH*WH));
        System.out.printf("���u�s��: %s �m�W: %s ���~: %s �u�@�ɼ�: %s �리�J: %s \n",Staffnumber,Name,SalaryPerHour,WorkHour,MonthlyIncome);
    }
    public void printAllType(){
        System.out.printf("���u�s��: %s �m�W: %s ���~: %s �u�@�ɼ�: %s �리�J: %s \n",Staffnumber,Name,SalaryPerHour,WorkHour,MonthlyIncome);
    }
}
