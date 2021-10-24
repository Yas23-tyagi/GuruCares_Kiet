package com.example.gurucares.modelclass;

public class subject_model {

   // private static String cardcolor;
    private String subjectname;
    private String facultyname;
    private String cardcolor;
    private String imageurl;


    public subject_model()
    {

    }

    public subject_model(String subjectname)
    {
        this.subjectname = subjectname;
    }

    public subject_model(String subjectname, String facultyname) {
        this.subjectname = subjectname;
        this.facultyname = facultyname;

    }

    public subject_model(String subjectname, String facultyname, String cardcolor, String imageurl) {
        this.subjectname = subjectname;
        this.facultyname = facultyname;
        this.cardcolor = cardcolor;
        this.imageurl = imageurl;


    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getCardcolor() {
        return cardcolor;
    }



    public void setCardcolor(String cardcolor) {
        this.cardcolor = cardcolor;
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }




}

