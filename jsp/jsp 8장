# 8장 자바빈즈

score.jsp
<jsp:setProperty.. /> 에서 이용하는 속성은 name, property, param, value
<jsp:getProperty.. /> 에서 이용하는 속성은 name, property


<h2> JavaBeans를 이용한 학생의 이름와 성적의 저장과 조회 예제</h2>
	<jsp:useBean id="score" class="javabean.ScoreBean" scope ="page" />
	
	<HR>
	<h3> 이름과 성적을 javaBeans ScoreBean에 저장</h3><p>
	이름 : <%= "김성민" %>
	성적 : <%= "85" %>
	<jsp:setProperty name = "score" property= "name" value = "김성민"/>
	<jsp:setProperty name = "score" property= "point" value = "85"/>
	
	<HR>
	<jsp:getProperty name = "score" property= "name" /><br>
	<jsp:getProperty name = "score" property= "point" /><br>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

package javabean;

public class GradeBean {
	private String name;
	private int point;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//성적의 학점을 계산하는 메소드는 직접 구현
	public String getGrade() {
		String grade = "";
		if (point >=90)
			grade = "A";
		else if (point >=80)
			grade = "B";
		else if (point >=70)
			grade = "C";
		else if (point >=60)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}


grade.html
<h2> 이름과 점수를 입력하세요</h2>
	<form method =post action = grade.jsp>
	이름 : <input type = text name = name size = 16> <br>
	점수 : <input type = text name = point size = 3> <p>
	<input type = "submit" value = "입력완료" >
	<input type = "reset" value = "다시쓰기">
	</form>

grade.jsp
<h2> JavaBeans를 이용한 학생의 이름와 성적의 저장과 조회 예제</h2>
	<jsp:useBean id="score" class="javabean.GradeBean" scope ="page" />
	
	<HR>
	<h3> 이름과 성적을 javaBeans ScoreBean에 저장</h3><p>
	이름 : <%= request.getParameter("name") %>
	성적 : <%= request.getParameter("point") %>
	<jsp:setProperty name = "score" property= "name" param = "name"/>
	<jsp:setProperty name = "score" property= "point" param = "point"/>
	
	<HR>
	<jsp:getProperty name = "score" property= "name" /><br>
	<jsp:getProperty name = "score" property= "point" /><br>
	<jsp:getProperty name = "score" property= "grade" /><br>

