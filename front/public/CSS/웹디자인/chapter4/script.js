
 /*chartist.js를 이용한 차트 구현*/
/* 
	변수 = 값
	배열 = [ 값1,값2]
	객체 = {키:값 , 키2:값2}
 */
 //파이차트[원형차트] 데이터 객체 선언
 let pieData = {
	/* 항목의 이름 */
	labels : ['웹디자이너','웹개발자','서버 엔지니어','영업직'], //키 labels 값 웹디자이너 ...
	/* 항목의 값 */
	series : [14 , 9, 8, 6]
};
let pieOptions = {
	with:'100%',
	height:'440px'
};

/*차트 적용하기 : new Chartist.Pie('표시할식별자' ,데이터객체 , 옵션객체)*/
//Chartist.Pie 클래스
new Chartist.Pie('.pie_chart',pieData,pieOptions)

/* 막대차트 */
let barData = {
	labels : ['2018년','2019년','2020년'],
	series : [[10 , 16 , 29]]
}

let barOptions ={
	axisY : {         /*객체명 = {키 :{ } } */
		offset : 60,							   //1.
		scaleMinSpace:50,						   //2.선 간격[px]
		labelInterpolationFnc:function(value){     //3.Y축 눈금 표시
			return value + '명'
		}
	
	},
	width :'100%',
	height : '400px'
};
//new 클래스명 
new Chartist.Bar('.bar_chart', barData, barOptions);

/*급여등록*/
let barData2 = {
	/* 항목 */
	labels : [],
	/* 값 */
	series : [[] ,[]]				//배열=[ ]//배열 [[] ,[] ,[] ,[]]
}

let barOptions2 ={
	axisY : {         /*객체명 = {키 :{ } } */
		offset : 60,							   //1.
		scaleMinSpace:50,						   //2.선 간격[px]
		labelInterpolationFnc:function(value){     //3.Y축 눈금 표시
			return value + '명'
		}
	
	},
	width :'100%',
	height : '400px'
}
function add(){
	/* 막대차트 */
const name = document.getElementById('name').value
const money = document.getElementById('money').value
const money2 = document.getElementById('money2').value
barData2.labels.push(name)
barData2.series[0].push(money)
barData2.series[1].push(money2)
//new 클래스명 
new Chartist.Bar('.bar_chart2', barData2, barOptions2);
		
}


/*
1. 등록 버튼을 클릭한다
2.클릭 이벤트,[사건=행동]발생[onclick addEventListener]
3. 반복적인 사건[행동 ]-->함수[메소드]
	*함수호출 : 함수명()
	*함수정의 : function함수명(){}
---------------테스트한다---------------
4.차트그리기[앞전 코드 복사 - 식별자만 변경]
5.html 입력된 데이터 -> js이동
	document.getElementById
 */
























