
var projectName = '体育场馆管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '场地信息',
	url: './pages/changdixinxi/list.html'
}, 
{
	name: '体育器材',
	url: './pages/tiyuqicai/list.html'
}, 
{
	name: '通知公告',
	url: './pages/tongzhigonggao/list.html'
}, 
{
	name: '私人教练',
	url: './pages/sirenjiaolian/list.html'
}, 

{
	name: '体育资讯',
	url: './pages/news/list.html'
},
{
	name: '用户投诉',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springboot3cprm/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"会员","menuJump":"列表","tableName":"huiyuan"}],"menu":"会员管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["新增","查看","修改","删除"],"menu":"健身教练","menuJump":"列表","tableName":"jianshenjiaolian"}],"menu":"健身教练管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"场地类型","menuJump":"列表","tableName":"changdileixing"}],"menu":"场地类型管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","查看评论","用户预约","会员预约"],"menu":"场地信息","menuJump":"列表","tableName":"changdixinxi"}],"menu":"场地信息管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","修改","删除","退订","支付"],"menu":"场地预约","menuJump":"列表","tableName":"changdiyuyue"}],"menu":"场地预约管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","删除","审核"],"menu":"退订场地","menuJump":"列表","tableName":"tuidingchangdi"}],"menu":"退订场地管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","修改","删除","会员退订","支付"],"menu":"会员预约","menuJump":"列表","tableName":"huiyuanyuyue"}],"menu":"会员预约管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","修改","删除","审核"],"menu":"会员退订","menuJump":"列表","tableName":"huiyuantuiding"}],"menu":"会员退订管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除"],"menu":"器材类型","menuJump":"列表","tableName":"qicaileixing"}],"menu":"器材类型管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除","查看评论","会员购买","器材购买"],"menu":"体育器材","menuJump":"列表","tableName":"tiyuqicai"}],"menu":"体育器材管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改","删除","支付","退款"],"menu":"会员购买","menuJump":"列表","tableName":"huiyuangoumai"}],"menu":"会员购买管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","修改","删除","审核"],"menu":"会员退款","menuJump":"列表","tableName":"huiyuantuikuan"}],"menu":"会员退款管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除","支付","退订"],"menu":"器材购买","menuJump":"列表","tableName":"qicaigoumai"}],"menu":"器材购买管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","修改","删除","审核"],"menu":"器材退订","menuJump":"列表","tableName":"qicaituiding"}],"menu":"器材退订管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"通知公告","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除","查看评论","私教预约"],"menu":"私人教练","menuJump":"列表","tableName":"sirenjiaolian"}],"menu":"私人教练管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除","审核","支付"],"menu":"私教预约","menuJump":"列表","tableName":"sijiaoyuyue"}],"menu":"私教预约管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"会员等级","menuJump":"列表","tableName":"huiyuandengji"}],"menu":"会员等级管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"体育资讯","tableName":"news"},{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","查看评论","用户预约","会员预约"],"menu":"场地信息列表","menuJump":"列表","tableName":"changdixinxi"}],"menu":"场地信息模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","查看评论","会员购买","器材购买"],"menu":"体育器材列表","menuJump":"列表","tableName":"tiyuqicai"}],"menu":"体育器材模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"通知公告列表","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","查看评论","私教预约"],"menu":"私人教练列表","menuJump":"列表","tableName":"sirenjiaolian"}],"menu":"私人教练模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","删除","退订","支付"],"menu":"场地预约","menuJump":"列表","tableName":"changdiyuyue"}],"menu":"场地预约管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","删除"],"menu":"退订场地","menuJump":"列表","tableName":"tuidingchangdi"}],"menu":"退订场地管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除","支付","退订"],"menu":"器材购买","menuJump":"列表","tableName":"qicaigoumai"}],"menu":"器材购买管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","删除"],"menu":"器材退订","menuJump":"列表","tableName":"qicaituiding"}],"menu":"器材退订管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","查看评论","用户预约","会员预约"],"menu":"场地信息列表","menuJump":"列表","tableName":"changdixinxi"}],"menu":"场地信息模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","查看评论","会员购买","器材购买"],"menu":"体育器材列表","menuJump":"列表","tableName":"tiyuqicai"}],"menu":"体育器材模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"通知公告列表","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","查看评论","私教预约"],"menu":"私人教练列表","menuJump":"列表","tableName":"sirenjiaolian"}],"menu":"私人教练模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","删除","支付","会员退订"],"menu":"会员预约","menuJump":"列表","tableName":"huiyuanyuyue"}],"menu":"会员预约管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","删除"],"menu":"会员退订","menuJump":"列表","tableName":"huiyuantuiding"}],"menu":"会员退订管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","删除","支付","退款"],"menu":"会员购买","menuJump":"列表","tableName":"huiyuangoumai"}],"menu":"会员购买管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","删除"],"menu":"会员退款","menuJump":"列表","tableName":"huiyuantuikuan"}],"menu":"会员退款管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","删除"],"menu":"私教预约","menuJump":"列表","tableName":"sijiaoyuyue"}],"menu":"私教预约管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","查看评论","用户预约","会员预约"],"menu":"场地信息列表","menuJump":"列表","tableName":"changdixinxi"}],"menu":"场地信息模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","查看评论","会员购买","器材购买"],"menu":"体育器材列表","menuJump":"列表","tableName":"tiyuqicai"}],"menu":"体育器材模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"通知公告列表","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","查看评论","私教预约"],"menu":"私人教练列表","menuJump":"列表","tableName":"sirenjiaolian"}],"menu":"私人教练模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"会员","tableName":"huiyuan"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除","查看评论"],"menu":"私人教练","menuJump":"列表","tableName":"sirenjiaolian"}],"menu":"私人教练管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","审核"],"menu":"私教预约","menuJump":"列表","tableName":"sijiaoyuyue"}],"menu":"私教预约管理"},{"child":[{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"在线咨询","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","查看评论","用户预约","会员预约"],"menu":"场地信息列表","menuJump":"列表","tableName":"changdixinxi"}],"menu":"场地信息模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","查看评论","会员购买","器材购买"],"menu":"体育器材列表","menuJump":"列表","tableName":"tiyuqicai"}],"menu":"体育器材模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"通知公告列表","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","查看评论","私教预约"],"menu":"私人教练列表","menuJump":"列表","tableName":"sirenjiaolian"}],"menu":"私人教练模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"健身教练","tableName":"jianshenjiaolian"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","回复","删除"],"menu":"用户投诉","tableName":"messages"}],"menu":"用户投诉"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","查看评论","用户预约","会员预约"],"menu":"场地信息列表","menuJump":"列表","tableName":"changdixinxi"}],"menu":"场地信息模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","查看评论","会员购买","器材购买"],"menu":"体育器材列表","menuJump":"列表","tableName":"tiyuqicai"}],"menu":"体育器材模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"通知公告列表","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","查看评论","私教预约"],"menu":"私人教练列表","menuJump":"列表","tableName":"sirenjiaolian"}],"menu":"私人教练模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"员工","tableName":"yuangong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
