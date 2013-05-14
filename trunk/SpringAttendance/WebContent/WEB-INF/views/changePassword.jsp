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
					
					
                    var password = $('#cpassword').val();
                    var np = $('#newpassword').val();
                    var cp = $('#confirmpassword').val();
                    
                    var error = false;
                    
                   if(password == null || password.length == 0){
                        error = true;
                        $('#cpe').show();
                    }
                    
                    if(np == null || np.length == 0){
                        error = true;
                        $('#npe').show();
                    }
                    
                    if(cp == null|| cp.length == 0){
                        error = true;
                        $('#conpe').show();
                        $('#le').hide();
                    }
                    if(np != cp){
                    	error = true;
                    	  $('#le').show();
                    }
                    
                    if(error){

                        return;
                    }else{
                	
                	
                    $.ajax({
                        type :'POST' ,
                        url : '${pageContext.request.contextPath}/changePassword',
                        data : $('#cpForm').serialize(),
                        success : function(response) {
                           // alert(response);
                           
                            if(response == '1'){
                            	//alert("ok");
                            	$('#um').show();
                            	$('#em').hide();
                            }if(response == '0'){
                            	$('#em').show();
                            	$('#um').hide();
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
			<h2>Change Password</h2>
			<hr size="1" width="100%" color="silver">
			<span id="um" style="display: none"><font color="green">Password Updated Successfully
						 </font></span>
			<span id="em" style="display: none"><font color="red">No Record Found
						 </font></span>
			<sf:form modelAttribute="appUserForm" id="cpForm">
				<br> USERNAME<br>
				<sf:input path="userName" maxlength="20px" size="50px"
					name="username" id="username" readonly="readonly"
					value="${appUser.userName }" />
				<br>
				<br>Current Password<br>
				<sf:input path="password" name="cpassword" size="50px"
					id="cpassword" />
				<span id="cpe" style="display: none"><font color="red">Current
						Password Is Required </font></span>
				<br>
				<br>New
                    Password<br>
				<sf:input path="answer" name="newpassword" size="50px"
					id="newpassword" />
				<span id="npe" style="display: none"><font color="red">New
						Password Is Required </font></span>
				<br>

				<br>Confirm Password<br>
				<sf:input path="userRole" size="50px" name="confirmpassword"
					id="confirmpassword" />
				<span id="conpe" style="display: none"><font color="red">Confirm
						Password Is Required </font></span>
				<span id="le" style="display: none"><font color="red">Password
						Doesn't Match </font></span>
				<br>
				<br>
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