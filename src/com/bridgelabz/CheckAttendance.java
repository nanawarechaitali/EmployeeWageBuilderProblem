package com.bridgelabz;

public class CheckAttendance {
    int Is_Present = 1;
    int Is_Absent = 0;
    int Full_Time = 1;
    int Wage_Per_Hrs = 20;
    int workingHrs = 8;

    public void  CheckEmpAttendance(){
        int checkAttendance =(int)(Math.random()*100)%2;
        if(checkAttendance==Full_Time){
            System.out.println("Employee is present");


        }else{
            System.out.println("Employee is absent");
        }
        int wage = workingHrs*Wage_Per_Hrs;
        System.out.println("Employee Daily Wage is" + wage);


    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program on Master branch");

        CheckAttendance obj = new CheckAttendance();
        obj.CheckEmpAttendance();





    }
}
