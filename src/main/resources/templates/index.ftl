<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
this is freemarker<br>
${name}
<#if sex==1>
	男
	<#elseif sex==0>
	女
	<#else>
	其他
</#if>
<#list userList as user>
${user}
</#list>
</body>
</html>