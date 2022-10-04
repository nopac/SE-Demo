package com.example.demo.daomain;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.Users;
import com.example.demo.mapper.UsersMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class UsersTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void testCheck(){
        System.out.println("-------测试查询所有用户-------");
        List<Users> usersList=usersMapper.selectList(null);
        System.out.println("共"+usersList.size()+"人");
        usersList.forEach(System.out::println);
    }
    @Test
    public void testInsert(){
        List<Users> usersList=usersMapper.selectList(null);
        int id=usersList.size()+1;
        Users users = new Users();
        users.setUid(id);
        users.setUname("insert"+id);
        users.setUpsw("123456");

        int result = usersMapper.insert(users);
        System.out.println("insert result"+result);
    }
    @Test
    public void testUpdate(){
        List<Users> usersList=usersMapper.selectList(null);
        int id=usersList.size();
        Users users = new Users();
        users.setUid(+id);
        users.setUname("update"+id);
        users.setUpsw("123456");

        int result = usersMapper.updateById(users);
        System.out.println("update result"+result);
    }
    @Test
    public void testSelect(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("Uname","yy");
        List<Users> usersList = usersMapper.selectByMap(map);
        usersList.forEach(System.out::println);
    }
    @Test
    public void testDeleteByMap(){
        int id=usersMapper.selectList(null).size();
        HashMap<String, Object> map = new HashMap<>();
        map.put("Uid",id);
        int result = usersMapper.deleteByMap(map);
        List<Users> usersList =usersMapper.selectList(null);
        usersList.forEach(System.out::println);
    }
    @Test
    public void testDeleteById(){
        int id=usersMapper.selectList(null).size();
        int result = usersMapper.deleteById("U"+id);
        System.out.println("result="+result);
    }
    @Test
    public void testOrder(){
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("Uid");  //根据id升序排列   降序orderByDesc()略
        usersMapper.selectList(wrapper).forEach(System.out::println);
    }
}
