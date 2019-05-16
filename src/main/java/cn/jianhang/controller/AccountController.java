package cn.jianhang.controller;

import cn.jianhang.entity.Account;

import cn.jianhang.service.AccountInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountInterfaces accountInterfaces;

    /**
     * 查询成员不需要条件
     * 返回全部结果
     *
     * @return
     */
    @RequestMapping(value = "/one", method = RequestMethod.GET)
    public List<Account> allAccount() {
        return accountInterfaces.findAllAccount();
    }

}
