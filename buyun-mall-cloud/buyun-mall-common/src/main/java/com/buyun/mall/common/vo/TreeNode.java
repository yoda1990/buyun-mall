package com.buyun.mall.common.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TreeNode
 * @Description: 树节点操作
 * @Author: hmily
 * @Date: 2020/5/3 13:13
 * @Version: 1.0
 */
public class TreeNode {
    protected int id;
    protected int parentId;

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    List<TreeNode> children = new ArrayList<TreeNode>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void add(TreeNode node){
        children.add(node);
    }
}
