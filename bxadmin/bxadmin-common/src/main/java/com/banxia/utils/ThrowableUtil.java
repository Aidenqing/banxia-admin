package com.banxia.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 12:44 2020/8/25
 */
public class ThrowableUtil {

    public static String getStackTrace(Throwable throwable){
        StringWriter sw = new StringWriter();
        try (PrintWriter pw = new PrintWriter(sw)) {
            throwable.printStackTrace(pw);
            return sw.toString();
        }
    }
}
