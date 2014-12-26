package com.b0noi.java.analyzer;


import org.testng.annotations.Test;

import java.sql.Time;

public class AnalyzerTest {

    @Test
    public void testAnalyze() throws Exception {
        // input arguments

        // mocks

        // expected results

        // creating test instance

        // execution test
        Thread.sleep(5100);
        final Test1 test1 = new Test1();
        Analyzer.analyze(test1);
        synchronized (test1) {
            Analyzer.analyze(test1);
        }
        Analyzer.analyze(test1);

        // result assert

        // mocks verify

        //  unused:25 hash:31 -->| unused:1   age:4    biased_lock:1 lock:2 (normal object)
        //  JavaThread*:54 epoch:2 unused:1   age:4    biased_lock:1 lock:2 (biased object)
        //  PromotedObject*:61 --------------------->| promo_bits:3 ----->| (CMS promoted object)
        //  size:64 ----------------------------------------------------->| (CMS free block)
        //
        //  unused:25 hash:31 -->| cms_free:1 age:4    biased_lock:1 lock:2 (COOPs && normal object)
        //  JavaThread*:54 epoch:2 cms_free:1 age:4    biased_lock:1 lock:2 (COOPs && biased object)
        //  narrowOop:32 unused:24 cms_free:1 unused:4 promo_bits:3 ----->| (COOPs && CMS promoted object)
        //  unused:21 size:35 -->| cms_free:1 unused:7 ------------------>| (COOPs && CMS free block)

        // JavaThread*:54 epoch:2 unused:1   age:4    biased_lock:1 lock:2 (biased object)
        // 7 * 8 = 56
    }

    private static class Test1 {

        int a;

        int b;

    }

}