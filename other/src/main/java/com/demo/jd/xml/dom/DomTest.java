package com.demo.jd.xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class DomTest {
    public static void main(String[] args) {

        //使应用程序能够从 XML 文档获取生成 DOM 对象树的解析器
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            //获取一个DocumentBuilder对象
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            //通过parse 将xml转化成document对象
            Document document = documentBuilder.parse(new File("book.xml"));
            //获取所有book的节点
            NodeList nodeList = document.getElementsByTagName("book");
            System.out.println("book节点一共有:"+nodeList.getLength());
            // 遍历节点
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.out.println("开始遍历：第"+(i+1)+"个节点");
                Node node = nodeList.item(i);
                // 获取book 标签的属性
                NamedNodeMap namedNodeMap = node.getAttributes();
                for (int j = 0; j < namedNodeMap.getLength(); j++) {
                    Node attr = namedNodeMap.item(j);
                    //获取属性名
                    System.out.println(attr.getNodeName());
                    //获取值
                    System.out.println(attr.getNodeValue());
                }

                //获取book子节点
                NodeList childNodeList = node.getChildNodes();
                for (int k = 0; k < childNodeList.getLength(); k++) {
                    Node childNode = childNodeList.item(k);
                    //我们需要element类型的node
                    if(childNode.getNodeType() == Node.ELEMENT_NODE){
                        System.out.print("[");
                        System.out.print(childNode.getNodeName());
                        System.out.print(" : ");
                        System.out.print(childNode.getTextContent());
                        System.out.println("]");
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
