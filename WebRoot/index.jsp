<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>菜单栏</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/index.css">
	
  </head>
  
 <body>
  <div class="left_nav"  dd_name="左侧分类导航">
  <ul class="left_nav_width" id="category">
  		<li id="category_item"><li>
  </ul>
  </div>
 <script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js" >
 </script>
<script>
  $(document).ready(function(){init();});
  
   function init(){
        $.ajax({
        type:"POST",
        url:"/OnlineShopping/servlet/index",
        dataType: "json",
        success:function(res){
	        console.log(res.code); 
	        if(res.code==0){
	        		var info=res.data;
	                $.each(res.data, function(i, data){
		                var item = "<li><a href='page/"+data.Jurl+"'>"+data.name+"</a></li>";
		                    $("#category_item").append(item); //拼接标签
	                    });
	        }else{
	           alert("请求失败");
	        }
        },
       error:function(){
//            $("#test").html("发生错误:"+jqXHR.status);
                alert("发生错误");
            }
    }); 
}
</script>
</body>
</html>
