package com.company;
import java.util.Scanner;
public class Ex421 {
    int largest = 0;

    public void enterNumber(int x){
        largest = Math.max(x, largest);
    }
    public int getLargestNumber(){
        return largest;
    }
}
