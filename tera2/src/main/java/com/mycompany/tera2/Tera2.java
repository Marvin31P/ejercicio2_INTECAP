
package com.mycompany.tera2;

import java.util.Scanner;


public class Tera2 {

    public static void main(String[] args) {
         Scanner sp = new Scanner (System.in);
        System.out.println("======ejercicio 1======");
        System.out.println("ingrese primer numero  " );
        int num1 = sp.nextInt();
        System.out.println("ingrese segundo numero");
        int num2 = sp.nextInt();
        if (num1 == num2){
            System.out.println("son iguales ");
        }else if (num1 != num2){
            System.out.println("no son iguales ");
        }
        System.out.println("======ejercicio 2======");
        System.out.println("ingrese un numero");
        int num3 = sp.nextInt();
        if (num3 < 0){
            System.out.println("es negativo");
        }else if (num3 > 0){
            System.out.println("es positivo");
        }
        System.out.println("======ejercicio 3======");
        System.out.println("ingrese un numero");
        int num4 = sp.nextInt();
        System.out.println("ingrese segundo numero");
        int num5 = sp.nextInt();
        if (num4 > num5){
         System.out.println(num4 +" "+ num5);   
        }else if (num5 > num4){
            System.out.println(num5 + "," + num4);
        }
        System.out.println("======ejercicio 4======");
        System.out.println("ingerese un  numero");
        int num6 = sp.nextInt();
        System.out.println("ingrese segundo numero");
        int num7 = sp.nextInt();
        System.out.println("ingrese tercer numero ");
        int num8 = sp.nextInt();
        if ((num6 > num7 )&& (num7 > num8) ){
            System.out.println(num6 + "," + num7 + "," + num8 );  
        }else if ((num8 > num7) && (num7 > num6)){
            System.out.println(num8 + "," + num7 + "," + num6);
        }else if ((num7 > num6) && (num6 > num8)){
            System.out.println(num7 + "," + num6 + "," + num8);  
        }else if ((num6 > num8) && (num8 > num7)){
            System.out.println(num6 + "," + num8 + "," + num7); 
        }
        System.out.println("====== ejercicio 5 ======");  
        System.out.println("ingrese fecha solo numeros  ");
        int dia = sp.nextInt();
        int mes = sp.nextInt();
        int año = sp.nextInt();
        if ((dia <0) || (dia >31)){
            System.out.println("dia no valido");
        }else if ((mes < 0) || (mes > 12)){
            System.out.println("mes incorecto");
        }else if (año < 0){
            System.out.println("año incorecto");
         
        }else if ((dia >0) || (dia <31) && (mes > 0) || (mes < 12) && (año > 0)){
            System.out.println("fecha corecta");
        }
    }
}
