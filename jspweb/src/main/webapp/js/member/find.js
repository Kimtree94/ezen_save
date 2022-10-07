/*----------아이디찾기-------------- */
function findid() {
	//1. 해당 id의 input value 와 div 호출
	let mname = document.querySelector("#mname").value
	let memail = document.querySelector("#memail").value
	let findidconfirmbox = document.querySelector("#findidconfirmbox");
	
	$.ajax({
		url : "/jspweb/member/findid",
		data :{"mname":mname,"memail":memail},
		success : function(result){
			if(result!=='null'){
				findidconfirmbox.innerHTML=' 회원 아이디:'+result
			}else{
				findidconfirmbox.innerHTML='동일한 회원정보가 없습니다.  '
			}
		}	
		
	});
	//2. 서블릿에게 데이터 보내기[기본값 : get메소드]
	$.ajax({
		url: "/jspweb/member/findid", //통신 경로 : 서블릿URL
		data: { "mname": mname, "memail": memail }, //보낼 데이터 : { "키1" : 값1 ,"키2" : 값2}
		success: function(re) {
			if (re !== 'null') {
				findidconfirmbox.innerHTML = '회원 아이디 :' + re
			} else {
				findidconfirmbox.innerHTML = '동일한 회원정보가 없습니다.'
			}
		}
	});


}

/*-------------비번찾기------------ */
function findpassword() {
	let mid = document.querySelector("#mid").value
	let memail = document.querySelector("#memail").value
	let resultbox = document.querySelector("#findpasswordconfirmbox");

	$.ajax({
		url: "/jspweb/member/findpassword",
		data: { "mid": mid, "memail": memail },
		success: function(result) {
			if (result == '') {
				resultbox.innerHTML = '동일한 회원정보가 없습니다.'
			} else {
				resultbox.innerHTML = '임시비밀번호' + result;
			}

		}



	})
}