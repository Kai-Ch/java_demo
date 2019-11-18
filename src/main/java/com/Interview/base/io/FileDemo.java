package com.Interview.base.io;

import org.junit.Test;

import java.io.*;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/9/6 13:46
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {
        FileDemo fileDemo = new FileDemo();
//        fileDemo.write("E:/File/a.txt", "hello world!");


    }

    public void write(String path, String content) throws IOException {
        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        OutputStream outputStream = new FileOutputStream(file);

        try {
            outputStream.write(content.getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        outputStream.close();
    }

    /**
     * 一个字节字节读取
     */
    @Test
    public void testReadFile() {
        try {
            InputStream in = new FileInputStream("a.txt");
            try {
                int temp;
                while ((temp = in.read()) != -1) {
                    System.out.print((char) temp);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 分段读取
     */
    @Test
    public void testReadFileLine() {
        InputStream in = null;
        try {
            in = new FileInputStream("a.txt");
            try {
                byte[] car = new byte[3];
                int len = 0; //返回的数据的长度
                while ((len = in.read(car)) != -1) {
                    // 字节数组到字符串解码
                    String str = new String(car, 0, len);
                    System.out.print(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 写
     */
    @Test
    public void writeFile() {
        // 1. 创建源
        File file = new File("dest.txt");
        // 2.选择流
        OutputStream os = null;

        try {
            os = new FileOutputStream(file, true);
            // 3. 操作
            String msg = "io easy\r\n";
            byte[] datas = msg.getBytes();
            os.write(datas, 0, datas.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCopy() {
        // 1.选择源
        File src = new File("E:/File/b.jpg");  // 源文件
        File desk = new File("dest.jpg"); // 目标文件

        // 2.选择流
        InputStream in = null;
        OutputStream out = null;

        // 3.操作
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(desk, true);

            byte[] datas = new byte[1024];
            int len;
            while ((len = in.read(datas)) != -1) {
                out.write(datas, 0, datas.length);
                out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 4.释放资源，先打开后关闭
                if (null != out) {
                    out.close();
                }
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * fileReader
     */
    @Test
    public void testFileReader(){
        // 1.选择源
        File file = new File("a.txt");
        // 2.选择流
        Reader reader = null;
        try {
            // 3.操作
            reader = new FileReader(file);
            char[] datas = new char[1024];
            int len;
            if((len=reader.read(datas))!=-1){
                System.out.println(new String(datas, 0, datas.length));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != reader){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * fileWriter
     */
    @Test
    public void testFileWriter(){
        // 1.选择源
        File file = new File("a.txt");
        // 2.选择流
        Writer writer = null;
        try {
            // 3.操作
            writer = new FileWriter(file, true);
            String msg = "\n貔鸹貔鸹貔鸹貔鸹貔鸹貔鸹貔鸹貔鸹貔鸹貔鸹貔鸹貔鸹！";
            writer.append(msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != writer){
                try {
                    // 4.关闭流，关闭前先刷新
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
