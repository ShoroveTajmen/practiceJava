package com.practice.test_1;

public class TestT {
    String defVar = "default variable";
    public String pubVar = "public variable";
    private String priVar = "private variable";
    protected String proVar = "protected variable";

    public String getPriVar(){
        return this.priVar;
    }

    public void addStringToPriVar(String addString) {
        this.priVar = this.priVar + addString;
    }
}
