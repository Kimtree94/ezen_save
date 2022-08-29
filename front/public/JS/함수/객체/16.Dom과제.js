
/*
1.상수에 html의 id값의 목록들을 가져와 저장한다 querySelector를 사용하여 특정 아이디의 html태그를 호출
2.수정이 가능한 변수에 리셋을 할수있도록 초기값0을 넣어준다??
3.사용할 함수를 선언하고 trim함수를 사용해 문자열의 좌우 공백을 제거한다
4.return값을 주어 공백이  입력되면 리턴하여 다시 그 함수를 실행한다 공백값이 아니면 함수를 종료한다
5.상수를 만들고 HTMl에 요소들을 추가해준다
6.앞서 선언했던 keyCount의 값을 key라는 상수에 저장한다? 
7.목록이 추가될때 keyCount는 한개씩 증가한다.
8.setAttribute,appendChild를 사용하여 html을 저장 및 추가한것에 속성값을 넣어줍니다.
9.checkbox에 checkbox라는 속성을 넣어주고 그 값이 변할때마다 중간선을 그어주는 이벤트를 추가합니다.
10.text.textContent = input.value span에 input의 value 값을 넣어줍니다.
11.button에 textContent를 사용해 제거하기 라는 text를 추가합니다.
12.제거하기를 눌렀을때 removeTodo함수를 생성하고
*/

const input=document.querySelector('#todo') //input이라는 상수에 html의 todo를 가져와 저장
const todolist=document.querySelector('#todo_list')//input이라는 상수에 html의 todo list를 가져와 저장
const addButton=document.querySelector('#add_button')//input이라는 상수에 html의 add_button를 가져와 저장

let keyCount = 0 //변수는 수정이 가능하기에 사용함 //배열의 인덱스 번호를 0부터 시작하겠다.

const addTodo = () => { //addTodo함수 시작         //함수 선언 콜백함수라 일회성 함수
if(input.value.trim()===''){//만약에 input상수에 값에 공백을 제거한후에도 공백이면alert를 출력하고 입력이 되지않으면 return한다//문자열 좌우에서 공백을 제거하는 함수 (구글링)
	alert('할 일을 입력해 주세요')//공백이 있으면 alert를 출력한다
	return //만약 공백이 계속 입력되면 리턴하여 다시 함수를 실행한다?
} 

const item = document.createElement('div')//createElement를사용해 html에 div요소 추가
const checkbox = document.createElement('input')//createElement를사용해 html에 input요소 추가
const text = document.createElement('span')//createElement를사용해 html에 span요소 추가
const button = document.createElement('button')//createElement를사용해 html에 button요소 추가

const key =keyCount //앞서 선언했던 keyCount 값을 key에 저장한다
keyCount +=1 //keyCount함수는 1씩 증가한다 //인덱스가 하나씩 증가한다

item.setAttribute('asdasd' ,key) //setAttribute를 사용해 html객체의 속성을 조작합니다//div의 data-key라는 임시속성에 key keycount를 햇던 배열 즉 숫자값으로 받습니다    ?/?
item.appendChild(checkbox)//checkbox라는 상수 input에 checkbox라는 속성을 넣어줍니다
item.appendChild(text)//text 라는 상수 span에 text라는 속성을 넣어줍니다
item.appendChild(button)//button라는 상수 button에 button라는 속성을 넣어줍니다
todolist.appendChild(item) //todo list라는 상수에 item값을 넣어줍니다.

checkbox.type='checkbox' // checkbox라는 input의 속성에는 checkbox를 넣어줍니다.
checkbox.addEventListener('change' ,(event) => { //checkbox에 이벤트를 추가하는데 checkbox가 변할때마다 item의 style에 textDecoration선을 생성합니다.
	item.style.textDecoration
	=event.target.checked ? 'line-through' : ''  //삼항연산자를 사용하여 checkbox에 checked가 되어 변하는 이벤트가 생기면 중간선을 그어줍니다. 
})

text.textContent = input.value //textContent를 사용하여 text즉 span에 input에 valeu값을 넣어줍니다.

button.textContent = '제거하기' //textContent를 사용하여 button에 제거하기라는 text를 추가합니다.
button.addEventListener('click',() =>{//button이라는 요소에 이벤트를 추가하는데 click 했을때 이벤트를 추가합니다.
	removeTodo(key)	//removeTodo라는 함수를 만들고 const key의 ketcount값으로 이동
})
	input.value ='' //제거를 눌렀을때 그 이동한 카운터값의 순서 (배열의 순서)input의 value를 초기화 합니다.
}//addTodo함수끝 

const removeTodo = (key) => {  //removeTodo가 실행됬을때 asdasd에 들어있는 key값(인덱스 순서)를 차례대로 가져오고 
	const item =document.querySelector(`[asdasd="${key}"]`)
	todolist.removeChild(item)//자식요소인 todolist안 item에 있는 key값을 제거한다 
}

addButton.addEventListener('click',addTodo)//추가하기 버튼에 클릭 이벤트가 발생하면 addTodo함수를 실행합니다.
input.addEventListener('keyup' ,(event)=>{//input에 키업 이벤트를 추가하고
	const ENTER = 13  //const에 ENTER키 =13번 을 저장하고
	if(event.keyCode === ENTER){//만약 keyup의 이벤트에 키코드가 13번 즉 ENTER과 같으면 
		addTodo()//addTodo함수를 실행합니다.
	}
})

























