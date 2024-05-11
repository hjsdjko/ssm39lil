<template>
	<view class="uni-padding-wrap">
		<view class="header">
			<view class="headerb">
				<swiper class="swiper" :indicator-dots='".swiper-pagination"==null?false:true' :autoplay='autoplaySwiper' :circular='true' indicator-active-color='rgba(242, 199, 68, 1)' indicator-color='rgba(218, 218, 218, 1)' :duration='1000' :interval='intervalSwiper' :vertical='"horizontal"=="horizontal"?false:true'>
					<swiper-item v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
						<image mode="aspectFill" :src="swiper.img"></image>
					</swiper-item>
				</swiper>
			</view>
		</view>

		<view class="cu-bar bg-white search" :style="[{top:CustomBar + 'px'}]">
			<picker v-if="queryList.length>1" mode="selector" :range="queryList" range-key="queryName" :value="queryIndex" @change="queryChange" style="padding-left: 20upx;">
				<view><image style="width: 20upx;height: 33upx;" src="../../static/center/to.png"></image></view>
			</picker>
			<view v-if="queryIndex==0" class="search-form round">
				<text class="cuIcon-search"></text>
				<input v-model="searchForm.qiuyuanqiuyuanxingming" type="text" placeholder="球员姓名" ></input>
			</view>
			<view v-if="queryIndex==0" class="action">
				<button @tap="onPageTap('qiuyuan')" :style="{width:'auto',borderRadius:'40rpx',height:'80rpx',fontSize:'28rpx',color:'rgba(239, 239, 239, 1)',backgroundColor:btnColor[2],borderColor:btnColor[2]}" class="cu-btn shadow-blur round">搜索</button>
			</view>
		</view>
		
																																																								
						<view class="pl15 col3 header-title" style="padding: 0 12px;box-sizing: border-box;" :style='{"backgroundColor":"rgba(242, 199, 68, 1)","borderColor":"red","color":"rgba(0, 0, 0, 1)","borderRadius":0,"borderWidth":"0px","fontSize":"32rpx","lineHeight":"72rpx","borderStyle":"solid"}'>
			<view class="left" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				球员
			</view>
			<view class="right-content" @tap="onPageTap('qiuyuan')" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				查看更多
			</view>
		</view>
		<view v-if='1 == 1 || 1 == 2' class="uni-product-list" :class="1 == 2 ? 'active' : ''" :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view @tap="onDetailTap('qiuyuan',product.id)" :style='{"borderRadius":"0px","backgroundColor":"#fff"}' class="uni-product" v-for="(product,index) in homeqiuyuanlist" :key="index">
				                				                				                				<view :style='{"fontSize":"24rpx","lineHeight":"44rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}' class="uni-product-title">{{product.qiuyuanxingming}}</view>
								                				                				                				                				                				                				<view class="image-view" :style='{"borderRadius":"100%","height":"280rpx"}'>
					<image :style='{"borderRadius":"100%","height":"280rpx"}' mode="aspectFill" class="uni-product-image" :src="product.qiuyuanzhaopian?product.qiuyuanzhaopian.split(',')[0]:''"></image>
				</view>
                							</view>
		</view>
		<view class="list" v-if='1 == 3' :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view :style='{"borderRadius":"0px","backgroundColor":"#fff"}' @tap="onDetailTap('qiuyuan',product.id)" v-for="(product,index) in homeqiuyuanlist" :key="index" class="listm flex flex-between">
																																																								<view class="listmr">
					<view class="col3 f30 elip mb15" :style='{"fontSize":"24rpx","lineHeight":"44rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}'>{{product.qiuyuanxingming}}</view>
				</view>
																																																																																																																												<image :style='{"borderRadius":"100%","height":"280rpx"}' mode="aspectFill" class="listmpic" :src="product.qiuyuanzhaopian?product.qiuyuanzhaopian.split(',')[0]:''"></image>
																							</view>
		</view>
		<!--list end-->
												<view class="pl15 col3 header-title" style="padding: 0 12px;box-sizing: border-box;" :style='{"backgroundColor":"rgba(242, 199, 68, 1)","borderColor":"red","color":"rgba(0, 0, 0, 1)","borderRadius":0,"borderWidth":"0px","fontSize":"32rpx","lineHeight":"72rpx","borderStyle":"solid"}'>
			<view class="left" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				教练
			</view>
			<view class="right-content" @tap="onPageTap('jiaolian')" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				查看更多
			</view>
		</view>
		<view v-if='1 == 1 || 1 == 2' class="uni-product-list" :class="1 == 2 ? 'active' : ''" :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view @tap="onDetailTap('jiaolian',product.id)" :style='{"borderRadius":"0px","backgroundColor":"#fff"}' class="uni-product" v-for="(product,index) in homejiaolianlist" :key="index">
				                				                				                				<view :style='{"fontSize":"24rpx","lineHeight":"44rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}' class="uni-product-title">{{product.jiaolianxingming}}</view>
								                				                				                				<view class="image-view" :style='{"borderRadius":"100%","height":"280rpx"}'>
					<image :style='{"borderRadius":"100%","height":"280rpx"}' mode="aspectFill" class="uni-product-image" :src="product.jiaolianzhaopian?product.jiaolianzhaopian.split(',')[0]:''"></image>
				</view>
                							</view>
		</view>
		<view class="list" v-if='1 == 3' :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view :style='{"borderRadius":"0px","backgroundColor":"#fff"}' @tap="onDetailTap('jiaolian',product.id)" v-for="(product,index) in homejiaolianlist" :key="index" class="listm flex flex-between">
																																																								<view class="listmr">
					<view class="col3 f30 elip mb15" :style='{"fontSize":"24rpx","lineHeight":"44rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}'>{{product.jiaolianxingming}}</view>
				</view>
																																																																<image :style='{"borderRadius":"100%","height":"280rpx"}' mode="aspectFill" class="listmpic" :src="product.jiaolianzhaopian?product.jiaolianzhaopian.split(',')[0]:''"></image>
																							</view>
		</view>
		<!--list end-->
																<view class="pl15 col3 header-title" style="padding: 0 12px;box-sizing: border-box;" :style='{"backgroundColor":"rgba(242, 199, 68, 1)","borderColor":"red","color":"rgba(0, 0, 0, 1)","borderRadius":0,"borderWidth":"0px","fontSize":"32rpx","lineHeight":"72rpx","borderStyle":"solid"}'>
			<view class="left" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				联赛积分榜
			</view>
			<view class="right-content" @tap="onPageTap('liansaijifenbang')" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				查看更多
			</view>
		</view>
		<view v-if='1 == 1 || 1 == 2' class="uni-product-list" :class="1 == 2 ? 'active' : ''" :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view @tap="onDetailTap('liansaijifenbang',product.id)" :style='{"borderRadius":"0px","backgroundColor":"#fff"}' class="uni-product" v-for="(product,index) in homeliansaijifenbanglist" :key="index">
				                				                				<view :style='{"fontSize":"24rpx","lineHeight":"44rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}' class="uni-product-title">{{product.qiudui}}</view>
								                				                				                				                				                				                				                				                				                				<view class="image-view" :style='{"borderRadius":"100%","height":"280rpx"}'>
					<image :style='{"borderRadius":"100%","height":"280rpx"}' mode="aspectFill" class="uni-product-image" :src="product.qiuduizhaopian?product.qiuduizhaopian.split(',')[0]:''"></image>
				</view>
                							</view>
		</view>
		<view class="list" v-if='1 == 3' :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view :style='{"borderRadius":"0px","backgroundColor":"#fff"}' @tap="onDetailTap('liansaijifenbang',product.id)" v-for="(product,index) in homeliansaijifenbanglist" :key="index" class="listm flex flex-between">
																																				<view class="listmr">
					<view class="col3 f30 elip mb15" :style='{"fontSize":"24rpx","lineHeight":"44rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}'>{{product.qiudui}}</view>
				</view>
																																																																																																																																																																																								<image :style='{"borderRadius":"100%","height":"280rpx"}' mode="aspectFill" class="listmpic" :src="product.qiuduizhaopian?product.qiuduizhaopian.split(',')[0]:''"></image>
																							</view>
		</view>
		<!--list end-->
								<view class="pl15 col3 header-title" style="padding: 0 12px;box-sizing: border-box;" :style='{"backgroundColor":"rgba(242, 199, 68, 1)","borderColor":"red","color":"rgba(0, 0, 0, 1)","borderRadius":0,"borderWidth":"0px","fontSize":"32rpx","lineHeight":"72rpx","borderStyle":"solid"}'>
			<view class="left" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				杯赛积分榜
			</view>
			<view class="right-content" @tap="onPageTap('beisaijifenbang')" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				查看更多
			</view>
		</view>
		<view v-if='1 == 1 || 1 == 2' class="uni-product-list" :class="1 == 2 ? 'active' : ''" :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view @tap="onDetailTap('beisaijifenbang',product.id)" :style='{"borderRadius":"0px","backgroundColor":"#fff"}' class="uni-product" v-for="(product,index) in homebeisaijifenbanglist" :key="index">
				                				                				<view :style='{"fontSize":"24rpx","lineHeight":"44rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}' class="uni-product-title">{{product.qiudui}}</view>
								                				                				                				                				                				                				                				                				                				<view class="image-view" :style='{"borderRadius":"100%","height":"280rpx"}'>
					<image :style='{"borderRadius":"100%","height":"280rpx"}' mode="aspectFill" class="uni-product-image" :src="product.qiuduizhaopian?product.qiuduizhaopian.split(',')[0]:''"></image>
				</view>
                							</view>
		</view>
		<view class="list" v-if='1 == 3' :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view :style='{"borderRadius":"0px","backgroundColor":"#fff"}' @tap="onDetailTap('beisaijifenbang',product.id)" v-for="(product,index) in homebeisaijifenbanglist" :key="index" class="listm flex flex-between">
																																				<view class="listmr">
					<view class="col3 f30 elip mb15" :style='{"fontSize":"24rpx","lineHeight":"44rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}'>{{product.qiudui}}</view>
				</view>
																																																																																																																																																																																								<image :style='{"borderRadius":"100%","height":"280rpx"}' mode="aspectFill" class="listmpic" :src="product.qiuduizhaopian?product.qiuduizhaopian.split(',')[0]:''"></image>
																							</view>
		</view>
		<!--list end-->
																												
																																																						<view class="pl15 col3 header-title" style="font-size: 36upx;font-weight: bold;" :style='{"backgroundColor":"rgba(242, 199, 68, 1)","borderColor":"rgba(242, 199, 68, 1)","color":"rgba(0, 0, 0, 1)","borderRadius":0,"borderWidth":"0px","fontSize":"32rpx","lineHeight":"72rpx","borderStyle":"solid"}'>
			<view class="left" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				体育新闻	
			</view>
			<view class="right-content" @tap="onPageTap('news')" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				查看更多
			</view>
		</view>
		<view class="list" :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view :style='{"borderRadius":"0px","backgroundColor":"#fff"}' @tap="onNewsDetailTap(item.id)" v-for="(item,index) in news " v-bind:key="index" class="listm flex flex-between">
				<image :style='{"borderRadius":"0px","width":"200rpx","height":"200rpx"}' v-if="item.picture" :src="item.picture" mode="aspectFill" class="listmpic"></image>
				<view class="listmr">
					<view :style='{"fontSize":"28rpx","lineHeight":"56rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="col3 f30 elip mb15">{{item.title}}</view>
					<view :style='{"fontSize":"24rpx","lineHeight":"48rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' v-if="item.addtime" class="colb f24 lh35">发布时间：{{item.addtime}}</view>
				</view>
			</view>
		</view>
				
	</view>
