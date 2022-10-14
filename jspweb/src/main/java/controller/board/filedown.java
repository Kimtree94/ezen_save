package controller.board;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class filedown
 */
@WebServlet("/board/filedown")
public class filedown extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public filedown() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//--업로드 된 파일 다운로드 --
		//1. 다운로드 할 파일명 요청 
		request.setCharacterEncoding("UTF-8");	//한글인코딩
		String bfile = request.getParameter("bfile");			//다운로드할 파일명 요청
	
		//2. 업로드된 경로+파일명으로 해당 파일 위치 찾기 
		String uploadpath = "C:\\Users\\504\\git\\ezen_save\\jspweb\\src\\main\\webapp\\upload\\"+bfile;
		//3. 해당 경로의 파일을 객체화 [ java에서 지원하는 file.class]
		File file = new File(uploadpath); // 해당 경로에 존재하는 파일을 객체화 불러오기 [ 해당 파일을 조작/메소드 ]
		
		//4. HTTP 에서 지원하는 다운로드형식 메소드 [ response ] 
		response.setHeader("Content-Disposition","attachment;filename="+URLEncoder.encode(bfile,"UTF-8"));
					//				1						2					3	
					//1 = 다운로드 형식 HTML에서 지원 [ 브라우저 마다 차이가 있음 ]
					//2 = 다운로드시 명시된 파일명 
					//3 = URL 경로에 한글이 있을경우 :URLEncoder.encode(데이터,"인코딩타입")
		//5. 파일 전송 [외부와 데이터 통신(스트림) = 바이트]
			//1.[입력 스트림 객체 생성] 파일의 내용물을 바이트로 모두 읽어온다.
		BufferedInputStream fin = new BufferedInputStream(new FileInputStream(file));
		
			//2.파일의 바이트 길이만큼 배열선언 	/ file.length()	: 해당 파일의 바이트길이 메소드
		byte[] bytes = new byte[(int)file.length()];
		
			//3.파일의 내용[바이트] 읽어오기 
		fin.read(bytes);//읽어온 바이트를 바이트배열에 저장 
		//**읽어온 바이트 배열을 출력한다
			//4.출력스트림 객체 생성 // http로 출력하기 위한 response.getOutputStream();
		BufferedOutputStream fout = new BufferedOutputStream(response.getOutputStream());
			//5. 배열에 존재하는 바이트 출력  (실제출력)
		fout.write(bytes);//바이트배열에 저장된 바이트를 모두 내보내기 
		
			//스트림은 버퍼 ( 전송시 사용되는 임시 메모리 공간 = 대용량에서 꼭 모두 전송후 초기화 )
		fout.flush();  	// 출력 스트림 버퍼 초기화
		fin.close();	//입력 스트림 닫기 = 용량이 크다보니 오류가 생길수 있어서
		fout.close();	//출력 스트림 닫기 = close 하면 버퍼 초기화 됨 
		
		/*
		 * [ 1~3 ]
		 업로드된폴더 [ 윈도우 ] ======스트림 [ 바이트 ]=====> 자바[서버]  =======OutputStream=====> HTTP[웹]
		 
		  	 	파일		   =====input==============> 바이트 배열======================output =======>
		  	 				1.BufferedInputStream 클래스 * 실제 내용물을 바이트로 변환  BufferedOutputStream 클래스
		  	 		객체명.read(배열) 읽어온 바이트를 배열에 저장							객체명.write( 바이트배열 ) 					
		  
		  */
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
