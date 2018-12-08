<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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