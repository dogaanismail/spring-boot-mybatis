package com.techprimers.mybatis.springbootmybatis.resource;

import com.techprimers.mybatis.springbootmybatis.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResources {

    @GetMapping("all")
    public List<Users> getAll(){
        return null;
    }

}
