package com.jd.data.structure;

import com.jd.utils.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:kaichenr
 * @Date:2018/7/30 11:46
 * @Description:通过Object[] 创建树
 **/
public class SimpleTree {

    private SimpleTree root;

    private SimpleTree leftNode;

    private SimpleTree rightNode;

    private Object data;

    private List<SimpleTree> datas;

    public SimpleTree() {
        super();
    }

    public SimpleTree(SimpleTree leftNode, SimpleTree rightNode, Object data) {
        super();
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.data = data;
    }

    public SimpleTree(Object data) {
        this(null, null, data);
    }

    public Object getData() {
        return data;
    }

    public SimpleTree getRoot() {
        return root;
    }

    /**
     * 创建树的方法
     */
    public void createSimple(Object[] objects) {
        datas = new ArrayList<SimpleTree>();
        for (Object o : objects) {
            datas.add(new SimpleTree(o));
        }
        root = datas.get(0);

        for (int i = 0; i < objects.length / 2; i++) {
            datas.get(i).leftNode = datas.get(i * 2 + 1);
            if (i * 2 + 2 < datas.size()) {
                datas.get(i).rightNode = datas.get(i * 2 + 2);
            }
        }
    }

    /**
     * 从节点开始遍历
     */
    public void preOrder(SimpleTree root) {
        if (null != root) {
            System.out.println(root.getData());
            if (null != root.leftNode) {
                System.out.print(" left: " + root.leftNode.getData());
            } else {
                System.out.print(" left: " + null);
            }
            if (null != root.rightNode) {
                System.out.println(" right: " + root.rightNode.getData());
            } else {
                System.out.println(" right: " + null);
            }
            preOrder(root.leftNode);
            preOrder(root.rightNode);
        }
    }

    public SimpleTree getSimpleTree() {
        return this;
    }

    public static void main(String[] args) {
//        Object[] objs = {1, 2};
//        SimpleTree simpleTree = new SimpleTree();
//        simpleTree.createSimple(objs);
//        simpleTree = simpleTree.getSimpleTree();
//        System.out.println(GsonUtil.GsonString(simpleTree));

        Object[] objs = {1, 2, 3};
        SimpleTree simpleTree = new SimpleTree();
        simpleTree.createSimple(objs);
        simpleTree.preOrder(simpleTree.getRoot());
    }


}
