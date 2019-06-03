package tech.veedo.pastoral.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * 爬虫测试 jsoup fail
 * 不能获取AJAX
 */
public class SpiderTest {
    private static OutputStream os;

    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.lagou.com/jobs/list_?labelWords=&fromSearch=true&suginput=").get();
			System.out.println(doc.title()); //CSDN-专业IT技术社区
            //把文章标题和连接写入txt文件
            Element postlist_id = doc.getElementById("s_position_list");
            Element ul = postlist_id.prependElement("ul.item_con_list");
            Elements posts = ul.select("li");
            //指定文件名及路径
            File file = new File("D:\\test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            //写入本地
            PrintWriter pw = new PrintWriter("D:\\test.txt","UTF-8");
            for (Element post : posts) {
                pw.println(post.html());
                pw.println(post.attr("data-positionname"));
                pw.println("------------------------------------------------------------------------------------------------------------------------------------");
            }
            pw.close(); //关闭输出流
//            //获取页面上的图片保存到本地
//            Elements imgs = doc.select("img[src$=.png]");
//            for (Element element : imgs) {
//                String img = element.attr("src");
//                String url = "http:"+img;
//                System.out.println(url);
//                System.out.println(url.indexOf("csdn"));
//                if (url.indexOf("csdn")==-1) {
//                    continue;
//                }
//                URL u = new URL(url);
//                URLConnection uc=u.openConnection();
//                //获取数据流
//                InputStream is=uc.getInputStream();
//                //获取后缀名
//                String imageName = img.substring(img.lastIndexOf("/") + 1,img.length());
//                //写入本地
//                os = new FileOutputStream(new File("E:\\jsoup\\img", imageName));
//                byte[] b = new byte[1024];
//                int i=0;
//                while((i=is.read(b))!=-1){
//                    os.write(b, 0, i);
//                }
//                is.close();
//                os.close();
//            }
            System.out.println("完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
