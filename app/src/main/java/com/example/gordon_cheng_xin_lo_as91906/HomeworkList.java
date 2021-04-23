package com.example.gordon_cheng_xin_lo_as91906;

public class HomeworkList {
    private String Data;
    private String ClassName;
    private String Name;
    private String Information;

    public HomeworkList(String Data,String ClassName, String Name, String Information){
        this.Data = Data;
        this.ClassName = ClassName;
        this.Name = Name;
        this.Information = Information;
    }



    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    @Override
    public String toString() {
        return "HomeworkList{" +
                "Data='" + Data + '\'' +
                ", ClassNmae='" + ClassName + '\'' +
                ", Name='" + Name + '\'' +
                ", Information='" + Information + '\'' +
                '}';
    }
}
