var app = new Vue({
    el: '#app',
    data: {
     services:[]
  
    },created(){
        this.getServices()
    },
     methods:{
         getServices(){
             axios.get("/api/services")
             .then((response)=>{
                 this.services = response.data
             })
         }
     }   })