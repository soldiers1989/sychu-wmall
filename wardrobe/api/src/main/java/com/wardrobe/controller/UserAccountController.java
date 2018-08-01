package com.wardrobe.controller;

import com.wardrobe.common.bean.ResponseBean;
import com.wardrobe.common.bean.UserPerfectBean;
import com.wardrobe.common.constant.IPlatformConstant;
import com.wardrobe.common.enum_.MobileMessageEnum;
import com.wardrobe.common.exception.MessageException;
import com.wardrobe.controller.annotation.UserPerfect;
import com.wardrobe.platform.service.IUserAccountService;
import com.wardrobe.platform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("account")
@Controller
public class UserAccountController extends BaseController {

    @Autowired
    private IUserAccountService userAccountService;

    /*
     * 用户账户余额
     */
    @ResponseBody
    @RequestMapping("userAccountBalance")
    public ResponseBean userAccountBalance(){
        userAccountService.getUserAccount(getUserId());
        return new ResponseBean(true);
    }

}











