package com.company;

public class Ex423 {
    private int fLargest = 0, sLargest = 0;
    public void enterNumber(int x){
        if(x > fLargest){
            sLargest = fLargest;
            fLargest = x;
        }else if(x > sLargest){
            sLargest = x;
        }
    }
    public int getFirstLargest(){
        return fLargest;
    }
    public int getSecondLargest(){
        return sLargest;
    }
}

