package com.mrchengs.mvc.controller;


import com.mrchengs.mvc.annotation.*;
import com.mrchengs.mvc.annotation.MyRequestMapping;
import com.mrchengs.mvc.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@MyController
@MyRequestMapping("/test")
public class TestController {



    @MyRequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response,
                      @MyRequestParam("param") String param){
        System.out.println(param);
        try {
            response.getWriter().write( "doTest method success! param:"+param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @MyRequestMapping("/doTest2")
    public String test2(HttpServletRequest request, HttpServletResponse response){
        System.out.println("2222");
        int  a =20;

        return "1111111";
    }


}
