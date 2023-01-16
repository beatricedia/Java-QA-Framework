package hooks;
import cucumber.api.java.After;
import cucumber.api.java.Before;


import utils.Context;
public class MainHooks {

//    Context context;
//
//    public MainHooks(Context context) {
//        this.context = context;
//    }


    @Before
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
//        driverBase.tearDown();
//        webDriver.quit();
    }
}
