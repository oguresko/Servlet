<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="FirstServlet.jsp">
Imie:<br>
<input type="text" name="name" ><br>
Nazwisko:<br>
<input type="text" name="surname" ><br>
Email:<br>
<input type="text" name="email" ><br>
Potwierdz Email:<br>
<input type="text" name="email1" ><br>
Nazwa Pracodawcy:<br>
<input type="text" name="employer" ><br>
Skąd dowiedziałeś się o konferencji?:<br>
<input type="radio"  name=vote value="ad1"><b>Ogłoszenie w pracy</b><br>
<input type="radio"  name=vote value="ad2"><b>Ogłoszenie na uczelni</b><br>
<input type="radio"  name=vote value="facebook"><b>Facebook</b><br>
<input type="radio"  name=vote value="friends"><b>Znajomi</b><br>
<input type="radio"  name=vote value="else"><b>Inne</b><br>
Czym sie zajmuje?:<br>
<input type="text" name="job" ><br>
<input type="submit" value="Już"  name="voting">  
 

</form>

</body>
</html>