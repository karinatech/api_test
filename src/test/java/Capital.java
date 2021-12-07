
import org.junit.Assert;
import org.junit.Test;

public class Capital {
    @Test
    public void happyPath(){
        Api_interview api = new Api_interview();
        String capital = api.getCapital("col");
        Assert.assertEquals("[\"Bogotá\"]", capital);
    }

    @Test
    public void negative_test(){
        Api_interview api = new Api_interview();
        String capital = api.getCapital("rus");
        Assert.assertFalse("[\"Lima\"]".equalsIgnoreCase(capital));

    }
}
