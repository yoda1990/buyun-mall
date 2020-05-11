package com.buyun.mall.security.admin.rest;

import com.buyun.mall.common.rest.BaseController;
import com.buyun.mall.security.admin.biz.MenuBiz;
import com.buyun.mall.security.admin.biz.UserBiz;
import com.buyun.mall.security.admin.entity.Menu;
import com.buyun.mall.security.admin.entity.User;
import com.buyun.mall.security.admin.rpc.service.PermissionService;
import com.buyun.mall.security.admin.vo.FrontUser;
import com.buyun.mall.security.admin.vo.MenuTree;
import com.buyun.mall.security.auth.client.annotation.IgnoreClientToken;
import com.buyun.mall.security.auth.client.annotation.IgnoreUserToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName UserController
 * @Description 用户 控制器
 * @Author hmily
 * @Date 2020/5/11 20:41
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseController<UserBiz, User> {
    @Autowired
    private PermissionService permissionService;

    @Autowired
    private MenuBiz menuBiz;

    @RequestMapping(value = "/front/info", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getUserInfo(String token) throws Exception {
        FrontUser userInfo = permissionService.getUserInfo(token);
        if(userInfo==null) {
            return ResponseEntity.status(401).body(false);
        } else {
            return ResponseEntity.ok(userInfo);
        }
    }

    @RequestMapping(value = "/front/menus", method = RequestMethod.GET)
    public @ResponseBody
    List<MenuTree> getMenusByUsername(String token) throws Exception {
        return permissionService.getMenusByUsername(token);
    }

    @RequestMapping(value = "/front/menu/all", method = RequestMethod.GET)
    public @ResponseBody
    List<Menu> getAllMenus() throws Exception {
        return menuBiz.selectListAll();
    }

    @GetMapping("/names")
    @IgnoreUserToken
    @IgnoreClientToken
    public Map<Integer,String> getUserNames(){
        return this.all().stream().collect(Collectors.toMap(item->item.getId(),item->item.getName()));
    }
}
