package com.qf.common;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AlipayUtils {

    /*public   String   pay (HttpServletRequest httpRequest,
                           HttpServletResponse httpResponse, TOrder oder)   throws ServletException, IOException {
        *//**
         * 1.支付时,向支付宝发起请求时请求的地址.
         *//*

        //Double price = book.getPrice();

        //AlipayClient alipayClient =  new DefaultAlipayClient( "https://openapi.alipaydev.com/gateway.do" , APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE);  //获得初始化的AlipayClient
        AlipayClient alipayClient =  new DefaultAlipayClient( "https://openapi.alipaydev.com/gateway.do" ,
                "2021000116661410", "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCNGg/SwXENMlQmVd3EoXQoLnVLgw0t6kTNMgPRtMD+IaNEELJGsmJmWavkmGRAcGLBvFw5qUr9QZu+hGIA8Y5Z05jmXXenZtJimUciVY7aMhn3gnDtkG8z8JQjTJTiKBM807FCC90BxSewXItS5PMtBj6ervZlL3B7bUuTqB5PEaOblCAHMCZ/PDtSKHdhbYhZqwwqJ2yCoUWgOVQMF3JDWlvSRqjtm1meC8+S4ND/wfQiBXG4AwcVgHhvMhotfN/SYsH+CT+ysINU1Gl99pNbhN0rFkZsrMM8iYJKeUAzBJkzQDdPkVsVGQid35jroPTc52BSPqMoBH8mbsNSf75BAgMBAAECggEAaq+Z5zB72g6DsbiaxWGOAhOefEnKXT0UaFG4sYaJpZypZX16ThnybJDAd0cCBfbztKhG0xI9sN86cwKFV1FM4H4szYE+R0RnLkXWkw89w5y+JXZrDDR44Dy2xTnSGG1UnlkxXU66++ul5qMSdMrHUvO1xSVlB3ym/6vTyQEEaaM5GFqiP4XShThmhhghAxj9GusPo6V0N6P0qZAmWAyaHC7Q6Oj1S0hFK3to/9JAwojDETfBfs81K9vUKBgeESyZxqVPgxArugDVrg0bVTiE8PQtT0n4TclitLu72ohbQ9nJ/5X6SF1k2m9r8SDNTmhtZDejH2wR2tC8nd28h68AAQKBgQDhHHhY11VNyxY4d13lJG9IFGv69AbFV1Hp+KBZ5G5fYJfrmrproHexpsJdcERSQ43E2n2rW71Bt+3kTXeWuvpb7kOu4SFnee5tYq3ywZur2Bt56A4dKuPidpqnMNQLOunFhpvASDqAMp99T0BEMCCWTWk44G+vtZUHLj1zocRsAQKBgQCgdpNAJk6kvFuuDXgfMwWwgOKZHLlzr8XUb0fjNy94BFs10ZOF2v9donldqPWZqGYVMJPUS9HHC1HwHN7vWqYAsR/elIRo/ZdE5yRZS+qubbUdJdCoGdnSJubq2yHURps1vn9MoeAA3jysSS8A1gGBypG07FDN4i3hXnkW9QhSQQKBgGnDXYuoCA0XuKXo9zV8a8g6yAzM8A1xnCvIQ1ZYq76l/FqWhLWiW/ocdj8+Sus3j/kICnkjDgU9bEiSWPh5er0MccJNRct/DxVXgpCGhCQ10Zrx+webKhwxSzH4D/gCwuip+K1bghjPL/3I6VHgJr9XOXOehvrP3mfUQsz8GPQBAoGAKV0nrDuzvieIAqAaPQCsEMnIn+uVqsq+1noxL9ND+040LPVvb+v6NCrz2j75wLh2SDQTh4Bb/VFft+PZXB4j+L2wF3J1h5MHcY2cAyDcyEYjj/X1ib/QNKoukJAYcl4ZGIuYySpZUh/3x/m9khuYm9qaIOdiFRCe/x+ZW1+i24ECgYEAkZO1w1pY0AkebOKhqmB1MhBq5fvtIjlFWvm+WMreD4rvPj21/BwGfy/aiYCMKDuoqebM0ClStndE5a6EOB25PEtfZh6vCE7nSU3kmXOJlhIM9gFzxZ7mIn8Xg2a17RbuuArRKWFr6b95oTlM//G1P580/YS0p9mvczj3CgMKjrQ=", "json", "utf-8", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiutZEfuNQcIXBLDMoCEwSsm5jJ755O0nDmaDISD5WuK9KWpT73C3GwBuluOsy+IYz3z2jwTRBpFIe4O4xQLgjJFwKRRXrvCirH9AJmbKhq/lTmujUp722/LHHNeZv3zDpFw3WLTPIVatiajZdIGi/fdB0+MrVdp4OHoaawm42K5viMDXJIQooUcjcTk2FexH7mOZ9rHL90Ul9eSTrmVYWDH+VtLgmu+bE+w8jb94lP2nhPexch0m+VH3xQMdxqlzRNQ4/CKd6m/hDKrUG9tQP/1pQYXMQHBsIHPQp1aVXV8+NiICQhdkzG4uP/RgavqXzg/1WbSTI9a9Q5oImTf1tQIDAQAB", "RSA2");  //获得初始化的AlipayClient
        AlipayTradePagePayRequest alipayRequest =  new  AlipayTradePagePayRequest(); //创建API对应的request
        alipayRequest.setReturnUrl( "http://domain.com/CallBack/return_url.jsp" );
        //alipayRequest.setNotifyUrl( "http://domain.com/CallBack/notify_url.jsp" ); //在公共参数中设置回跳和通知地址
        //alipayRequest.setNotifyUrl( "http://localhost:8080/returnUrl" ); //在公共参数中设置回跳和通知地址
        //alipayRequest.setNotifyUrl( "http://3id5927071.zicp.vip/returnUrl" ); //在公共参数中设置回跳和通知地址
        alipayRequest.setNotifyUrl( "http://lff3222494855.picp.io//returnUrl" ); //在公共参数中设置回跳和通知地址

        *//*Random random = new Random();
        int i = random.nextInt(100);*//*
        //下面的不走在之前的环节中已经实现了
        *//*UUID uuid = UUID.randomUUID();
        String string = uuid.toString();
        String tradno = string.replace("-", "");*//*

        //生成订单信息存储到数据库，默认的订单信息时未支付,订单支付完成后修改为已支付
        alipayRequest.setBizContent( "{"  +
                //"    \"out_trade_no\":\""+tradno+"\","  +
                "    \"out_trade_no\":\""+oder.getTransferId()+"\","  +
                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\","  +
                //"    \"total_amount\":\""+book.getPrice()+"\","  +
                "    \"total_amount\":\""+oder.getTotalMount()+"\","  +
                //"    \"subject\":\""+book.getBookName()+"\","  +
                "    \"subject\":\"aaa\","  +
                //"    \"body\":\""+book.getBookDesc()+"\","  +
                "    \"body\":\"aaaa\","  +
                "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\","  +
                "    \"extend_params\":{"  +
                "    \"sys_service_provider_id\":\"2088511833207846\""  +
                "    }" +
                "  }" ); //填充业务参数
        String form= "" ;
        try  {
            form = alipayClient.pageExecute(alipayRequest).getBody();  //调用SDK生成表单
        }  catch  (AlipayApiException e) {
            e.printStackTrace();
        }
        //httpResponse.setContentType( "text/html;charset="  + CHARSET);
        httpResponse.setContentType( "text/html;charset=UTF-8");
        *//*httpResponse.getWriter().write(form); //直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();*//*
        return form;
    }*/

}
