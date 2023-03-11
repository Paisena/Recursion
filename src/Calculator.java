import java.util.ArrayList;
import java.util.Arrays;

import javax.management.ValueExp;
import javax.print.attribute.standard.RequestingUserName;

public class Calculator {
    public Calculator(){

    }

    ArrayList<Float> divideBy3ArrayList = new ArrayList<>();
    int gcfDivider = 1;
    int gcfValue = 0;
    int[] oddList = new int[0];
    int count = 1;
    boolean oddRecursionStart = false;
    int otherCount = 0;

    public void divideBy3(Float value){
        System.out.println("Value: " + value);
        
            if(value > 1){
                divideBy3ArrayList.add(value);
                value /= 3;

                divideBy3(value);
            }
            else if(value <= 1){
                divideBy3ArrayList.add(value);
                System.out.println("dividing done");
                return;
            }
        System.out.println("divide by 3 returned " + value);
    }

    public int[] outputOdd(int value){
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
        return oddList;
    }

    public int gcf(int value){
        if(value == gcfDivider){
            gcfDivider = 0;
            return gcfValue;
        }
        if(value % gcfDivider == 0){
            gcfValue = gcfDivider;
        }
        
        gcfDivider++;
        gcf(value);
        return gcfValue;
    }

    public ArrayList<Float> getDivideBy3(){
        return divideBy3ArrayList;
    }
}
