package com.demo.jd.data.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:kaichenr
 * @Date:2018/7/30 17:09
 * @Description: 中间会存在空值(会给null值)
 **/
public class NullTree {

    private NullTree root;
    private NullTree leftNode;
    private NullTree rightNode;
    private Object data;
    private List<NullTree> datas;

    public NullTree(NullTree leftNode, NullTree rightNode, Object data) {
        super();
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.data = data;
    }

    public NullTree(Object data) {
        this(null, null, data);
    }

    public NullTree() {
        super();
    }

    public Object getData() {
        return data;
    }

    /**
     * 创建树
     */
    public void createTree(Object[] objects) {
        if (objects.length == 0) {
            return;
        }
        datas = new ArrayList<NullTree>();
        for (Object o : objects) {
            datas.add(new NullTree(o));
        }
        root = datas.get(0);

        for (int i = 0; i < datas.size() / 2; i++) {
            if (null != datas.get((i * 2 + 1))) {
                datas.get(i).leftNode = datas.get(i * 2 + 1);
            } else {
                datas.get(i).leftNode = null;
            }
            if ((i * 2 + 2) < datas.size() && null != datas.get(i * 2 + 2)) {
                datas.get(i).rightNode = datas.get(i * 2 + 2);
            } else {
                datas.get(i).rightNode = null;
            }
        }
    }

    public NullTree getNullTree() {
        return this;
    }

    public NullTree getRoot() {
        return root;
    }

    public void setRoot(NullTree root) {
        this.root = root;
    }

    /**
     * 从节点开始遍历
     */
    public void preOrder(NullTree root) {
        if (null != root && null != root.getData()) {
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

    public static void main(String[] args) {
        Object[] objs = {1, 2, null, 3, 4};
        NullTree nullTree = new NullTree();
        nullTree.createTree(objs);
//        nullTree = nullTree.getNullTree();
//        System.out.println(GsonUtil.GsonString(nullTree));

        nullTree.preOrder(nullTree.getRoot());
    }

}
