package session2;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte age = 20;
        age =35;
        System.out.println("age is: "+age);
        short s = 200;
        int eWallet = 300;
        long phonenumber = 6303232605L;
        int num1= 200;
        long num2= num1;//UPCASTING
        int num3= (int)num2; //DOWNCASTING
        //int num3 = num2; //error bcoz we are copying 64 bits into 32 bits
        
        //floating points
        float percentage = 79.7F;// f in he end will make literal to 32 bits
        double pi =3.14; //ok this is 64 bits
        
        //Downcasting
        percentage = (float)pi;
        
        char ch = 65;
        ch = 'Z';
        System.out.println("ch is :"+ch);
        
     }

}
