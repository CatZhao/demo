package com.zxx.zxxboot.mapper;

import com.zxx.zxxboot.bean.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public List<User> queryByName(String name);


}
