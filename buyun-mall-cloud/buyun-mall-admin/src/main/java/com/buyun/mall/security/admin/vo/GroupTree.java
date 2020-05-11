package com.buyun.mall.security.admin.vo;


import com.buyun.mall.common.vo.TreeNode;

/**
 * @ClassName GroupTree
 * @Description
 * @Author hmily
 * @Date 2020/5/11 20:41
 * @Version 1.0
 */
public class GroupTree extends TreeNode {
    String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
