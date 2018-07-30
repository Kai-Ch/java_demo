package com.jd.data.structure;

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

    public NullTree(Object data){
        this(null, null, data);
    }

    /**
     * 创建树
     */
    public void createTree(Object[] objects){
        if(objects.length == 0){
            return;
        }
        datas = new ArrayList<NullTree>();
        for(Object o : objects){
            datas.add(new NullTree(o));
        }
        root = datas.get(0);

        for (int i = 0; i < datas.size()/2; i++) {

        }
    }

}
