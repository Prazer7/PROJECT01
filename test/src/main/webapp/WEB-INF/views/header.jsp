<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<%-- 		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/main.css" /> --%>
		<noscript><link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/noscript.css" /></noscript>
	</head>
	
<body>

<div>
			
		<div id="page-wrapper">
		
					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li><a href="${pageContext.request.contextPath}/">홈페이지 소개</a></li>
								<li>
									<a href="#">상품 구매/양도</a>
									<ul>
										<li>
											<a href="#">삼풍 구매 &hellip;</a>
											<ul>
												<li><a href="#">음식</a></li>
												<li><a href="#">백화점</a></li>
												<li><a href="#">관광</a></li>
												<li><a href="#">기타</a></li>
											</ul>
										</li>

										<li><a href="#">상품 판매</a></li>
									
									</ul>
								</li>
								<li><a href="${pageContext.request.contextPath}/">게시판</a></li>
								<li><a href="${pageContext.request.contextPath}/">문의 사항</a></li>
								<c:choose>
									<c:when test="${login_info != null && login_info.mid != null}">
										<li><a href="${pageContext.request.contextPath}/index/left-sidebar"> 마이 페이지 </a></li>
										<li>${login_info.mid}</li>
										<li><a href="${pageContext.request.contextPath}/logout"> LOGOUT </a></li>
									</c:when>
									<c:otherwise>
										<li><a href="${pageContext.request.contextPath}/login/login_form"> 로그인 </a></li>
										<li><a href="${pageContext.request.contextPath}/join/join_form"> 회원가입 </a></li>
									</c:otherwise>
								</c:choose>
							</ul>
						</nav>

				</div>

</body>
</html>