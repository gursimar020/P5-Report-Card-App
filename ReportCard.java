package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

/**
 * ReportCard
 * There are 5 subjects with grading creteria given below,
 * 91-->Grade-->A1-->10
 * 81-90-->Grade-->A2-->9
 * 71-80-->Grade-->B1-->8
 * 61-70-->Grade-->B2-->7
 * 51-60-->Grade-->C1-->6
 * 41-50-->Grade-->C2-->5
 * 33-40-->Grade-->D-->4
 * Below 33-->Grade-->E1-->(0)
 */


public class ReportCard {
    private String studentName;
    final private int NUMBER_OF_SUBJECTS = 5;

    /*5 subjects to store marks for*/
    /**
     * Variable used to store marks
     * marksScience
     * marksMaths
     * marksEnglish
     * marksComputer
     * marksSports
     */
    private float marksScience;
    private float marksMaths;
    private float marksEnglish;
    private float marksComputer;
    private float marksSports;

    private int gradePointArray[] = new int[NUMBER_OF_SUBJECTS];
    private String gradeArray[] = new String[NUMBER_OF_SUBJECTS];

    /* The Final CGPA of the student*/
    private float CGPA;

    /**
     * Constructor for the ReportCard class
     * The constructor Initializes marks as 0 for all subjects until the marks are added by a teacher
     * The name for student report card
     */

    public ReportCard(String studentName) {
        this.studentName = studentName;
        setScienceMarks(0);
        setMathsMarks(0);
        setEnglishMarks(0);
        setComputerMarks(0);
        setSportsMarks(0);
    }

    //Marks for Science

    public void setScienceMarks(float marks) {
        this.marksScience = marks;
        gradePointArray[0] = getGradePoint(marks);
        gradeArray[0] = getGrade(gradePointArray[0]);
    }

    //Marks for Maths

    public void setMathsMarks(float marks) {
        this.marksMaths = marks;
        gradePointArray[1] = getGradePoint(marks);
        gradeArray[1] = getGrade(gradePointArray[1]);
    }

    /**
     * Marks for the English
     */
    public void setEnglishMarks(float marks) {
        this.marksEnglish = marks;
        gradePointArray[2] = getGradePoint(marks);
        gradeArray[2] = getGrade(gradePointArray[2]);
    }

    /**
     * Marks for Computer
     */
    public void setComputerMarks(float marks) {
        this.marksComputer = marks;
        gradePointArray[3] = getGradePoint(marks);
        gradeArray[3] = getGrade(gradePointArray[3]);
    }

    /**
     * Marks for Sports
     */
    public void setSportsMarks(float marks) {
        this.marksSports = marks;
        gradePointArray[4] = getGradePoint(marks);
        gradeArray[4] = getGrade(gradePointArray[4]);
    }

    /**
     * Gets the marks for SCIENCE
     */
    public float getMarksScience() {
        return marksScience;
    }

    /**
     * Gets the marks for MATHS
     */
    public float getMarksMaths() {
        return marksMaths;
    }

    /**
     * Gets the marks for ENGLISH
     */
    public float getMarksEnglish() {
        return marksEnglish;
    }

    /**
     * Gets the marks for COMPUTER
     */
    public float getMarksComputer() {
        return marksComputer;
    }

    /**
     * Gets the marks for SPORTS
     */
    public float getMarksSports() {
        return marksSports;
    }

    /**
     * Return Grade Point
     */
    private int getGradePoint(float marks) {
        if (marks >= 90 && marks < 100) {
            return 10;
        } else if (marks >= 80 && marks < 90) {
            return 9;
        } else if (marks >= 70 && marks < 80) {
            return 8;
        } else if (marks >= 60 && marks < 70) {
            return 7;
        } else if (marks >= 50 && marks < 60) {
            return 6;
        } else if (marks >= 40 && marks < 50) {
            return 5;
        } else if (marks >= 33 && marks < 40) {
            return 4;

        } else {
            return 0;
        }
    }

    /**
     * Return Grade
     */
    private String getGrade(int gradePoint) {
        switch (gradePoint) {
            case 10:
                return "A1";
            case 9:
                return "A2";
            case 8:
                return "B1";
            case 7:
                return "B2";
            case 6:
                return "C1";
            case 5:
                return "C2";
            case 4:
                return "D";
            default:
                return "E1";
        }
    }

    /**
     * Calculates the marks for the student
     */
    public void calculateCGPA() {
        float cgpa = 0;
        for (int gradePoint : gradePointArray) {
            cgpa += gradePoint;
        }
        cgpa /= 5;
        this.CGPA = cgpa;
    }

    /**
     * Returns the CGPA of the student
     */
    public float getCGPA() {
        return CGPA;
    }

    /**
     * Returns the complete details of the class as a String
     */
    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder("Report Card");
        result.append("\n Student\'s Name :'").append(studentName).append('\'');
        result.append("\n NUMBER OF SUBJECTS :").append(NUMBER_OF_SUBJECTS);
        result.append("\n Marks in Science :").append(marksScience).append(" Grade Point: ").append(gradePointArray[0]).append(" Grade: ").append(gradeArray[0]);
        result.append("\n Marks in Maths :").append(marksMaths).append(" Grade Point: ").append(gradePointArray[1]).append(" Grade: ").append(gradeArray[1]);
        result.append("\n Marks in English :").append(marksEnglish).append(" Grade Point: ").append(gradePointArray[2]).append(" Grade: ").append(gradeArray[2]);
        result.append("\n Marks in Computer :").append(marksComputer).append(" Grade Point: ").append(gradePointArray[3]).append(" Grade: ").append(gradeArray[3]);
        result.append("\n Marks in Sports :").append(marksSports).append(" Grade Point: ").append(gradePointArray[4]).append(" Grade: ").append(gradeArray[4]);
        result.append("\n CGPA :").append(CGPA);
        return result.toString();
    }
}

