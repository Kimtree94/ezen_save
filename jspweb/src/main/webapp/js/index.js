getpactive1();
function getpactive1() {

	$.ajax({
		url: "/jspweb/admin/regist",
		data: { "type": 1, "option": "pactive1" },
		success: function(re) {
			let json = JSON.parse(re)
			let html = ''; 
			json.forEach(list => {
				 html += '<div class="item">' +
					'		<a href="#">' +
					'		<img alt="" src="/jspweb/admin/pimg/' + list.pimg + '">' +'		</a>'+
					'		<div class="item_info">' +
					'		<div class="item_title">' +list.pname+'</div>'+
					'		<div class="itme_size">[ FREE ]</div>' +
					'		<div class="item_price">'+list.pprice+'</div>' +
					'		<div>' +
						'	<span class="item_discount">'+list.pdiscount*100+'%</span>' +
					'		<span class="item_sals">'+(list.pprice*(1-list.pdiscount)).toLocaleString('ko-KR')+'원</span> '+
					'		</div>' +
					'		<div class="item_review"> 찜수35 리뷰수 222</div>' +
					'		</div>' +
					'		<div>' +
					'		<span class="badge rounded-pill text-bg-danger">주문폭주</span> <span' +
					'		class="badge rounded-pill text-bg-dark">1+1</span>' +
					'		</div>' +
					'		</div>';

			})
			document.querySelector('.itemlist').innerHTML+=html

		}
	})
}

