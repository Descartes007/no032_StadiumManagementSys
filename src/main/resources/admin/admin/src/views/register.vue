<template>
  <div>
        <div class="container">
      <div class="login-form">
        <h1 class="h1">体育场馆管理系统注册</h1>
		<el-form ref="rgsForm" class="rgs-form" :model="rgsForm">
			<!-- <div v-if="tableName=='yonghu'" class="input-group">
			   <div class="label">账号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhanghao" class="input" type="text" placeholder="账号">
			   </div>
			 </div> -->
			<el-form-item label="账号" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.zhanghao" autocomplete="off" placeholder="账号"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yonghu'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="password"#elsetype="text" />
			</el-form-item>
			<el-form-item label="确认密码" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password"/>
			</el-form-item>

			<!-- <div v-if="tableName=='yonghu'" class="input-group">
			   <div class="label">姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.xingming" class="input" type="text" placeholder="姓名">
			   </div>
			 </div> -->
			<el-form-item label="姓名" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.xingming" autocomplete="off" placeholder="姓名"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yonghu'" class="input-group">
			   <div class="label">手机</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shouji" class="input" type="text" placeholder="手机">
			   </div>
			 </div> -->
			<el-form-item label="手机" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.shouji" autocomplete="off" placeholder="手机"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yonghu'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱"  />
			</el-form-item>
			<!-- <div v-if="tableName=='huiyuan'" class="input-group">
			   <div class="label">会员账号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.huiyuanzhanghao" class="input" type="text" placeholder="会员账号">
			   </div>
			 </div> -->
			<el-form-item label="会员账号" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.huiyuanzhanghao" autocomplete="off" placeholder="会员账号"  />
			</el-form-item>
			<!-- <div v-if="tableName=='huiyuan'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="password"#elsetype="text" />
			</el-form-item>
			<el-form-item label="确认密码" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password"/>
			</el-form-item>

			<!-- <div v-if="tableName=='huiyuan'" class="input-group">
			   <div class="label">会员姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.huiyuanxingming" class="input" type="text" placeholder="会员姓名">
			   </div>
			 </div> -->
			<el-form-item label="会员姓名" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.huiyuanxingming" autocomplete="off" placeholder="会员姓名"  />
			</el-form-item>
			<!-- <div v-if="tableName=='huiyuan'" class="input-group">
			   <div class="label">手机</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shouji" class="input" type="text" placeholder="手机">
			   </div>
			 </div> -->
			<el-form-item label="手机" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.shouji" autocomplete="off" placeholder="手机"  />
			</el-form-item>
			<!-- <div v-if="tableName=='jianshenjiaolian'" class="input-group">
			   <div class="label">教练工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.jiaoliangonghao" class="input" type="text" placeholder="教练工号">
			   </div>
			 </div> -->
			<el-form-item label="教练工号" class="input" v-if="tableName=='jianshenjiaolian'">
			  <el-input v-model="ruleForm.jiaoliangonghao" autocomplete="off" placeholder="教练工号"  />
			</el-form-item>
			<!-- <div v-if="tableName=='jianshenjiaolian'" class="input-group">
			   <div class="label">教练姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.jiaolianxingming" class="input" type="text" placeholder="教练姓名">
			   </div>
			 </div> -->
			<el-form-item label="教练姓名" class="input" v-if="tableName=='jianshenjiaolian'">
			  <el-input v-model="ruleForm.jiaolianxingming" autocomplete="off" placeholder="教练姓名"  />
			</el-form-item>
			<!-- <div v-if="tableName=='jianshenjiaolian'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='jianshenjiaolian'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="password"#elsetype="text" />
			</el-form-item>
			<el-form-item label="确认密码" class="input" v-if="tableName=='jianshenjiaolian'">
			  <el-input v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password"/>
			</el-form-item>

			<!-- <div v-if="tableName=='jianshenjiaolian'" class="input-group">
			   <div class="label">年龄</div>
			   <div class="input-container">
			     <input v-model="ruleForm.nianling" class="input" type="text" placeholder="年龄">
			   </div>
			 </div> -->
			<el-form-item label="年龄" class="input" v-if="tableName=='jianshenjiaolian'">
			  <el-input v-model="ruleForm.nianling" autocomplete="off" placeholder="年龄"  />
			</el-form-item>
			<!-- <div v-if="tableName=='jianshenjiaolian'" class="input-group">
			   <div class="label">身高</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shengao" class="input" type="text" placeholder="身高">
			   </div>
			 </div> -->
			<el-form-item label="身高" class="input" v-if="tableName=='jianshenjiaolian'">
			  <el-input v-model="ruleForm.shengao" autocomplete="off" placeholder="身高"  />
			</el-form-item>
			<!-- <div v-if="tableName=='jianshenjiaolian'" class="input-group">
			   <div class="label">体重</div>
			   <div class="input-container">
			     <input v-model="ruleForm.tizhong" class="input" type="text" placeholder="体重">
			   </div>
			 </div> -->
			<el-form-item label="体重" class="input" v-if="tableName=='jianshenjiaolian'">
			  <el-input v-model="ruleForm.tizhong" autocomplete="off" placeholder="体重"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">员工工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yuangonggonghao" class="input" type="text" placeholder="员工工号">
			   </div>
			 </div> -->
			<el-form-item label="员工工号" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.yuangonggonghao" autocomplete="off" placeholder="员工工号"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="password"#elsetype="text" />
			</el-form-item>
			<el-form-item label="确认密码" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password"/>
			</el-form-item>

			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">员工姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yuangongxingming" class="input" type="text" placeholder="员工姓名">
			   </div>
			 </div> -->
			<el-form-item label="员工姓名" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.yuangongxingming" autocomplete="off" placeholder="员工姓名"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">部门</div>
			   <div class="input-container">
			     <input v-model="ruleForm.bumen" class="input" type="text" placeholder="部门">
			   </div>
			 </div> -->
			<el-form-item label="部门" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.bumen" autocomplete="off" placeholder="部门"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">职位</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhiwei" class="input" type="text" placeholder="职位">
			   </div>
			 </div> -->
			<el-form-item label="职位" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.zhiwei" autocomplete="off" placeholder="职位"  />
			</el-form-item>
			<!-- <div v-if="tableName=='yuangong'" class="input-group">
			   <div class="label">联系方式</div>
			   <div class="input-container">
			     <input v-model="ruleForm.lianxifangshi" class="input" type="text" placeholder="联系方式">
			   </div>
			 </div> -->
			<el-form-item label="联系方式" class="input" v-if="tableName=='yuangong'">
			  <el-input v-model="ruleForm.lianxifangshi" autocomplete="off" placeholder="联系方式"  />
			</el-form-item>
			<div style="display: flex;flex-wrap: wrap;width: 100%;justify-content: center;">
				<el-button class="btn" type="primary" @click="login()">注册</el-button>
				<el-button class="btn close" type="primary" @click="close()">取消</el-button>
			</div>
		</el-form>
      </div>
      <!-- <div class="nk-navigation">
        <a href="#">
          <div @click="login()">注册</div>
        </a>
      </div> -->
    </div>
  </div>
