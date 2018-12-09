package validators;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PLidValidator implements Validator {

    private int[] numberWeights = {7,3,1,9,7,3,1,7,3};

    public boolean validate(String iDNumber){

        iDNumber = iDNumber.toUpperCase();
        Pattern p = Pattern.compile("[A-Z]{3}\\d{6}");
        Matcher m = p.matcher(iDNumber);

        Map <Character,Integer> IDValues = new HashMap<>();
        IDValues.put('A',10);
        IDValues.put('B',11);
        IDValues.put('C',12);
        IDValues.put('D',13);
        IDValues.put('E',14);
        IDValues.put('F',15);
        IDValues.put('G',16);
        IDValues.put('H',17);
        IDValues.put('I',18);
        IDValues.put('J',19);
        IDValues.put('K',20);
        IDValues.put('L',21);
        IDValues.put('M',22);
        IDValues.put('N',23);
        IDValues.put('O',24);
        IDValues.put('P',25);
        IDValues.put('Q',26);
        IDValues.put('R',27);
        IDValues.put('S',28);
        IDValues.put('T',29);
        IDValues.put('U',30);
        IDValues.put('V',31);
        IDValues.put('W',32);
        IDValues.put('X',33);
        IDValues.put('Y',34);
        IDValues.put('Z',35);

        if (m.find()){
            char[] IDNumberArr = iDNumber.toCharArray();
            int firstLetter = IDValues.get(IDNumberArr[0]);
            int secondLetter = IDValues.get(IDNumberArr[1]);
            int thirdLetter = IDValues.get(IDNumberArr[2]);

            int[] IDNumbersIntArray =new int[]{
                    firstLetter, secondLetter, thirdLetter,
                    Character.getNumericValue(IDNumberArr[3]),
                    Character.getNumericValue(IDNumberArr[4]),
                    Character.getNumericValue(IDNumberArr[5]),
                    Character.getNumericValue(IDNumberArr[6]),
                    Character.getNumericValue(IDNumberArr[7]),
                    Character.getNumericValue(IDNumberArr[8]),

            };
            int result=0;
            for (int i = 0; i<IDNumbersIntArray.length;i++){
                int temp = IDNumbersIntArray[i] * numberWeights[i];
                result = result+temp;
            }
//            System.out.println(result);

            if (result %10 == 0){
                System.out.println("ID number " +iDNumber+" is valid.");
            return true;

            }
        }
        System.out.println("ID number " +iDNumber+" is not valid.");
        return false;
    }



}
