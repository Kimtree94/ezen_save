package controller.board;

import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.Hashtable;

import javax.websocket.*;


//@WebServlet("/board/chatting")	// 서블릿 URL 만들기 
@ServerEndpoint("/chatting/{mid}")	 	// 웹서버에 웹소켓 URL 만들기  URL/{변수명}
public class chatting{	// 키[ set=증복불가 ] : 값 ---> 엔트리 [ 모든 키호출 : clients.keySet() / 값 호출 : clients
	
	// 서버소켓에 들어온 클라이언트소켓 명단 ( 세션 ) Vector ---> hashtable 변경한 이유는 [ 2개 저장할려고 ]
			//arraylist VS Vector [ 동기화 x VS 동기화 o ] 
	public static Hashtable<Session , String> clients = new Hashtable<>();
	
	//*알람 html 구성함수
	public JSONObject jsonAlarm(String content) throws IOException {
		JSONObject object = new JSONObject();
		object.put("type", "alarm");
		object.put("content", content);
		return object;
	}
	//* 알람 전송함수 
	public void sendmsg(JSONObject object)throws IOException{
		//현재 접속한 모든 세션에게 메시지 전송 
		//접속했다고 다른 사람에게 알리기 
		for(Session s : clients.keySet()) {//map에 저장된 모든 key[ 모든 접속된 클라이언트소켓 세션 ] 호출 [.keySet() ]
			s.getBasicRemote().sendText(object.toString());
			}									//map.get(키) --> 값 호출 [ mid 호출 ]

	}
							
	@OnOpen 	// 서버소켓이 들어왔을때 [ Session = 클라이언트 소켓 = 접속된 유저 ]
	public void onOpen( Session session , @PathParam("mid")String mid) throws IOException { // @PathParam(경로상의 변수명) : 경로상의 변수호출
		sendmsg(jsonAlarm(mid+"님이 들어왔습니다."));
		clients.put(session , mid); // 서버소켓에서 해당     세션 저장하기 
		////////////////////////////////////////////////////
	}
	@OnClose	// 서버소켓을 나갔을때 [ 서버소켓[ 서버가 재부팅/시작 ] 다 꺼지거나 클라이언트소켓이 닫기를 요청했을때 ]
	public void onClose(Session session) throws IOException {
		////////////////나갔을때 알림 메시지///////////////////
		JSONObject object= jsonAlarm(clients.get(session) +"님이 퇴장했습니다.");
			clients.remove(session); // map객체명.remove(key) : 해당 key의 엔트리 삭제 
		sendmsg(object);
	}
	@OnMessage	// 서버소켓에 메시지 왔을때 
	public void onMessage(Session session , String msg) throws IOException {
		for(Session s : clients.keySet()) {	//접속된 클라이언트 소켓을 하나씩 호출 
			s.getBasicRemote().sendText(msg);
		}
	
	}
	
}

