class Fraction{
    int num1;
    int den1;
    Fraction(int num1,int den1){
      this.num1 = num1;
      this.den1 = den1;
    }
    public void simplify(){
       if(num1<den1){
        if(den1%num1 ==0){
            den1 = den1/num1;
            num1 = 1;
        }
       }
    }
}
public class oppmFunctio {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(7,21);
        f1.simplify();
        System.out.println(f1.num1 +" "+ f1.den1);
    }
}
