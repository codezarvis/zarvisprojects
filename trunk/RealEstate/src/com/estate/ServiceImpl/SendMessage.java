package com.estate.serviceImpl;

import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.smslib.modem.SerialModemGateway;



public class SendMessage {
	
		
		public SendMessage(String mobileNumber, String pid) {
			
			try {
				OutboundNotification outboundNotification = new OutboundNotification();
			
				SerialModemGateway gateway = new SerialModemGateway("send", "COM58",
					115200, "", "");
				gateway.setInbound(true);
				gateway.setOutbound(true);
				gateway.setSmscNumber("+919848001104");

				Service.getInstance().setOutboundMessageNotification(
					outboundNotification);
				Service.getInstance().addGateway(gateway);
				Service.getInstance().startService();

				OutboundMessage message = new OutboundMessage(mobileNumber,"Thanking Your for register your property. This is your id : "+ pid +" Keep This id to know your property status.......");
			
				Service.getInstance().sendMessage(message);
			
				Service.getInstance().stopService();

			} catch(Exception e) {
					e.printStackTrace();
			}
		}
}
