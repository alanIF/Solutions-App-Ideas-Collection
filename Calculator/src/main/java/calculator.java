/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class calculator {
    public double soma(double a, double b){
        return a+b;
    }
    public double subtracao(double a , double b){
        return a-b;
    }
    public double multiplicacao(double a , double b){
        return a*b;
    }
    public double divisao(double a, double b){
        if(b!=0){
                return a/b;
        }
        return 0;
    }
    
}