</template>

<script>
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				queryList:[
					{
						queryName:"球员姓名",
					},
				],
				queryIndex: 0,
				searchForm:{
					qiuyuanqiuyuanxingming:'',
				},
				CustomBar: '0',

				autoplaySwiper: {"delay":"3000","disableOnInteraction":false} ? true : false,
				intervalSwiper: {"delay":"3000","disableOnInteraction":false} ? 3000 : 5000,
				//轮播
				swiperList: [],
																																																																																																																								homeqiuyuanlist: [],
																								homejiaolianlist: [],
																																homeliansaijifenbanglist: [],
																homebeisaijifenbanglist: [],
																																																												news: [],
			}
		},
		async onShow() {
                        this.btnColor = this.btnColor.sort(()=> {
                                return (0.5-Math.random());
                        });
			// 轮播图
			let swiperList = []
			let res = await this.$api.page('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
																																																																																	// 体育新闻
			res = await this.$api.list('news', {
				page: 1,
				limit: 3
			});
			this.news = res.data.list
									
																																																																																	
			res = await this.$api.list('qiuyuan', {
				page: 1,

				limit: 4
			});
			this.homeqiuyuanlist = res.data.list
												res = await this.$api.list('jiaolian', {
				page: 1,

				limit: 4
			});
			this.homejiaolianlist = res.data.list
															res = await this.$api.list('liansaijifenbang', {
				page: 1,
        sort: 'jifen',
        order: 'desc',

				limit: 4
			});
			this.homeliansaijifenbanglist = res.data.list
									res = await this.$api.list('beisaijifenbang', {
				page: 1,
        sort: 'jifen',
        order: 'desc',

				limit: 4
			});
			this.homebeisaijifenbanglist = res.data.list
																										},

		methods: {

			//查询条件切换
			queryChange(e) {
				this.queryIndex=e.detail.value;
				this.searchForm.qiuyuanqiuyuanxingming="";
			},
			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){
				if(this.queryIndex==0) {
					uni.setStorageSync('indexQueryCondition',this.searchForm.qiuyuanqiuyuanxingming);
					this.searchForm.qiuyuanqiuyuanxingming = '';
				}

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			}
		}
	}
