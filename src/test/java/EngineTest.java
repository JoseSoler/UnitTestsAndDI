import com.jlsoler.Engine;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jlsoler on 2/15/2016.
 */
public class EngineTest {

    private Engine engine = new Engine(); //Subject (Object) Under Test

    @Test
    public void shouldChangeToON(){
        engine.startEngine();
        Assert.assertEquals(Engine.STATES.ON, engine.getMode());
    }

    @Test
    public void shouldChangeToOFF(){
        engine.startEngine();
        engine.stopEngine();
        Assert.assertEquals(Engine.STATES.OFF, engine.getMode());
    }

    @Test
    public void shouldChangeToSAVING(){
        engine.startEngine();
        engine.saveFuel();
        Assert.assertEquals(Engine.STATES.SAVING, engine.getMode());
    }

    @Test
    public void shouldChangeToFULL(){
        engine.startEngine();
        engine.fullPerformance();
        Assert.assertEquals(Engine.STATES.FULL, engine.getMode());
    }


}
