const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot3cprm/",
            name: "springboot3cprm",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot3cprm/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "体育场馆管理系统"
        } 
    }
}
export default base
