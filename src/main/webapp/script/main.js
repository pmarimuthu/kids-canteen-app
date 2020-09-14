const app = Vue.createApp({
    data() {
        return {
            allMenuItems: null
        }
    },
    methods: {
    },
    mounted() {        
        console.log('mounted.');
        axios
            .get('http://localhost:8080/menu/get')
            .then(
                function(response) {
                    console.log('the response: ', response.data);
                    this.allMenuItems = response.data;
                }
            )
      },      
})
