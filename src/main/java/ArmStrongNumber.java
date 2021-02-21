import java.util.Map;

public class ArmStrongNumber {


    public static boolean isArmStrong(int num){


        if(num<0){
            throw new RuntimeException("Number is negative");
        }
        int count=getCount(num);
        int sum=0;
        int originalDigit=num;
        while(num!=0){
            int rem=num%10;
            num=num/10;
            sum=sum+(int) Math.pow(rem,count);

        }
        System.out.println("original number"+originalDigit);
        System.out.println("arm strong number"+sum);

        return originalDigit==sum;

    }

    public static int getCount(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isArmStrong(153));
    }
}
