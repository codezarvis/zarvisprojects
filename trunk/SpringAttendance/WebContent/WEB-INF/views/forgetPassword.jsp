<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ChangePassword</title>

<link rel="stylesheet" type="text/css" href="resources/css/Allstyle.css" />
<script type="text/javascript" src="resources/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
            $(document).ready(function() {

				
                $('#btn').click(function(){
				
					var username = $('#username').val();

					var ans = $('#answer').val();
                    
                    var error = false;
                    
                   if(username == null || username == 0){
                        error = true;
                        $('#usernameerror').show();
                    }
                  
                    if(ans == null|| ans.length == 0){
                        error = true;
                        $('#anserror').show();
                    }
                    
                    if(error){

                        return;
                    }else{
                    $.ajax({
                        type :'POST' ,
                        url : '${pageContext.request.contextPath}/forgetPassword',
                        data : $('#fpForm').serialize(),
                        success : function(response) {                           
                            
                        	if(response == '1'){
                            
                        		$('#sm').show();
                            	$('#em').hide();
                            }
                        	
                        	if(response == '0'){
                            
                        		$('#em').show();
                            	$('#sm').hide();
                            }
                        }


                    });
                    }
                });
                
            });
        </script>
</head>
<body>



	<div id="top">
		<img alt="" src="resources/images/top.png" width="640px">
	</div>
	<div id="head"></div>
	<div id="container">
		<div id="items">
			<br>
			<h2>Forget Password</h2>
			<hr size="1" width="100%" color="silver">
			<span id="sm" style="display: none"><font color="green">Your password is ${appUser.password}
						 </font></span>
			<span id="em" style="display: none"><font color="red">No Record Found
						 </font></span>
			<sf:form modelAttribute="appUserForm" id="fpForm">
				<br> USERNAME<br>
				<sf:input path="userName" maxlength="20px" size="50px"
					name="username" id="username" />
					<span id="usernameerror" style="display: none"><font color="red">UserName
						 Is Required </font></span>
				<br><br>
				<br>SecurityQuestion
				<sf:select path="securityQuestion" id="sq">
						<sf:option value="What is your pet name">What is your pet name?</sf:option>
						<sf:option value="What is your school name">What is your school name?</sf:option>
						<sf:option value="What is your Birth Day">What is your Birth Day?</sf:option>
						<sf:option value="What is your Lucky Number">What is your Lucky Number?</sf:option>
					</sf:select>
			<span id="sqerror" style="display: none"><font color="red">SecurityQuestion
						 Is Required </font></span>

			
				<br><br>
				<br>Answer<br>
				<sf:input path="answer" size="50px" name="answer"
					id="answer" />
				<span id="anserror" style="display: none"><font color="red">Answer
						 Is Required </font></span>
				<br>				<br>
				<br>
				<input type="button" value="Submit" id="btn"
					style="font-size: 20px; color: white; background-color: blue;">
			</sf:form>

		</div>
		<div id="bottom">
			<img alt="" src="resources/images/top.png" width="640px">
		</div>

	</div>
</body>
</html>