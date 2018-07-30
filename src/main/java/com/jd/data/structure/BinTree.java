package com.jd.data.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:kaichenr
 * @Date:2018/7/30 11:00
 * @Description:
 **/
public class BinTree {

    // 左子节点
    private BinTree leftNode;

    // 右子节点
    private BinTree rightNode;

    // 根节点
    private BinTree root;

    // 数据域
    private Object data;

    // 存储所有的节点
    private List<BinTree> datas;

    public BinTree(BinTree leftNode, BinTree rightNode, Object data) {
        super();
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.data = data;
    }

    public BinTree(Object data) {
        this(null, null, data);
    }

    public BinTree() {
        super();
    }

    public BinTree getRoot() {
        return root;
    }

    public Object getData() {
        return data;
    }

    public void createTree(Object[] objects){
        datas = new ArrayList<BinTree>();
        for (Object o : objects){
            datas.add(new BinTree(o));
        }
        //第一个作为根节点
        root = datas.get(0);
        for (int i = 0; i < objects.length/2; i++) {
            datas.get(i).leftNode = datas.get(i*2 +1);
            if(i*2 +2 < datas.size()){
                datas.get(i).rightNode = datas.get(i*2 +2);
            }
        }
    }

    //先许
    public void preOrder(BinTree root){
        if(null != root){
            visit(root.getData());
            preOrder(root.leftNode);
            preOrder(root.rightNode);
        }
    }

    //中序遍历
    public void inorder(BinTree root){
        if(root!=null){
            inorder(root.leftNode);
            visit(root.getData());
            inorder(root.rightNode);
        }

    }
    //后序遍历
    public void afterorder(BinTree root) {
        if (root != null) {
            afterorder(root.leftNode);
            afterorder(root.rightNode);
            visit(root.getData());
        }
    }

    public void visit(Object o){
        System.out.println(o+" ");
    }

    public static void main(String[] args) {
        BinTree binTree = new BinTree();
        Object[] objs = {1,2,3,4,5,6,7};
        binTree.createTree(objs);
        binTree.preOrder(binTree.getRoot());
    }

}
