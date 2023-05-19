package com.bridgelabz;

public class CheckAttendance {
    int Is_Present =1;
    int Is_Absent=0;
    public void  CheckEmpAttendance(){
        int checkAttendance =(int)(Math.random()*100)%2;
        if(checkAttendance==Is_Present){
            System.out.println("Employee is present");

        }else{
            System.out.println("Employee is absent");
        }

    }

    public static void main(String[] args) {
        CheckAttendance obj = new CheckAttendance();
        obj.CheckEmpAttendance();




    }
}
