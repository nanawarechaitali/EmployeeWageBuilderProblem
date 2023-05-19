package com.bridgelabz;

public class CheckAttendance {
    int Is_Present = 1;
    int Is_Absent = 0;
    int Full_Time = 1;
    int Part_Time = 2;

    int Wage_Per_Hrs = 20;
    int workingHrs = 0;

    public void  CheckEmpAttendance(){
        int checkAttendance =(int)(Math.random()*100)%3;
        switch(checkAttendance){
            case 1 :
                //if(checkAttendance==Full_Time){
               System.out.println("Employee is present");
               workingHrs=8;
               break;

            case 2 :
                //else if(checkAttendance==Part_Time)
                System.out.println("Employee is Present");
                workingHrs = 4;
                break;
            default:

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
