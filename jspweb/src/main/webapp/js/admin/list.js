
//1.모든 제품 호출 메소드
getproduct();
function getproduct() {
	$.ajax({
		url: "/jspweb/admin/regist",
		type: "get",
		success: function(re) {
			let json = JSON.parse(re)
			let html ='';
			for(let i=0;i<json.length;i++){
				let list = json[i];
				html +=
				'<tr>'+
				'<th><img alt="" src="/jspweb/admin/pimg/'+list.pimg+'"></th>'+
				'<th>'+list.pno+'</th>'+
				'<th>'+list.pcno+'</th>'+
				'<th>'+list.pname+'</th>'+
				'<th>'+list.pprice+'</th>'+
				'<th>'+list.pdiscount+'</th>'+
				'<th>'+list.pprice*list.pdiscount+'</th>'+
				'<th>'+list.pactive+'</th>'+
				'<th>'+list.pdate+'</th>'+
				'</tr>';
			}
		document.querySelector('.table').innerHTML+=html;	
		}
	})
}