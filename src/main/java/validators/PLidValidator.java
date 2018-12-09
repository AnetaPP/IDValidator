package validators;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PLidValidator implements Validator {

    int[] numberWeights = {7,3,1,9,7,3,1,7,3};

    public boolean validate(String iDNumber){

        Pattern p = Pattern.compile("[A-Za-z]{3}\\d{6}");
        Matcher m = p.matcher(iDNumber);
        if (m.find()){

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

            char[] IDNumberArr = iDNumber.toCharArray();



            return true;
        }



        return false;
    }


}
