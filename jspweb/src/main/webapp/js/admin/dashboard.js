
//1. 해당 사이드바 태그 호출 
let sidebar=document.querySelector('.sidebar')
let mainbox=document.querySelector('#mainbox')
//2. [사이드바 열기]해당 사이드바 태그를 클릭했을때 이벤트 
sidebar.addEventListener('click' , function(){
	//해당 사이드바 CSS변경 [ left 속성을 0으로 변경]
	sidebar.style.left=0;
})

//3.[사이드바 접기] 본문 div를 클릭했을때 이벤트 
mainbox.addEventListener('click', function(){
	//해당 사이드바 CSS변경 [ left 속성을 -170으로 변경]
	sidebar.style.left='-170px';
})

/////////////본문 전환 이벤트///////////////
function pagechange(page){
	$("#mainbox").load( page )// 특정 태그에 해당 파일 로드 [ jquery ]
}