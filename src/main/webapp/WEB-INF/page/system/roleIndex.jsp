<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<HTML>
	<HEAD>
		<title>角色权限管理</title>
		<LINK href="${pageContext.request.contextPath }/css/Style.css"  type="text/css" rel="stylesheet">
		<script language="javascript"  src="${pageContext.request.contextPath }/script/function.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/script/pub.js"></script>
		<script language="javascript">

		 function saveRole(){

           document.Form2.roleid.value=document.Form1.role.value;
		   document.Form2.action="saveRole.do";
		   document.Form2.submit();
		}


       function selectRole(){

          if(document.Form1.role.value=="0"){
             // document.Form1.action="getAllRoleList.do";
             // document.Form1.submit();
          }else{
          	//   alert(document.Form1.role.value)
			  var roleCode = document.Form1.role.value;
          	// 员工选择角色类型发送请求查询该角色的所有权限
			  document.Form1.submit();
          }
       }
       function saveRoleAndAuth() {
		   window.location.href="${pageContext.request.contextPath}/role/saveRoleAndAuth"
	   }

		</script>
		<style>
			.userTableClass{
				width: 1300px;
				margin: 0 auto;
				height: 80px;
				text-align: center;
				font-weight: bold;
				border-collapse:collapse;
			}
		</style>
	</HEAD>

	<body>
	 <Form name="Form1" id="Form1"  action="${pageContext.request.contextPath}/role/queryRoleOnAuth" method="post" style="margin:0px;">
		<table cellSpacing="1" cellPadding="0" width="90%" align="center" bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" colspan=2 align="center" background="${pageContext.request.contextPath }/images/b-info.gif">
						<font face="宋体" size="2"><strong>角色管理</strong></font>
					</td>
				</tr>
				<tr>
				   <td class="ta_01" colspan=2 align="right" width="100%"  height=10>
				   </td>
				</tr>
				<tr>
					<td class="ta_01" align="right" width="35%" >角色类型&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td class="ta_01" align="left"  width="65%" >

					  <select name="role" class="bg" style="width:180px"  onchange="selectRole()">
						 <option value="0" >请选择</option>

                          <option value="1" <c:if test="${role.roleCode == '1'}" >selected</c:if> >系统管理员</option>

						 <option value="2" <c:if test="${role.roleCode == '2'}" >selected </c:if>>高级管理员</option>

						 <option value="3" <c:if test="${role.roleCode == '3'}" >selected </c:if>>中级管理员</option>

						 <option value="4" <c:if test="${role.roleCode == '4'}" >selected </c:if>>业务用户</option>

						 <option value="5" <c:if test="${role.roleCode == '5'}" >selected </c:if>>一般用户</option>

						 <option value="6" <c:if test="${role.roleCode == '6'}" >selected </c:if>>普通用户</option>

					  </select>


					</td>
				</tr>

			    <tr>
				   <td class="ta_01" align="right" colspan=2 align="right" width="100%"  height=10></td>
				</tr>

			</TBODY>
		  </table>
 </Form>

