package com.ankurmaurya.behavioral.state;

public class InTransition implements PackageState {

    private static InTransition instance = new InTransition();
 
    private InTransition() {}
 
    public static InTransition instance() {
        return instance;
    }
     
    @Override
    public void updateState(DeliveryContext ctx) 
    {
        System.out.println("Package(" + ctx.getPackageId() + ") is In-Transition.");
        ctx.setCurrentState(OutForDelivery.instance());
    }

}
