const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootr0361/",
            name: "springbootr0361",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootr0361/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "论坛管理系统 "
        } 
    }
}
export default base
