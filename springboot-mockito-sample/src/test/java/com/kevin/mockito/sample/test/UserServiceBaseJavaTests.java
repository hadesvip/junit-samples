package com.kevin.mockito.sample.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.kevin.mockito.sample.contoller.UserController;
import com.kevin.mockito.sample.domain.dto.UserDTO;
import com.kevin.mockito.sample.domain.vo.UserVO;
import com.kevin.mockito.sample.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceBaseJavaTests {


  @Mock
  private UserService userService;

  @InjectMocks
  private UserController userController;


  @Before
  public void init() {
    MockitoAnnotations.initMocks(this);
  }


  @Test
  public void getUserServiceTest() {

    when(userService.getUser(anyString())).thenReturn(new UserDTO(1, "张三"));
    UserDTO userDTO = userService.getUser(anyString());
    Assert.assertNotNull(userDTO);
    Assert.assertEquals(userDTO.getId(), 1);
    Assert.assertEquals(userDTO.getName(), "张三");

    when(userService.getUser("2")).thenReturn(new UserDTO(21, "张三"));
    userDTO = userService.getUser("2");
    verify(userService, Mockito.times(1)).getUser(Mockito.eq("2"));


  }

  @Test
  public void getUserControllerTest() {
    when(userService.getUser("5")).thenReturn(new UserDTO(5, "李四"));
    UserVO userVO = userController.getUser("5");
    UserDTO userDTO = userService.getUser("5");
    assertEquals(userVO.getId(), userDTO.getId());
    assertEquals(userVO.getName(), userDTO.getName());

  }


}
