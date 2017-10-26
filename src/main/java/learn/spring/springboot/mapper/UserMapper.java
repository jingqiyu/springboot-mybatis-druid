package learn.spring.springboot.mapper;

import learn.spring.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserById(int userId);
}
