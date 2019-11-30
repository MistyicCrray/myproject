package tools;

import java.util.ArrayList;
import java.util.Collection;

import javax.websocket.server.ServerEndpointConfig.Configurator;

import User.User;

public class GetHttpSessionConfigurator extends Configurator {
//	@Override
//	public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
//		HttpSession httpSession = (HttpSession) request.getHttpSession();
//		sec.getUserProperties().put(HttpSession.class.getName(), httpSession);
//	}
	public static void main(String[] args) {
		Collection<Integer> user = new ArrayList<>();
		user.add(1);
		user.add(2);
		user.add(3);
		user.add(4);
		user.add(5);
		for (Integer integer : user) {
			System.out.println(integer);
		}
	}
}
