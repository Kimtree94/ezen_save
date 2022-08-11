// p.204
function sumAll(a,b){
	//sumAll 이라는 이름으로 함수명 선언, 매개변수 a , b 2개
		// 매개변수 : 외부에서 함수 호출시 들어오는 값[데이터]
	let output = 0 //변수 [사용목적 : 누적값 저장]
	for( let i =a; i<=b ;i++){
		//i는 a부터 b까지 1씩증가 반복처리	
		output+=i //vs output = output + i
	} // for end
	return output //output 리턴한다 [함수를 호출했던위치로]
}

console.log(`1부터 100까지의합 : ${sumAll(1 ,100 )}`)
console.log(`1부터 500까지의합 : ${sumAll(1 ,500 )}`)

//계산하기 버튼을 눌렀을때 함수
function 계산버튼함수(){
	alert('버튼눌림 성공')
	let snumber=Number( document.getElementById('sinput').value)
	let eunmber =Number( document.getElementById('einput').value)
	//eunm -> 미리 만들어진 단어 [키워드] 함수
	let result = sumAll(snumber,eunmber)
	document.getElementById('resultbox').innerHTML ='계산 결과 :' + result
}
