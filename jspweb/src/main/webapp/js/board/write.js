
function bwrite(){
	
	let inputs = document.querySelectorAll('input')
	
	console.log(inputs)
	let data={
		btitle : inputs[1].value,
		bcontent : inputs[2].value
	}
	
	console.log(data)
	
	
	$.ajax({
		url : "/jspweb/board/write",
		data : data,
		success : function(re){
		if(re==='true'){alert('글등록성공');location.href="list.jsp"}	
		else{alert('글등록실패')}	
			}
	});
	
	
	
}
/* let 객체 = { 속성명 : 데이터 , 속성명 : 데이터 ~~ } */