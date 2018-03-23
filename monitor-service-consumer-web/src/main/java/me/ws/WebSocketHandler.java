package me.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Created by zhenghuasheng on 2016/6/19.
 */
public class WebSocketHandler extends TextWebSocketHandler {
    private List<WebSocketSession> socketSessions = new ArrayList<WebSocketSession>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session){
        socketSessions.add(session);
        try {
			super.afterConnectionEstablished(session);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) {
        sendMessageToUser((TextMessage) message);
    	

    	

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status)  {
        socketSessions.remove(session);
        try {
			super.afterConnectionClosed(session, status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    
    
    public void sendMessageToUser(TextMessage message) {
    	System.out.println(message.getPayload());
        for (WebSocketSession   socketSession : socketSessions){
            if (socketSession.isOpen()) {
                //socketSession.sendMessage(message);n
            	new Thread(new LogRunnable(socketSession)).start();
            }
        }
    }
}
class LogRunnable implements Runnable{
	WebSocketSession session;
	public LogRunnable(WebSocketSession session){
		this.session=session;
	}

	public void run() {
		// TODO Auto-generated method stub
    	Process p=null;
    	BufferedReader bd=null;
    	try {
			p=Runtime.getRuntime().exec("adb logcat -v process");
			bd=new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line="";
			while((line=bd.readLine())!=null){
			   
				System.out.println(line);
				
				session.sendMessage(new TextMessage(line));
				
			}
    		
    	
		} catch (IOException e) {
			// TODO Auto-generated catch block+
			e.printStackTrace();
		}
    	
    	
		
	}
	
}