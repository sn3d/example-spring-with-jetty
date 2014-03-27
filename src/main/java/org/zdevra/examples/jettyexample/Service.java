package org.zdevra.examples.jettyexample;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.zdevra.examples.jettyexample.ws.User;
import org.zdevra.examples.jettyexample.ws.UserResp;

@MessageEndpoint
public class Service {
	@ServiceActivator
	public UserResp process(User user) {
		UserResp resp = new UserResp();
		resp.setMsg("Hello " + user.getName());
		return resp;
	}
}
