package com.bridgelabz;

public class CheckAttendance {
    int Is_Present = 1;
    //int Is_Absent = 0;
    int Full_Time = 1;
    int Wage_Per_Hrs = 20;
    int workingHrs = 8;
    int Working_Day_Per_Month = 20;
    int totalWage = 0;

    public void  CheckEmpAttendance(){
        for(int day=1;day<=Working_Day_Per_Month;day++){
            int checkAttendance =(int)(Math.random()*100)%2;
            switch(checkAttendance){
                case 1 :
                    //if(checkAttendance==Full_Time){
                    System.out.println("Employee is present Full_Time");
                    workingHrs=8;
                    break;

                case 2 :
                    //else if(checkAttendance==Part_Time)
                    System.out.println("Employee is Present Part_Time");
                    workingHrs = 4;
                    break;
                default:

                    System.out.println("Employee is absent");
            }

            int wage = workingHrs*Wage_Per_Hrs;
            System.out.println("Day"+day+"wage is:"+wage);
            totalWage +=wage;


        }
        System.out.println("Total wage for a month is" + totalWage);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program on Master branch");

        CheckAttendance obj = new CheckAttendance();
        obj.CheckEmpAttendance();





    }
}
