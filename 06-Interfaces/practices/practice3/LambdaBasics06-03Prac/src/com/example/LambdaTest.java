package com.example;

public class LambdaTest {

    public static void main(String[] args) {
        String[] strList01
                = {"tomorrow", "toto", "to", "timbukto", "the", "hello", "heat"};

        AnalyzerTool stringTool;
        stringTool = new AnalyzerTool();
        String searchStr = "to";

        System.out.println("Searching for: " + searchStr);

        System.out.println("==Contains==");
        stringTool.showResult(strList01, searchStr,
                (t, s) -> t.contains(s));

        System.out.println("==Starts With==");
        stringTool.showResult(strList01, searchStr,
                (t, s) -> t.startsWith(s));

        System.out.println("==Equals==");
        stringTool.showResult(strList01, searchStr,
                (t, s) -> t.equals(s));

        System.out.println("==Ends With==");

        StringAnalyzer analizer = (t, s) -> t.endsWith(s);
        stringTool.showResult(strList01, searchStr, analizer);

        System.out.println("==Less than 5==");
        analizer = (t, s) -> t.contains(s) && t.length() < 5;
        stringTool.showResult(strList01, searchStr, analizer);
        // Your Code here

        System.out.println("==Greater than 5==");
        analizer = (t, s) -> t.contains(s) && t.length() > 5;
        stringTool.showResult(strList01, searchStr, analizer);
        // Your code here
    }
}
