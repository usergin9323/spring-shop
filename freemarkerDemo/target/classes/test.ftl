<html>
<#include "head.ftl">
<head>
    <meta charset="utf-8">
    <title>Freemarker入门小DEMO </title>
</head>
<body>
<#--我只是一个注释，我不会有任何输出  -->
${name},你好。${message}
<#--定义一个简单类型-->
<#assign likeName="邓紫棋">
我喜爱的歌手之一：${likeName}</br>
<#--定义一个对象-->
<#assign user={"name":"田馥甄","sex":"女","age":36,"address":"台湾省新竹县"} >
女神：${user.name}</br>
地址：${user.address}
<hr>
<#--if指令-->
<#if success=true>
    恭喜你晋级成功
    <#else >
    晋级失败
</#if>
<hr>
----商品价格----
<#--循环获取list-->
<#list  list as goods>
    ${goods_index+1} 商品名称 ：${goods.name} 价格：${goods.price}</br>

</#list>
共${list?size} 条记录数
<hr>
<#assign text="{'bank':'工商银行','account':'13131231231'}">
<#assign data=text?eval/>
开户行：${data.bank} 账号：${data.account}
<hr>
当前时间------
${today?date}
${today?time}
${today?datetime}
格式化----
${today?string("yyyy年MM月dd日")}
给变量赋值----=++++
${point}
${point?c}
判断是否有空值++++++++
<#if aaa??>
    aaa有值
    <#else >
    aaa不存在值
</#if>

</body>
</html>