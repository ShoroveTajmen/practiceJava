package com.practice.test_1;

import com.practice.test_1.access_mod.*;

public class Test {
    public static void main(String[] args){
        TestT testT = new TestT();

        System.out.println("Default: "+ testT.defVar);
        System.out.println("Public: "+ testT.pubVar);
        System.out.println("private: "+ testT.getPriVar());
        System.out.println("protected: "+testT.proVar);

        testT.defVar = testT.defVar + "AAA";
        testT.addStringToPriVar("BBB");

        TestTT testTT = new TestTT();

        System.out.println("Default: "+ testTT.getDefVar());
        System.out.println("Public: "+ testTT.pubVar);
        System.out.println("private: "+ testTT.getPubVar());
        System.out.println("protected: "+testTT.getProVar());
    }
}
