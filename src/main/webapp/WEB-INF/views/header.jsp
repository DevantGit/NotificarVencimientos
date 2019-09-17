<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- Variables de context que pueden ser accedidas desde JSP -->
<c:set var="root" value="${pageContext.request.contextPath}" />
<c:set var="context" value="${root}/resources" />
<c:set var="fechaHoyDefecto" value="<%=new java.util.Date().getTime()%>" />

<!-- Variables de context que pueden ser accedidas desde el JavaScript -->
<link id="rootPathHolder" data-contextPath="${root}" />
<link id="contextPathHolder" data-contextPath="${context}" />
<link id="fechaHoyDefecto" data-contextPath="${fechaHoyDefecto}" />



<!-- Hojas de estilo -->
<link rel="stylesheet" type="text/css"
	href="${context}/css/jquery.datetimepicker.css" />
<link rel="stylesheet" type="text/css"
	href="${context}/css/defaults.css" media="screen" />
<link rel="stylesheet" type="text/css" href="${context}/css/header.css"
	media="screen" />


<meta http-equiv="refresh" content="3600">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Funciones JavaScript-->
<script src="${context}/js/jquery.min.js"></script>
<script src="${context}/js/jquery.blockUI.js"></script>
<script src="${context}/js/jquery-ui.min.js"></script>
<script src="${context}/js/jquery.datetimepicker.full.js"></script>
<script src="${context}/js/header.js"></script>


<meta charset="UTF-8">
<title>MeetingRoom App</title>
</head>
<body>
	<div class="main-header">
		<div class="main-header-button">Cerrar Sesi&oacute;n</div>
		<div class="main-header-button main-header-button-desactive">MEETING
			ROOM</div>
		<div class="main-header-button main-header-button-desactive"
			id="usuario">Javier Duran Sanchez</div>
	</div>
	<div class="screen-logo-container">
		<div class="screen-logo"></div>
	</div>
	<div class="header-space"></div>
	<div class="menu-container" id="menu-container">
		<div class="menu-subcontainer" id="menu-subcontainer">
			<div class="item-subcontainer-items"></div>
			<div class="item-subcontainer-fecha">
				<div class="calendar-icon">
					<input type="text" id="hoy" autocomplete="off" /> <span id="today"></span>
				</div>
			</div>
			<div class="item-subcontainer-items hora">
				<span id="hour"></span>
			</div>
			<div class="item-subcontainer-items">
				<div class="nuevaSala-icon" onclick="redireccionarNuevaSala(this)">
				</div>
			</div>
		</div>
	</div>
	<div id="main-content"></div>
	<div class="devant-alert" id="alert1">
		<span class="closebtn">×</span> <strong>Titulo</strong> &nbsp;<span>Mensaje.</span>
	</div>
	<script>
		$(".closebtn").on("click", function() {
			msgContainer = $(this).parent();
			msgContainer.css("opacity", 0);
			msgContainer.css("transform", "translateX(100%)");
		});
	</script>
</body>
</html>