</script>

<style>
	page {
		background: #F8F8F8;
	}
	
	.uni-padding-wrap:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	view {
		font-family: '\5FAE\8F6F\96C5\9ED1';
		font-size: 30upx;
	}

	.header {
		background: #EEEEEE;
		padding: 0 0 300upx 0;
		margin-bottom: 20upx;
		position: relative;
	}

	.ssbox {
		background: rgba(255, 255, 255, 0.35);
		width: 530upx;
		border-radius: 60rpx;
		padding: 10upx 15upx;
		box-sizing: border-box;
	}

	.ss_input {
		border: none;
		width: 450upx;
		font-size: 30upx;
		color: #fff;
		background: none;
		height: 45upx;
		line-break: 45upx;
	}

	.headerb {
		position: absolute;
		left: 0;
		width: 100%;
		box-sizing: border-box;
	}

	.headerb image {
		width: 100%;
		position: relative;
		z-index: 10;
	}
	
	.headerb .swiper {
		height: 300upx;
	}
	
		.swiper /deep/ .uni-swiper-dot {
		width: 20rpx;
		height: 24rpx;
		broder-radius: 50%;
	}
		

	.notice {
		position: relative;
		z-index: 5;
		padding: 0 50upx;
	}

	.noticem {
		background: #fff;
		padding: 55upx 30upx 15upx;
		border-radius: 10upx;
		margin-top: -45upx;
	}

	.noticer {
		width: 480upx;
		height: 50upx;
	}

	.noticer .swiper-item {
		white-space: nowrap;
		text-overflow: ellipsis;
		overflow: hidden;
		height: 50upx;
		line-height: 50upx;
		font-size: 24upx;
	}

	.list {
		padding: 20upx 20upx 20upx;
	}

	.listm {
		background: #fff;
		border-radius: 15upx;
		box-shadow: 0 0 2upx rgba(0, 0, 0, 0.1);
		margin-bottom: 20upx;
		padding: 30upx;
	}

	.listmpic {
		border-radius: 10upx;
		width: 166upx;
		margin-right: 20upx;
	}

	.listmr {
		// width: 460upx;
		display: inline-block;
		flex: 1;
		display: flex;
		justify-content: space-between;
		flex-direction: column;
	}

	/* #ifdef MP-WEIXIN */
	.noticer .swiper-item {
		margin-top: 5upx;
	}

	/* #endif */
	/* #ifdef MP-BAIDU */
	.noticer .swiper-item {
		margin-top: 3upx;
	}

	/* #endif */
	/* #ifdef MP-ALIPAY */
	.noticer .swiper-item {
		margin-top: 2upx;
	}

	/* #endif */
	/* #ifdef MP-QQ */
	.noticer .swiper-item {
		margin-top: 4upx;
	}

	/* #endif */
	/* #ifdef MP-TOUTIAO */
	.noticer .swiper-item {
		margin-top: 4upx;
	}

	/* #endif */

	.uni-product-list {
		display: flex;
		width: 100%;
		flex-wrap: wrap;
		flex-direction: row;
		margin-top: 0;
		padding: 0 14upx;
		box-sizing: border-box;
	}
	
	.uni-product-list.active {
		padding: 0 12upx;
	}

	.uni-product {
		padding: 10upx;
		margin: 10upx;
		width: 341upx;
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
		background: #FFFFFF;
	}
	
	.uni-product-list.active .uni-product {
		width: 222upx;
	}

	.image-view {
		height: 321upx;
		width: 321upx;
		// margin: 12upx 0;
		display: flex;
		align-items: center;
		overflow: hidden;
	}
	
	.uni-product-list.active .image-view {
		height: 202upx;
		width: 202upx;
		overflow: hidden;
	}

	.uni-product-image {
		height: 100%;
		width: 100%;
		margin: 0 auto;
		display: block;
	}

	.uni-product-title {
		width: 100%;
		word-break: break-all;
		display: -webkit-box;
		overflow: hidden;
		line-height: 1.5;
		text-overflow: ellipsis;
		-webkit-box-orient: vertical;
		-webkit-line-clamp: 1;
	}

	.uni-product-price {
		width: 100%;
		margin-top: 10upx;
		font-size: 28upx;
		line-height: 1.5;
		position: relative;
	}

	.uni-product-price-original {
		color: #e80080;
	}

	.uni-product-price-favour {
		color: #888888;
		text-decoration: line-through;
		margin-left: 10upx;
	}

	.uni-product-tip {
		position: absolute;
		right: 10upx;
		background-color: #ff3333;
		color: #ffffff;
		padding: 0 10upx;
		border-radius: 5upx;
	}

	.header-title {
		display: flex;
		align-items: center;
		text-align: center;
		justify-content: space-between;
		padding: 0 40upx;
	}
</style>
