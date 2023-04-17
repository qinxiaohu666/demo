package com.example.demo;

public class mySinger {
private static volatile mySinger intance;
    private mySinger(){}

public static mySinger getMySinger(){

if(intance==null){

        synchronized (mySinger.class){
            if (intance == null) {
                intance= new mySinger();
            }
    }
}
return intance;



}








}
