package com.ymu.service.fileclient.api;

import com.abs.infrastructure.spring.mvc.sensitive.SensitiveFormat;
import com.ymu.service.fileclient.vo.req.VTestReq;
import com.ymu.service.fileclient.vo.resp.VTestResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能简述:<br>
 *  测试demo。注意，说有的请求参数必须定义vo，返回值也定义vo并继承VBase
 *
 * @author zmt
 * @create 2018-03-07 下午2:47
 * @updateTime
 * @since 1.0.0
 */
@RequestMapping("/test")
public interface TestApi {

    @PostMapping
    VTestResp test(@RequestBody VTestReq vTestReq);

    //改请求无效
    @GetMapping("/test2")
    String test2(String name);
}