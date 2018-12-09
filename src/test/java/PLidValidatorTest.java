import org.junit.Before;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import validators.PLidValidator;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(JUnitParamsRunner.class)
public class PLidValidatorTest {

    PLidValidator plValid;
    @Before
    public void setUp(){
        plValid= new PLidValidator();
    }
    @Test
    @Parameters({"ABA300000",
                "ANF104050",
                "CAB803709",
                "aba300000"})
    public void testIDNumberisValid(String idNumber){
        assertTrue(plValid.validate(idNumber));
    }
    @Test
    @Parameters(method = "invalidNumbers" )
    public void testIDNumberisNotValid(String idNumber){
        assertFalse(plValid.validate(idNumber));
    }
    private Object [][] invalidNumbers(){
        return new Object[][]{
                {"AGD017050"},
                {"123456789"},
                {"HDI563018"},
                {"ABA300200"},
                {"ABCDUKSL"}
        };
    }
}
