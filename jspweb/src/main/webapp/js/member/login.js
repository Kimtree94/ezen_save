

/* HTML 과 서블릿 통신 */

//0. 로그인 버튼을 눌렀을때 [ 여러번 실행 ---> 함수]
//1. 함수정의 [ function 함수명()매개변수 {  }]
//2. HTML 함수 실행 ==> 이벤트
//1. onclick="함수명()"	: 클릭했을때 함수호출


function login() {
	//1.html 입력된 데이터 가져오기 
	//1.document.querySelector('#id').value(값)
	//2.document.getElementById('#id').vlaue
	let mid = document.querySelector('#mid').value
	let mpassword = document.querySelector('#mpassword').value
	let loginconfirmbox = document.querySelector('#loginconfirmbox')
	//2. 변수2개를 서블릿으로 보내기 [form없이][JQUERY : 자바스크립트 라이버리]
	//1. JQEURY 라이브러리 포함 
	//2. Ajax
	//$.ajax({속성명 = 값, 속성명=값 , 속성명=값})
	//url : "통신경로"		:control에 있는 서블릿url을 대체로 넣음 액션에 있는것 
	//data : 전송할 데이터{'키' : 값 , '키2' : 값2}
	//success : function(매개변후){ }
	$.ajax({
		url: "/jspweb/member/login",
		data: { "mid": mid, "mpassword": mpassword },
		success: function(re) {
			alert(re)
			if (re === '1') {
				alert('로그인 성공')
				location.href = '/jspweb/index.jsp';
			}else if(re ==='2'){
				loginconfirmbox.innerHTML ='패스워드가 다릅니다.'
			}else if(re==='3'){
				loginconfirmbox.innerHTML ='데이터베이스 오류[관리자에게 문의]'
			}else if(re==='0'){
				loginconfirmbox.innerHTML ='존재하지 않는 아이디 입니다.'
			}
		}
	});
}






/*---------------------*/