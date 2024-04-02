package com.pentoryall.user.mapper;

import com.pentoryall.user.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO findByUserId(String userId);

    String selectUserById(String userId);

    int insertUser(UserDTO user);

    int updateUser(UserDTO modifyUser);

    int deleteUser(UserDTO user);

    UserDTO getUserInformationByUserCode(long userCode);

    String getPwd(long code);

    void updatePointByUserCode(UserDTO user);

    List<UserDTO> getUserListByWord(String word);
}