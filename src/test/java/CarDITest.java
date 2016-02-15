import com.jlsoler.CarDI;
import com.jlsoler.Engine;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jlsoler on 2/15/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class CarDITest {

    @Mock
    public Engine mockedEngine; //Car depends on (uses / has a / interacts with) Engine

    public CarDI myUnderTestCar; //We are interested only in Unit testing Car behaviour


    @Test
    public void shouldStartTheCar(){

        //given
        myUnderTestCar = new CarDI(mockedEngine);
        when(mockedEngine.getMode()).thenReturn(Engine.STATES.ON);

        //when
        String result = myUnderTestCar.startCar();

        //then
        verify(mockedEngine).startEngine();
        Assert.assertEquals("Car in mode: ON", result);

    }

    @Test
    public void shouldStopTheCar(){
        //given
        myUnderTestCar = new CarDI(mockedEngine);
        when(mockedEngine.getMode()).thenReturn(Engine.STATES.OFF);

        //when
        myUnderTestCar.startCar();
        String result = myUnderTestCar.stopCar();

        //then
        verify(mockedEngine).stopEngine();
        Assert.assertEquals("Car in mode: OFF", result);
    }

    @Test
    public void shouldEnterFullPowerMode(){
        //given
        myUnderTestCar = new CarDI(mockedEngine);
        when(mockedEngine.getMode()).thenReturn(Engine.STATES.FULL);


        //when
        myUnderTestCar.startCar();
        String result = myUnderTestCar.accelerate();

        //then
        verify(mockedEngine).fullPerformance();
        Assert.assertEquals("Car operating in: FULL", result);
    }

    @Test
    public void shouldEnterSavingMode(){
        //given
        myUnderTestCar = new CarDI(mockedEngine);
        when(mockedEngine.getMode()).thenReturn(Engine.STATES.SAVING);


        //when
        myUnderTestCar.startCar();
        String result = myUnderTestCar.deccelerate();

        //then
        verify(mockedEngine).saveFuel();
        Assert.assertEquals("Car operating in: SAVING", result);
    }

}