<Form  name="Form2" id="Form2"  method="post" style="margin:0px;margin-bottom: 30px;">

  <table cellSpacing="1" cellPadding="0" width="90%" align="center" bgColor="#f5fafe" border="0">
 <tr>
  <td>
   <fieldset style="width:100%; border : 1px solid #73C8F9;text-align:left;COLOR:#023726;FONT-SIZE: 12px;"><legend align="left">权限分配</legend>

     <table cellSpacing="0" cellPadding="0" width="90%" align="center" bgColor="#f5fafe" border="0">
		 <%--此处可以使用c:foreach遍历所有权限  但由于此处有格式调整所以没有使用--%>
			  <tr>
				 <td class="ta_01" colspan=2 align="left" width="100%" >

						<br>
				          技术设施维护管理 :
						 <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '1'}">checked="true"</c:if></c:forEach> name="selectoper" value="1" >
				             仪器设备管理
						     &nbsp;&nbsp;&nbsp;
   	                         <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '2'}">checked="true"</c:if></c:forEach>   name="selectoper" value="2" >
				             设备校准检修
				              &nbsp;&nbsp;&nbsp;
   	                         <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '3'}">checked="true"</c:if></c:forEach>  name="selectoper" value="3" >
				             设备购置计划
				              &nbsp;&nbsp;&nbsp;
						<br>
				          技术资料图纸管理 :
				        <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '4'}">checked="true"</c:if></c:forEach>  name="selectoper" value="4" >
					 		资料图纸管理
						       &nbsp;&nbsp;&nbsp;
						<br>
				          站点设备运行管理 :
				        <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '5'}">checked="true"</c:if></c:forEach>  name="selectoper" value="5" >
				             站点基本信息
						       &nbsp;&nbsp;&nbsp;
   	                         <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '6'}">checked="true"</c:if></c:forEach>   name="selectoper" value="6" >
				             运行情况

				              &nbsp;&nbsp;&nbsp;

				              &nbsp;&nbsp;&nbsp;

				              &nbsp;&nbsp;&nbsp;
   	                         <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '7'}">checked="true"</c:if></c:forEach>  name="selectoper" value="7" >
				             维护情况

				              &nbsp;&nbsp;&nbsp;

				              &nbsp;&nbsp;&nbsp;

				              &nbsp;&nbsp;&nbsp;
						<br>

				           &nbsp;&nbsp;&nbsp;
				          监测台建筑管理 :
				        <input type="checkbox"<c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '8'}">checked="true"</c:if></c:forEach>  name="selectoper" value="8" >
				             监测台建筑管理
						<br>
				           &nbsp;&nbsp;&nbsp;

				           &nbsp;&nbsp;&nbsp;

				           &nbsp;&nbsp;&nbsp;

				           &nbsp;&nbsp;&nbsp;

				          系统管理 :
   	                         <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '9'}">checked="true"</c:if></c:forEach>   name="selectoper" value="9" >
				             角色管理

				                &nbsp;&nbsp;&nbsp;

				                &nbsp;&nbsp;&nbsp;

				                &nbsp;&nbsp;&nbsp;
   	                         <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '10'}">checked="true"</c:if></c:forEach>  name="selectoper" value="10" >
				             待办事宜

				              &nbsp;&nbsp;&nbsp;

				              &nbsp;&nbsp;&nbsp;

				              &nbsp;&nbsp;&nbsp;
   	                         <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '11'}">checked="true"</c:if></c:forEach>  name="selectoper" value="11" >
				             数据字典维护

				              &nbsp;&nbsp;&nbsp;
						<br>

				           &nbsp;&nbsp;&nbsp;

				           &nbsp;&nbsp;&nbsp;

				          操作权限分配 :


   	                         <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '12'}">checked="true"</c:if></c:forEach>   name="selectoper" value="12" >
				             新增功能

				                &nbsp;&nbsp;&nbsp;
   	                         <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '13'}">checked="true"</c:if></c:forEach>  name="selectoper" value="13" >
				             删除功能

				              &nbsp;&nbsp;&nbsp;

				              &nbsp;&nbsp;&nbsp;

				              &nbsp;&nbsp;&nbsp;
   	                         <input type="checkbox" <c:forEach items="${authorityEntityList}" var="authority"> <c:if test="${authority.authorityCode == '14'}">checked="true"</c:if></c:forEach>  name="selectoper" value="14" >
				             编辑功能

				              &nbsp;&nbsp;&nbsp;

				              &nbsp;&nbsp;&nbsp;

				              &nbsp;&nbsp;&nbsp;

				   </td>
				</tr>

				 <input type="hidden" name="roleStr" >
				 <input type="hidden" name="roleid" >
		 </table>
        </fieldset>
	  </td>
	 </tr>
  </table>

	</Form>
	<table border="1" class="userTableClass">
		<tr>
			<td>
				用户id
			</td>
			<td>
				用户账号
			</td>
			<td>
				用户真实姓名
			</td>
		</tr>
		<tr>
			<td>
				${user.id}
			</td>
			<td>
				${user.name}
			</td>
			<td>
                ${user.username}
			</td>
		</tr>
	</table>
	<div style="width: 1300px;margin: 0 auto;margin-top: 20px;text-align: right;">
		<input type="button" onclick="saveRoleAndAuth()" value="保存">
	</div>
	</body>
</HTML>
