new Vue({
    el:'#listdiv',
    data:{
        list:[],
        pageNum:1,
        pageSize:3,
        pageInfo:{},
        lnTrainee:{}
    },
    methods:{
        paging:function(pageNum){
            if (pageNum==0){
                pageNum=1;
            }
            this.pageNum=pageNum;
            this.findAll();
        },
        findAll:function(){
            var _this=this;
            axios.post('../trainee/findAll?pageNum='+this.pageNum+'&pageSize='+this.pageSize,_this.lnTrainee).then(function (response) {
                _this.list=response.data.list;
                _this.pageNum=response.data.pageNum;
                _this.pageInfo=response.data;

            });
        },

    },
    created:function () {
        this.findAll();
    },
});