</template>
<script>


export default {
  data() {
    return {
      ruleForm: {
      },
      tableName:"",
      rules: {},
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
      },
  created() {
    
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    close(){
	this.$router.push({ path: "/login" });
    },
    // 注册
    login() {
	var url=this.tableName+"/register";
      if((!this.ruleForm.zhanghao) && `yonghu` == this.tableName){
        this.$message.error(`账号不能为空`);
        return
      }
      if((!this.ruleForm.mima) && `yonghu` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
      if((this.ruleForm.mima!=this.ruleForm.mima2) && `yonghu` == this.tableName){
	    this.$message.error(`两次密码输入不一致`);
	    return
      }
      if(`yonghu` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
      if(`yonghu` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
      if((!this.ruleForm.huiyuanzhanghao) && `huiyuan` == this.tableName){
        this.$message.error(`会员账号不能为空`);
        return
      }
      if((!this.ruleForm.mima) && `huiyuan` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
      if((this.ruleForm.mima!=this.ruleForm.mima2) && `huiyuan` == this.tableName){
	    this.$message.error(`两次密码输入不一致`);
	    return
      }
      if(`huiyuan` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
      if((!this.ruleForm.jiaoliangonghao) && `jianshenjiaolian` == this.tableName){
        this.$message.error(`教练工号不能为空`);
        return
      }
      if((!this.ruleForm.jiaolianxingming) && `jianshenjiaolian` == this.tableName){
        this.$message.error(`教练姓名不能为空`);
        return
      }
      if((!this.ruleForm.mima) && `jianshenjiaolian` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
      if((this.ruleForm.mima!=this.ruleForm.mima2) && `jianshenjiaolian` == this.tableName){
	    this.$message.error(`两次密码输入不一致`);
	    return
      }
      if((!this.ruleForm.yuangonggonghao) && `yuangong` == this.tableName){
        this.$message.error(`员工工号不能为空`);
        return
      }
      if((this.ruleForm.mima!=this.ruleForm.mima2) && `yuangong` == this.tableName){
	    this.$message.error(`两次密码输入不一致`);
	    return
      }
      if((!this.ruleForm.yuangongxingming) && `yuangong` == this.tableName){
        this.$message.error(`员工姓名不能为空`);
        return
      }
      if(`yuangong` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }
      this.$http({
        url: url,
        method: "post",
        data:this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "注册成功",
            type: "success",
            duration: 1500,
            onClose: () => {
              this.$router.replace({ path: "/login" });
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.h1 {
		margin-top: 10px;
	}

	body {
		padding: 0;
		margin: 0;
	}

	// .container {
 //    min-height: 100vh;
 //    text-align: center;
 //    // background-color: #00c292;
 //    padding-top: 20vh;
 //    background-image: url(../assets/img/bg.jpg);
 //    background-size: 100% 100%;
 //    opacity: 0.9;
 //  }

	// .login-form:before {
	// 	vertical-align: middle;
	// 	display: inline-block;
	// }

	// .login-form {
	// 	max-width: 500px;
	// 	padding: 20px 0;
	// 	width: 80%;
	// 	position: relative;
	// 	margin: 0 auto;

	// 	.label {
	// 		min-width: 60px;
	// 	}

	// 	.input-group {
	// 		max-width: 500px;
	// 		padding: 20px 0;
	// 		width: 80%;
	// 		position: relative;
	// 		margin: 0 auto;
	// 		display: flex;
	// 		align-items: center;

	// 		.input-container {
	// 			display: inline-block;
	// 			width: 100%;
	// 			text-align: left;
	// 			margin-left: 10px;
	// 		}

	// 		.icon {
	// 			width: 30px;
	// 			height: 30px;
	// 		}

	// 		.input {
	// 			position: relative;
	// 			z-index: 2;
	// 			float: left;
	// 			width: 100%;
	// 			margin-bottom: 0;
	// 			box-shadow: none;
	// 			border-top: 0px solid #ccc;
	// 			border-left: 0px solid #ccc;
	// 			border-right: 0px solid #ccc;
	// 			border-bottom: 1px solid #ccc;
	// 			padding: 0px;
	// 			resize: none;
	// 			border-radius: 0px;
	// 			display: block;
	// 			width: 100%;
	// 			height: 34px;
	// 			padding: 6px 12px;
	// 			font-size: 14px;
	// 			line-height: 1.42857143;
	// 			color: #555;
	// 			background-color: #fff;
	// 		}

	// 	}
	// }

	.nk-navigation {
		margin-top: 15px;

		a {
			display: inline-block;
			color: #fff;
			background: rgba(255, 255, 255, .2);
			width: 100px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;
		}

		.icon {
			margin-left: 10px;
			width: 30px;
			height: 30px;
		}
	}

	.register-container {
		margin-top: 10px;

		a {
			display: inline-block;
			color: #fff;
			max-width: 500px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;

			div {
				margin-left: 10px;
			}
		}
	}

	.container {
		height: 100vh;
		background-position: center center;
		background-size: cover;
		background-repeat: no-repeat;
    				background-image: url(http://codegen.caihongy.cn/20220121/7902658698ba4d039a58f15707647bbc.png);
		    
		.login-form {
			right: 50%;
			top: 50%;
			transform: translate3d(50%, -50%, 0);
			border-radius: 10px;
			background-color: rgba(255,255,255,.5);
			font-size: 14px;
			font-weight: 500;
      box-sizing: border-box;

			width: 430px;
			height: auto;
			padding: 15px;
			margin: 0 auto;
			border-radius: 20px;
			border-width: 10px;
			border-style: solid;
			border-color: rgba(171, 214, 229, 1);
			background-color: rgba(217, 231, 242, 1);
			box-shadow: 0 0 0px rgba(255,0,0,.1);

			.h1 {
				width: 80%;
				height: auto;
				line-height:auto;
				color: #000;
				font-size: 28px;
				padding: 0;
				margin: 20px auto;
				border-radius: 0;
				border-width: 0;
				border-style: solid;
				border-color: rgba(255,0,0,0);
				background-color: rgba(255,0,0,0);
				box-shadow: 0 0 6px rgba(255,0,0,0);
				text-align: center;
			}

			.rgs-form {
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;

        .el-form-item {
          width: 100%;
          display: flex;

          & /deep/ .el-form-item__content {
            flex: 1;
            display: flex;
          }
        }

				.input {
          width: 90%;
          height:auto;
          padding: 0;
          margin: 0 0 12px 0;
          border-radius: 0;
          border-width: 0;
          border-style: solid;
          border-color: rgba(255,0,0,0);
          background-color: rgba(255,0,0,0);
          box-shadow: 0 0 6px rgba(255,0,0,0);

					& /deep/ .el-form-item__label {
            width: 94px;
            line-height:44px;
            color: #606266;
            font-size: 14px;
            padding: 0 10px 0 0;
            margin: 0;
            border-radius: 0;
            border-width: 0;
            border-style: solid;
            border-color: rgba(255,0,0,0);
            background-color: rgba(255,0,0,0);
            box-shadow: 0 0 6px rgba(255,0,0,0);
					}

					& /deep/ .el-input__inner {
            width: 100%;
            height: 44px;
            line-height:44px;
            color: #606266;
            font-size: 14px;
            padding: 0 12px;
            margin: 0;
            border-radius: 4px;
            border-width: 1px;
            border-style: solid;
            border-color: #606266;
            background-color: #fff;
            box-shadow: 0 0 6px rgba(255,0,0,0);
            text-align: left;
					}
				}

        .send-code {
          & /deep/ .el-input__inner {
            width: 160px;
            height: 44px;
            line-height:44px;
            color: #606266;
            font-size: 14px;
            padding: 0 12px;
            margin: 0;
            border-radius: 0;
            border-width: 1px;
            border-style: solid;
            border-color: #606266;
            background-color: #fff;
            box-shadow: 0 0 6px rgba(255,0,0,0);
            text-align: left;
          }

          .register-code {
            margin: 0;
            padding: 0;
            width: 86px;
            height: 44px;
            line-height:44px;
            color: #fff;
            font-size: 14px;
            border-width: 1px 1px 1px 0;
            border-style: solid;
            border-color: rgba(1, 1, 1, 1);
            border-radius: 0;
            background-color: rgba(171, 214, 229, 1);
            box-shadow: 0 0 6px rgba(255,0,0,0);
          }
        }

				.btn {
					margin: 0 10px;
          padding: 0;
					width: 88px;
					height: 44px;
          line-height:44px;
					color: #fff;
					font-size: 14px;
					border-width: 2px;
					border-style: solid;
					border-color: rgba(171, 214, 229, 1);
					border-radius: 4px;
					background-color: rgba(156, 155, 92, 1);
          box-shadow: 0 0 6px rgba(255,0,0,0);
				}

				.close {
          margin: 0 10px;
          padding: 0;
          width: 88px;
          height: 44px;
          line-height:44px;
          color: rgba(0, 0, 0, 1);
          font-size: 14px;
          border-width: 0;
          border-style: solid;
          border-color: #409EFF;
          border-radius: 4px;
          background-color: rgba(132, 217, 164, 1);
          box-shadow: 0 0 0px rgba(255,0,0,0);
				}

			}
		}
	}
</style>
