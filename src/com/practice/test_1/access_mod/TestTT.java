package com.practice.test_1.access_mod;

public class TestTT {
    String defVar = "default variable";
    public String pubVar = "public variable";
    private String priVar = "private variable";
    protected String proVar = "protected variable";


    public String getDefVar(){
        return this.defVar;
    }

    public String getPubVar(){
        return this.pubVar;
    }

    public String getProVar(){
        return this.proVar;
    }
}
