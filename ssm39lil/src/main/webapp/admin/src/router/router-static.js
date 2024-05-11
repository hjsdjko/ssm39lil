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
    import qiuyuan from '@/views/modules/qiuyuan/list'
    import beisaijifenbang from '@/views/modules/beisaijifenbang/list'
    import zuqiuzhoubian from '@/views/modules/zuqiuzhoubian/list'
    import news from '@/views/modules/news/list'
    import liansaijifenbang from '@/views/modules/liansaijifenbang/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jiaolian from '@/views/modules/jiaolian/list'
    import saishileixing from '@/views/modules/saishileixing/list'
    import orders from '@/views/modules/orders/list'
    import shangpinleixing from '@/views/modules/shangpinleixing/list'
    import config from '@/views/modules/config/list'
    import saishiricheng from '@/views/modules/saishiricheng/list'


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
	path: '/qiuyuan',
        name: '球员',
        component: qiuyuan
      }
      ,{
	path: '/beisaijifenbang',
        name: '杯赛积分榜',
        component: beisaijifenbang
      }
      ,{
	path: '/zuqiuzhoubian',
        name: '足球周边',
        component: zuqiuzhoubian
      }
      ,{
	path: '/news',
        name: '体育新闻',
        component: news
      }
      ,{
	path: '/liansaijifenbang',
        name: '联赛积分榜',
        component: liansaijifenbang
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jiaolian',
        name: '教练',
        component: jiaolian
      }
      ,{
	path: '/saishileixing',
        name: '赛事类型',
        component: saishileixing
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/shangpinleixing',
        name: '商品类型',
        component: shangpinleixing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/saishiricheng',
        name: '赛事日程',
        component: saishiricheng
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
