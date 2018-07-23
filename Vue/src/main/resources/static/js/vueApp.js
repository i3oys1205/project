
var app = new Vue({
  el: '#app',
  data: {
    message: '안녕하세요 Vue!'
  },
  methods :{
	  msg_dynamic_1 : function(){
		  this.message = '안녕하세요 Vue!' + Math.random(1*100);
	  }
  }  
})

var app2 = new Vue({
	el: '#app-2',
	data: {
		message: '이 페이지는 ' + new Date() + ' 에 로드 되었습니다'
	}
})


Vue.component('todo-item', {
	  props: ['todo'],
	  template: '<li>{{ todo.text }}</li>'
	}) 

	var app7 = new Vue({
	  el: '#app-7',
	  data: {
	    groceryList: [
	      { id: 0, text: 'Vegetables' },
	      { id: 1, text: 'Cheese' },
	      { id: 2, text: 'Whatever else humans are supposed to eat' }
	    ]
	  }
})



console.log("");