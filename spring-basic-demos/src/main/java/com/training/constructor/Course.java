package com.training.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Course {
private String courseName;
private String fees;
public String getCourseName() {
	return courseName;
}
@Value("Springs")
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getFees() {
	return fees;
}
@Value("20000")
public void setFees(String fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "Course [courseName=" + courseName + ", fees=" + fees + "]";
}

}
