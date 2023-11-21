package org.example;

public class ArithmeticProgression {
    public int progression(int n){
        if(n==0){
            throw new IllegalArgumentException();
        }
        int result = 0;
        for(int i = 0;i<n;i++){
            result+=i+1;
        }
        return result;
    }
}
