package com.ankurmaurya.structural.facade;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

	@Override
	public boolean placeOrder(Product product) {
		 boolean orderFulfilled=false;
	        if(InventoryServiceImpl.isAvailable(product))
	        {
	            System.out.println("Product with ID: "+ product.getProductId()+" is available.");
	            boolean paymentConfirmed= PaymentServiceImpl.makePayment();
	            if(paymentConfirmed){
	                System.out.println("Payment confirmed...");
	                ShippingService.shipProduct(product);
	                System.out.println("Product shipped...");
	                orderFulfilled=true;
	            }
	        }
	        return orderFulfilled;
	}

}
