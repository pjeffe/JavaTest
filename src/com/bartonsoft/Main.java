package com.bartonsoft;

import java.io.File;
import java.io.FileNotFoundException;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.printer.YamlPrinter;

import com.bartonsoft.test1.*;

public class Main {
    public static void test() {
        ImportTest.method();
        try {
            final CompilationUnit cu = JavaParser.parse(new File("D:/git/JavaTest/src/com/bartonsoft/Test.java"));
            YamlPrinter printer = new YamlPrinter(true);
            System.out.println(printer.output(cu));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        test();
    }
}
