<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="订单编号" prop="dingdanbianhao">
          <el-input v-model="ruleForm.dingdanbianhao" 
              placeholder="订单编号" clearable  :readonly="ro.dingdanbianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="订单编号" prop="dingdanbianhao">
              <el-input v-model="ruleForm.dingdanbianhao" 
                placeholder="订单编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="场地名称" prop="changdimingcheng">
          <el-input v-model="ruleForm.changdimingcheng" 
              placeholder="场地名称" clearable  :readonly="ro.changdimingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="场地名称" prop="changdimingcheng">
              <el-input v-model="ruleForm.changdimingcheng" 
                placeholder="场地名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="场地类型" prop="changdileixing">
          <el-input v-model="ruleForm.changdileixing" 
              placeholder="场地类型" clearable  :readonly="ro.changdileixing"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="场地类型" prop="changdileixing">
              <el-input v-model="ruleForm.changdileixing" 
                placeholder="场地类型" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="场地区域" prop="changdiquyu">
          <el-input v-model="ruleForm.changdiquyu" 
              placeholder="场地区域" clearable  :readonly="ro.changdiquyu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="场地区域" prop="changdiquyu">
              <el-input v-model="ruleForm.changdiquyu" 
                placeholder="场地区域" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="开始时间" prop="kaishishijian">
          <el-input v-model="ruleForm.kaishishijian" 
              placeholder="开始时间" clearable  :readonly="ro.kaishishijian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="开始时间" prop="kaishishijian">
              <el-input v-model="ruleForm.kaishishijian" 
                placeholder="开始时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="时价格" prop="shijiage">
          <el-input v-model="ruleForm.shijiage" 
              placeholder="时价格" clearable  :readonly="ro.shijiage"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="时价格" prop="shijiage">
              <el-input v-model="ruleForm.shijiage" 
                placeholder="时价格" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="时长" prop="shizhang">
          <el-input v-model="ruleForm.shizhang" 
              placeholder="时长" clearable  :readonly="ro.shizhang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="时长" prop="shizhang">
              <el-input v-model="ruleForm.shizhang" 
                placeholder="时长" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="数量" prop="shuliang">
          <el-input v-model="ruleForm.shuliang" 
              placeholder="数量" clearable  :readonly="ro.shuliang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="数量" prop="shuliang">
              <el-input v-model="ruleForm.shuliang" 
                placeholder="数量" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="总价" prop="zongjia">
          <el-input v-model="ruleForm.zongjia" 
              placeholder="总价" clearable  :readonly="ro.zongjia"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="总价" prop="zongjia">
              <el-input v-model="ruleForm.zongjia" 
                placeholder="总价" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua" 
              placeholder="联系电话" clearable  :readonly="ro.lianxidianhua"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="联系电话" prop="lianxidianhua">
              <el-input v-model="ruleForm.lianxidianhua" 
                placeholder="联系电话" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="人次" prop="renci">
          <el-input v-model="ruleForm.renci" 
              placeholder="人次" clearable  :readonly="ro.renci"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="人次" prop="renci">
              <el-input v-model="ruleForm.renci" 
                placeholder="人次" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="会员账号" prop="huiyuanzhanghao">
          <el-input v-model="ruleForm.huiyuanzhanghao" 
              placeholder="会员账号" clearable  :readonly="ro.huiyuanzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="会员账号" prop="huiyuanzhanghao">
              <el-input v-model="ruleForm.huiyuanzhanghao" 
                placeholder="会员账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="会员姓名" prop="huiyuanxingming">
          <el-input v-model="ruleForm.huiyuanxingming" 
              placeholder="会员姓名" clearable  :readonly="ro.huiyuanxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="会员姓名" prop="huiyuanxingming">
              <el-input v-model="ruleForm.huiyuanxingming" 
                placeholder="会员姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji" 
              placeholder="手机" clearable  :readonly="ro.shouji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="手机" prop="shouji">
              <el-input v-model="ruleForm.shouji" 
                placeholder="手机" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="退订原因" prop="tuidingyuanyin">
          <el-input v-model="ruleForm.tuidingyuanyin" 
              placeholder="退订原因" clearable  :readonly="ro.tuidingyuanyin"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="退订原因" prop="tuidingyuanyin">
              <el-input v-model="ruleForm.tuidingyuanyin" 
                placeholder="退订原因" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="退订时间" prop="tuidingshijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.tuidingshijian" 
                type="datetime"
                :readonly="ro.tuidingshijian"
                placeholder="退订时间">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.tuidingshijian" label="退订时间" prop="tuidingshijian">
              <el-input v-model="ruleForm.tuidingshijian" 
                placeholder="退订时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item v-if="type!='info'"  label="场地详情" prop="changdixiangqing">
                <editor 
                    style="min-width: 200px; max-width: 600px;"
                    v-model="ruleForm.changdixiangqing" 
                    class="editor" 
                    action="file/upload">
                </editor>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.changdixiangqing" label="场地详情" prop="changdixiangqing">
                    <span v-html="ruleForm.changdixiangqing"></span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(8, 8, 8, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"40px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"#fff","dateIconFontSize":"14px","btnSaveBgColor":"rgba(173, 215, 230, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"rgba(0, 0, 0, 1)","btnCancelBgColor":"rgba(197, 197, 197, 1)","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"rgba(0, 0, 0, 1)","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"rgba(246, 246, 246, 1)","dateBorderColor":"rgba(0, 0, 0, 1)","dateIconFontColor":"rgba(0, 0, 0, 1)","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"40px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"rgba(0, 0, 0, 1)","inputBorderColor":"rgba(0, 0, 0, 1)","uploadBorderColor":"rgba(0, 0, 0, 1)","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px 1px 5px 1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(0, 0, 0, 1)","btnSaveBorderWidth":"1px 1px 5px 1px"},
      id: '',
      type: '',
      ro:{
	dingdanbianhao : false,
	changdimingcheng : false,
	changdileixing : false,
	changdiquyu : false,
	kaishishijian : false,
	shijiage : false,
	shizhang : false,
	shuliang : false,
	zongjia : false,
	lianxidianhua : false,
	changdixiangqing : false,
	renci : false,
	huiyuanzhanghao : false,
	huiyuanxingming : false,
	shouji : false,
	tuidingyuanyin : false,
	tuidingshijian : false,
	crossuserid : false,
	crossrefid : false,
	sfsh : false,
	shhf : false,
      },
      ruleForm: {
        dingdanbianhao: '',
        changdimingcheng: '',
        changdileixing: '',
        changdiquyu: '',
        kaishishijian: '',
        shijiage: '',
        shizhang: '',
        shuliang: '',
        zongjia: '',
        lianxidianhua: '',
        changdixiangqing: '',
        renci: '',
        huiyuanzhanghao: '',
        huiyuanxingming: '',
        shouji: '',
        tuidingyuanyin: '',
        tuidingshijian: '',
        crossuserid: '',
        crossrefid: '',
        shhf: '',
      },
      rules: {
          dingdanbianhao: [
          ],
          changdimingcheng: [
                { required: true, message: '场地名称不能为空', trigger: 'blur' },
          ],
          changdileixing: [
                { required: true, message: '场地类型不能为空', trigger: 'blur' },
          ],
          changdiquyu: [
                { required: true, message: '场地区域不能为空', trigger: 'blur' },
          ],
          kaishishijian: [
                { required: true, message: '开始时间不能为空', trigger: 'blur' },
          ],
          shijiage: [
                { required: true, message: '时价格不能为空', trigger: 'blur' },
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          shizhang: [
                { required: true, message: '时长不能为空', trigger: 'blur' },
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          shuliang: [
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          zongjia: [
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          lianxidianhua: [
                { validator: validateMobile, trigger: 'blur' },
          ],
          changdixiangqing: [
          ],
          renci: [
                { required: true, message: '人次不能为空', trigger: 'blur' },
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          huiyuanzhanghao: [
          ],
          huiyuanxingming: [
          ],
          shouji: [
          ],
          tuidingyuanyin: [
                { required: true, message: '退订原因不能为空', trigger: 'blur' },
          ],
          tuidingshijian: [
          ],
          crossuserid: [
          ],
          crossrefid: [
          ],
          sfsh: [
          ],
          shhf: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {
  },
  created() {
	this.ruleForm.tuidingshijian = this.getCurDateTime()

	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='dingdanbianhao'){
            this.ruleForm.dingdanbianhao = obj[o];
	    this.ro.dingdanbianhao = true;
            continue;
          }
          if(o=='changdimingcheng'){
            this.ruleForm.changdimingcheng = obj[o];
	    this.ro.changdimingcheng = true;
            continue;
          }
          if(o=='changdileixing'){
            this.ruleForm.changdileixing = obj[o];
	    this.ro.changdileixing = true;
            continue;
          }
          if(o=='changdiquyu'){
            this.ruleForm.changdiquyu = obj[o];
	    this.ro.changdiquyu = true;
            continue;
          }
          if(o=='kaishishijian'){
            this.ruleForm.kaishishijian = obj[o];
	    this.ro.kaishishijian = true;
            continue;
          }
          if(o=='shijiage'){
            this.ruleForm.shijiage = obj[o];
	    this.ro.shijiage = true;
            continue;
          }
          if(o=='shizhang'){
            this.ruleForm.shizhang = obj[o];
	    this.ro.shizhang = true;
            continue;
          }
          if(o=='shuliang'){
            this.ruleForm.shuliang = obj[o];
	    this.ro.shuliang = true;
            continue;
          }
          if(o=='zongjia'){
            this.ruleForm.zongjia = obj[o];
	    this.ro.zongjia = true;
            continue;
          }
          if(o=='lianxidianhua'){
            this.ruleForm.lianxidianhua = obj[o];
	    this.ro.lianxidianhua = true;
            continue;
          }
          if(o=='changdixiangqing'){
            this.ruleForm.changdixiangqing = obj[o];
	    this.ro.changdixiangqing = true;
            continue;
          }
          if(o=='renci'){
            this.ruleForm.renci = obj[o];
	    this.ro.renci = true;
            continue;
          }
          if(o=='huiyuanzhanghao'){
            this.ruleForm.huiyuanzhanghao = obj[o];
	    this.ro.huiyuanzhanghao = true;
            continue;
          }
          if(o=='huiyuanxingming'){
            this.ruleForm.huiyuanxingming = obj[o];
	    this.ro.huiyuanxingming = true;
            continue;
          }
          if(o=='shouji'){
            this.ruleForm.shouji = obj[o];
	    this.ro.shouji = true;
            continue;
          }
          if(o=='tuidingyuanyin'){
            this.ruleForm.tuidingyuanyin = obj[o];
	    this.ro.tuidingyuanyin = true;
            continue;
          }
          if(o=='tuidingshijian'){
            this.ruleForm.tuidingshijian = obj[o];
	    this.ro.tuidingshijian = true;
            continue;
          }
          if(o=='crossuserid'){
            this.ruleForm.crossuserid = obj[o];
	    this.ro.crossuserid = true;
            continue;
          }
          if(o=='crossrefid'){
            this.ruleForm.crossrefid = obj[o];
	    this.ro.crossrefid = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.huiyuanzhanghao!=''&&json.huiyuanzhanghao){
                this.ruleForm.huiyuanzhanghao = json.huiyuanzhanghao
	    		this.ro.huiyuanzhanghao = true;
		}
		if(json.huiyuanxingming!=''&&json.huiyuanxingming){
                this.ruleForm.huiyuanxingming = json.huiyuanxingming
	    		this.ro.huiyuanxingming = true;
		}
		if(json.shouji!=''&&json.shouji){
                this.ruleForm.shouji = json.shouji
	    		this.ro.shouji = true;
		}
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `huiyuantuiding/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
	this.ruleForm.changdixiangqing = this.ruleForm.changdixiangqing.replace(reg,'../../../springboot3cprm/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {











































var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "huiyuantuiding/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `huiyuantuiding/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.huiyuantuidingCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `huiyuantuiding/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.huiyuantuidingCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.huiyuantuidingCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
