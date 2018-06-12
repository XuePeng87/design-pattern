package cc.xuepeng.test;

import cc.xuepeng.example01.HttpResultEntity;
import cc.xuepeng.example01.HttpResultStatus;
import cc.xuepeng.example01.User;
import cc.xuepeng.example01.UserService;
import org.junit.Assert;
import org.junit.Test;

public class TestBuilder {

    @Test
    public void testAddUser() {
        UserService userService = new UserService();
        HttpResultEntity result = userService.addUser();
        Assert.assertEquals(HttpResultStatus.OK, result.getStatus());
        Assert.assertEquals("Success", result.getMsg());
        Assert.assertNull(result.getData());
    }

    @Test
    public void testGetUser() {
        UserService userService = new UserService();
        HttpResultEntity result = userService.getUser();
        Assert.assertEquals(HttpResultStatus.OK, result.getStatus());
        Assert.assertEquals("Jack", ((User) result.getData()).getName());
        Assert.assertNull(result.getMsg());
    }

}
