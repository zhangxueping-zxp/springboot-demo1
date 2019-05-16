package cn.jianhang.service.serviceImpl;

import cn.jianhang.dao.AccountMapper;
import cn.jianhang.entity.Account;
import cn.jianhang.service.AccountInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountinterfacesImpl implements AccountInterfaces {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAllAccount() {
        return accountMapper.findAllAccount();
    }
}
