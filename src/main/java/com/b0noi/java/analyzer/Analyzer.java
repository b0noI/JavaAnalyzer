package com.b0noi.java.analyzer;


import org.openjdk.jol.info.ClassLayout;

public class Analyzer {

    public static void analyze(final Object instance) {
        final ClassLayout layout = ClassLayout.parseClass(instance.getClass());
        System.out.println(layout.toPrintable(instance));
    }

}
