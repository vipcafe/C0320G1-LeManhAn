package B1.NgonNguLapTrinhTrongJava.ThucHanh.BMI;

import java.util.Scanner;

public class BMI {

    public static void BMI() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập cân nặng : ");
        double weight = input.nextDouble();
        System.out.println("Nhập chiều cao : ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        if(bmi < 18.5){
            System.out.println("BMI = "+bmi+"\nUnderweight");
        }
        else if(bmi<25){
            System.out.println("BMI = "+bmi+"\nNormal");
        }
        else if(bmi<30){
            System.out.println("BMI = "+bmi+"\nOverweight");
        }
        else {
            System.out.println("BMI = "+bmi+"\nObese");
        }
    }

    public static void main(String[] args) {
        BMI();
    }

}
