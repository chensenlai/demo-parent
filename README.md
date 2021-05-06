# demo-parent demo项目
	demo项目,演示说明对脚手架项目依赖使用, 陆续更新补充说明。
	
### /user/get/v1
    依赖srobber-common包
> curl http://127.0.0.1:8080/app/user/get/v1?userId=1
> {"code":200,"msg":"","data":{"userId":1,"nickName":"local_1","gender":2,"gmtCreated":"2021-05-06 10:36:39","gtmUpdated":"2021-05-06 10:36:39"}}
1. maven多环境打包支持, eg: -Pdev 会使用resources/profiles/dev下文件覆盖resources下同名文件。 
2. json格式响应, code: 响应码, msg: 提示消息, data: 响应数据。
3. 入参有效性校验。
4. 枚举类处理, 枚举统一继承BaseEnum, SpringMVC,mybatis和JsonUtil统一使用num作为枚举值,
没有使用枚举ordinal,因为该和位置有关,容易导致错误, 数据库保存使用num, 因为数据库枚举字段的增减涉及到数据库变更。
