package com.ifox.springbootjwt.api;

import com.ifox.springbootjwt.api.model.BaseResponse;
import com.ifox.springbootjwt.api.model.UnbindParam;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:14 2018/4/9
 * @Modified By:
 */
@RestController
@RequestMapping(value = "/notify")
public class NotifyController {

    private static final Logger _logger = LoggerFactory.getLogger(NotifyController.class);

    @PostMapping("/unbind")
    @RequiresUser
    public BaseResponse unbind(@RequestHeader(name="Content-Type", defaultValue = "application/json") String contentType,
                               @RequestHeader(name="Authorization", defaultValue="token") String token,
                               @RequestBody UnbindParam unbindParam) {
        _logger.info("解绑通知接口start");
        return new BaseResponse<>(true, "解绑通知发送成功", null);
    }

}
