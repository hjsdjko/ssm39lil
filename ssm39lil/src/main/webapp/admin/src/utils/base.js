const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm39lil/",
            name: "ssm39lil",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm39lil/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "体育资讯软件小程序"
        } 
    }
}
export default base
