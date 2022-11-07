

// 장바구니 리스트 

//[ 전역변수 ]
let cartlist = null; // 장바구니 리스트 
let totalprice = 0;	// 총 주문금액 

getcart()

let checkbtnlist = document.querySelectorAll('.checkbtn') //1. 모든 체크박스 가져오기

checkbtnlist[0].addEventListener('click', (e) => {
	//1. 첫번째 체크박스에 체크가 되어 있는경우 모든 체크박스에 체크 
	// e.currentTarget : 이벤트를 발생시킨 tag 대상의 이벤트 정보 
	//checked : 속성 [ 체크 여부 ] radio , checkbox
	if (e.currentTarget.checked == true) {
		checkbtnlist.forEach(c => { c.checked = true; })//모든 체크박스에 체크
	}
	// 아니면 모든 체크박스에 체크 제거
	else {
		checkbtnlist.forEach(c => { c.checked = false; })//모든 체크박스에 체크
	}
})

let checkplist=[];
//2. 장바구니에서 체크된 제품만 결제 페이지로 이동 
function payload(){
	checkbtnlist.forEach((c , i)=>{ // forEach((value,index))
		if(i!=0&&c.checked==true){
			//체크가 되어 있는 경우에 
			checkplist.push(cartlist[i-1])
		}
	});
	if(checkplist.length==0){alert('1개이상 선택해주세요');return;}
	localStorage.removeItem('checkplist');//저장소 초기화
	//저장소 생성 [ checkplist 라는 이름으로 checkplist 를 저장]	
	localStorage.setItem('checkplist',JSON.stringify(checkplist));
	location.href='/jspweb/product/pay.jsp';
}


//1.장바구니 정보 호출 
function getcart() {
	$.ajax({
		url: "/jspweb/product/cart",
		type: "get",
		async: false,	//결과가 있을때까지 대기 상태 
		success: function(re) {
			cartlist = JSON.parse(re)
			console.log(cartlist)
			let html = '<tr>'+
							'<th width="5%"><input  type="checkbox" class="checkbtn"></th>'+
							'<th width="10%"> 이미지 </th>'+
							'<th width="40%"> 상품정보 </th>'+
							'<th width="15%"> 수량 </th> '+
							'<th width="15%">가격</th> '+
							'<th width="10%"> 비고 </th> '+
						'</tr>';
			cartlist.forEach(c => {
				console.log(c.pimg)
				html += `<tr>` +
					`<td> <input type="checkbox" class="checkbtn"> </td>` +
					`<td><img width="80%" alt="" src="/jspweb/admin/pimg/${c.pimg}"> </td>` +
					`<td>${c.pname}<br> - ${c.pcolor + "/" + c.psize} </td>` +
					`<td>${c.amount}</td>` +
					`<td>${c.amount * (c.pprice - (c.pprice * c.pdiscount))}</td>` +
					`<td><button> 삭제 </button></td>` +
					`</tr>`;
				totalprice += c.amount * (c.pprice - (c.pprice * c.pdiscount));
			})
			document.querySelector('.cart_t').innerHTML = html
		}
	})
}



