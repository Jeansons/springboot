<%@ page language="java" contentType="text/html; 
charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HttpMessageConverter Demo</title>
<script src="assets/js/jquery-3.3.1.js" type="text/javascript"></script>
</head>
<body>
<div id="resp"></div>
<input type="button" onclick="req();" value="请求"/>


<script>
	function req(){
		$.ajax({
			url:"convert",
			data:"1-ycpooo",
			type:"POST",
			contentType:"application/x-wisely",
			success:function(data){
				$("#resp").html(data);
			}
		});
		
	}
</script>
</body>
</html>