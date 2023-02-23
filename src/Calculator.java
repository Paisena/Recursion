import java.util.Arrays;

import javax.management.ValueExp;

public class Calculator {
    public Calculator(){

    }

    int[] oddList = new int[0];
    int count = 1;
    boolean oddRecursionStart = false;
    int otherCount = 0;

    public void divideBy3(Float value){
        System.out.println("Value: " + value);
        
        if(value >= 1){
            value /= 3;
            divideBy3(value);
        }
        else if(value < 1){
            System.out.println("dividing done");
            return;
        }
    }

    public void outputOdd(int value){
        System.out.println(value);
        if(!oddRecursionStart){
            oddList = new int[value];
            oddRecursionStart = true;
        }
        if(value > 0){
            oddList[otherCount] = count;
            count += 2;
            value--;
            otherCount++;
            outputOdd(value);
        }
        else{
            System.out.print(Arrays.toString(oddList));
            return;
        }
    }
}
