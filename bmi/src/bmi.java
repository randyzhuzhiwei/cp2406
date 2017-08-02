
import java.math.BigDecimal;
import java.util.Scanner;

public class bmi {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("========== BMI Calculator ==========");
        System.out.println("====================================");

        System.out.println("Height(m):");
        float h=in.nextFloat();
        System.out.println("Weight(kg):");
        float w =in.nextFloat();

        float bmi=w/(h*h);

        System.out.println("BMI:"+ round(bmi,2));

        if(bmi<15)
            System.out.println("Underweight");
        if(bmi<25)
            System.out.println("Normal weight");
        else
            System.out.println("Overweight");

    }
    private static float round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

}
