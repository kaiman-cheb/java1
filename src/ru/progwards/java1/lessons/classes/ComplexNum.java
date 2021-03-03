package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
           }
           public int getA(){
        return a;
           }
    public int getB(){
        return b;
    }
    public String toString(){
        return a + "+" + b + "i";
    }
           public ComplexNum add(ComplexNum num){
               {
                   return new ComplexNum(a + num.getA(), b + num.getB());
               }
    }
    public ComplexNum sub(ComplexNum num){
        {
            return new ComplexNum(a - num.getA(), b - num.getB());
        }
    }
    public ComplexNum mul(ComplexNum num){
        {
            return new ComplexNum(a * num.getA()-b*num.getB(), b * num.getA()+a*num.getB());
        }
    }
    public ComplexNum div(ComplexNum num){
        {
            return new ComplexNum((a * num.getA()+b*num.getB())/(num.getA()*num.getA()+num.getB()*num.getB()),
                    (b * num.getA()-a* num.getB())/(num.getA()* num.getA()+ num.getB()* num.getB()));
        }
    }
    public static void main(String[] args) {
        ComplexNum z = new ComplexNum( 1, 56);
        System.out.println(z);
        ComplexNum z1 = new ComplexNum( 2, 6);
        System.out.println(z1);
        ComplexNum x = new ComplexNum(1, 1);
        ComplexNum num = new ComplexNum(1, 1);

        System.out.println("add : " + x.add(num));
        System.out.println("sub : " + x.sub(num));
        System.out.println("mul : " + x.mul(num));
        System.out.println("div : " + x.div(num));
    }
    }