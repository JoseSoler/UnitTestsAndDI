import com.jlsoler.Car;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jlsoler on 2/15/2016.
 */
public class CarTest {

    @Test
    public void shouldStartTheCar(){
        //given
        Car myUnderTestCar = new Car();

        //when
        String result = myUnderTestCar.startCar();

        //then
        Assert.assertEquals("Car in mode: ON", result);
    }

    @Test
    public void shouldStopTheCar(){
        //given
        Car myUnderTestCar = new Car();
        myUnderTestCar.startCar();

        //when
        String result = myUnderTestCar.stopCar();

        //then
        Assert.assertEquals("Car in mode: OFF", result);
    }

    @Test
    public void shouldEnterFullPowerMode(){
        //given
        Car myUnderTestCar = new Car();
        myUnderTestCar.startCar();

        //when
        String result = myUnderTestCar.accelerate();

        //then
        Assert.assertEquals("Car operating in: FULL", result);
    }

    @Test
    public void shouldEnterSavingMode(){
        //given
        Car myUnderTestCar = new Car();
        myUnderTestCar.startCar();

        //when
        String result = myUnderTestCar.deccelerate();

        //then
        Assert.assertEquals("Car operating in: SAVING", result);
    }


}
