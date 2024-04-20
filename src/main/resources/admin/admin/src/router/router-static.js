import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import huiyuantuiding from '@/views/modules/huiyuantuiding/list'
    import yuangong from '@/views/modules/yuangong/list'
    import tiyuqicai from '@/views/modules/tiyuqicai/list'
    import qicaigoumai from '@/views/modules/qicaigoumai/list'
    import qicaileixing from '@/views/modules/qicaileixing/list'
    import jianshenjiaolian from '@/views/modules/jianshenjiaolian/list'
    import changdileixing from '@/views/modules/changdileixing/list'
    import discusstiyuqicai from '@/views/modules/discusstiyuqicai/list'
    import yonghu from '@/views/modules/yonghu/list'
    import sijiaoyuyue from '@/views/modules/sijiaoyuyue/list'
    import discusssirenjiaolian from '@/views/modules/discusssirenjiaolian/list'
    import huiyuantuikuan from '@/views/modules/huiyuantuikuan/list'
    import news from '@/views/modules/news/list'
    import huiyuandengji from '@/views/modules/huiyuandengji/list'
    import huiyuangoumai from '@/views/modules/huiyuangoumai/list'
    import huiyuan from '@/views/modules/huiyuan/list'
    import tuidingchangdi from '@/views/modules/tuidingchangdi/list'
    import huiyuanyuyue from '@/views/modules/huiyuanyuyue/list'
    import qicaituiding from '@/views/modules/qicaituiding/list'
    import changdixinxi from '@/views/modules/changdixinxi/list'
    import discusschangdixinxi from '@/views/modules/discusschangdixinxi/list'
    import sirenjiaolian from '@/views/modules/sirenjiaolian/list'
    import users from '@/views/modules/users/list'
    import chat from '@/views/modules/chat/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import changdiyuyue from '@/views/modules/changdiyuyue/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/huiyuantuiding',
        name: '会员退订',
        component: huiyuantuiding
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/tiyuqicai',
        name: '体育器材',
        component: tiyuqicai
      }
      ,{
	path: '/qicaigoumai',
        name: '器材购买',
        component: qicaigoumai
      }
      ,{
	path: '/qicaileixing',
        name: '器材类型',
        component: qicaileixing
      }
      ,{
	path: '/jianshenjiaolian',
        name: '健身教练',
        component: jianshenjiaolian
      }
      ,{
	path: '/changdileixing',
        name: '场地类型',
        component: changdileixing
      }
      ,{
	path: '/discusstiyuqicai',
        name: '体育器材评论',
        component: discusstiyuqicai
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/sijiaoyuyue',
        name: '私教预约',
        component: sijiaoyuyue
      }
      ,{
	path: '/discusssirenjiaolian',
        name: '私人教练评论',
        component: discusssirenjiaolian
      }
      ,{
	path: '/huiyuantuikuan',
        name: '会员退款',
        component: huiyuantuikuan
      }
      ,{
	path: '/news',
        name: '体育资讯',
        component: news
      }
      ,{
	path: '/huiyuandengji',
        name: '会员等级',
        component: huiyuandengji
      }
      ,{
	path: '/huiyuangoumai',
        name: '会员购买',
        component: huiyuangoumai
      }
      ,{
	path: '/huiyuan',
        name: '会员',
        component: huiyuan
      }
      ,{
	path: '/tuidingchangdi',
        name: '退订场地',
        component: tuidingchangdi
      }
      ,{
	path: '/huiyuanyuyue',
        name: '会员预约',
        component: huiyuanyuyue
      }
      ,{
	path: '/qicaituiding',
        name: '器材退订',
        component: qicaituiding
      }
      ,{
	path: '/changdixinxi',
        name: '场地信息',
        component: changdixinxi
      }
      ,{
	path: '/discusschangdixinxi',
        name: '场地信息评论',
        component: discusschangdixinxi
      }
      ,{
	path: '/sirenjiaolian',
        name: '私人教练',
        component: sirenjiaolian
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
      ,{
	path: '/messages',
        name: '用户投诉',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/changdiyuyue',
        name: '场地预约',
        component: changdiyuyue
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
