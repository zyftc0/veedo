import beans.TestBean;
import com.alibaba.fastjson.JSON;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        List<HashMap<String, String>> testlist = new ArrayList();
//        HashMap<String, String> a1 = new HashMap<>();
//        a1.put("INNER_MEMBER_ID", null);
//        testlist.add(a1);
//        List<String> ims = testlist.stream()
//                .map(a -> a.get("INNER_MEMBER_ID"))
//                .collect(Collectors.toList());
//        System.out.println(ims.size());
//        System.out.println(ims.get(0));
//        System.out.println(ims.size() == 1 && ims.get(0) == null);

//        Double d=Math.ceil((float) 6/5);
//        System.out.println(d.intValue());

//        {
//            String json = "{\n" +
//                    "  \"data\": [\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91610132057147839N\",\n" +
//                    "      \"province\": \"610000\",\n" +
//                    "      \"name\": \"中国铁建股份有限公司西安分公司\",\n" +
//                    "      \"id\": \"4\",\n" +
//                    "      \"shortName\": \"西安分公司\",\n" +
//                    "      \"jigouType\": 1,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"913702030530916208\",\n" +
//                    "      \"province\": \"370000\",\n" +
//                    "      \"name\": \"中国铁建股份有限公司青岛分公司\",\n" +
//                    "      \"id\": \"5\",\n" +
//                    "      \"shortName\": \"青岛分公司\",\n" +
//                    "      \"jigouType\": 1,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91410305MA44FGXR43\",\n" +
//                    "      \"province\": \"410000\",\n" +
//                    "      \"name\": \"中国铁建股份有限公司洛阳分公司\",\n" +
//                    "      \"id\": \"6\",\n" +
//                    "      \"shortName\": \"洛阳分公司\",\n" +
//                    "      \"jigouType\": 1,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91620000082381897A\",\n" +
//                    "      \"province\": \"620000\",\n" +
//                    "      \"name\": \"中国铁建股份有限公司甘肃省分公司\",\n" +
//                    "      \"id\": \"7\",\n" +
//                    "      \"shortName\": \"甘肃省分公司\",\n" +
//                    "      \"jigouType\": 1,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110000100000817X\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中国土木工程集团有限公司\",\n" +
//                    "      \"id\": \"2224\",\n" +
//                    "      \"shortName\": \"土木工程\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91420000179315087R\",\n" +
//                    "      \"province\": \"420000\",\n" +
//                    "      \"name\": \"中铁十一局集团有限公司\",\n" +
//                    "      \"id\": \"954\",\n" +
//                    "      \"shortName\": \"中铁十一局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"911400001100711840\",\n" +
//                    "      \"province\": \"140000\",\n" +
//                    "      \"name\": \"中铁十二局集团有限公司\",\n" +
//                    "      \"id\": \"841\",\n" +
//                    "      \"shortName\": \"中铁十二局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91120116244997951G\",\n" +
//                    "      \"province\": \"120000\",\n" +
//                    "      \"name\": \"中国铁建大桥工程局集团有限公司\",\n" +
//                    "      \"id\": \"2070\",\n" +
//                    "      \"shortName\": \"中国铁建大桥工程\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"913700001630559891\",\n" +
//                    "      \"province\": \"370000\",\n" +
//                    "      \"name\": \"中铁十四局集团有限公司\",\n" +
//                    "      \"id\": \"720\",\n" +
//                    "      \"shortName\": \"中铁十四局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"913100001699534723\",\n" +
//                    "      \"province\": \"310000\",\n" +
//                    "      \"name\": \"中铁十五局集团有限公司\",\n" +
//                    "      \"id\": \"1947\",\n" +
//                    "      \"shortName\": \"中铁十五局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"911100001016367613\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中铁十六局集团有限公司\",\n" +
//                    "      \"id\": \"1633\",\n" +
//                    "      \"shortName\": \"中铁十六局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"911400001100708439\",\n" +
//                    "      \"province\": \"140000\",\n" +
//                    "      \"name\": \"中铁十七局集团有限公司\",\n" +
//                    "      \"id\": \"1278\",\n" +
//                    "      \"shortName\": \"中铁十七局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"9112000010306009X2\",\n" +
//                    "      \"province\": \"120000\",\n" +
//                    "      \"name\": \"中铁十八局集团有限公司\",\n" +
//                    "      \"id\": \"1815\",\n" +
//                    "      \"shortName\": \"中铁十八局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110000122027391R\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中铁十九局集团有限公司\",\n" +
//                    "      \"id\": \"8837\",\n" +
//                    "      \"shortName\": \"中铁十九局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91610000220523065J\",\n" +
//                    "      \"province\": \"610000\",\n" +
//                    "      \"name\": \"中铁二十局集团有限公司\",\n" +
//                    "      \"id\": \"1148\",\n" +
//                    "      \"shortName\": \"中铁二十局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91620000224333621K\",\n" +
//                    "      \"province\": \"620000\",\n" +
//                    "      \"name\": \"中铁二十一局集团有限公司\",\n" +
//                    "      \"id\": \"4101\",\n" +
//                    "      \"shortName\": \"中铁二十一局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"9111000071092227XH\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中铁二十二局集团有限公司\",\n" +
//                    "      \"id\": \"2549\",\n" +
//                    "      \"shortName\": \"中铁二十二局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91510100740338242L\",\n" +
//                    "      \"province\": \"510000\",\n" +
//                    "      \"name\": \"中铁二十三局集团有限公司\",\n" +
//                    "      \"id\": \"4000\",\n" +
//                    "      \"shortName\": \"中铁二十三局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"913100001322024481\",\n" +
//                    "      \"province\": \"310000\",\n" +
//                    "      \"name\": \"中铁二十四局集团有限公司\",\n" +
//                    "      \"id\": \"2358\",\n" +
//                    "      \"shortName\": \"中铁二十四局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"9144000019043049X8\",\n" +
//                    "      \"province\": \"440000\",\n" +
//                    "      \"name\": \"中铁二十五局集团有限公司\",\n" +
//                    "      \"id\": \"2050\",\n" +
//                    "      \"shortName\": \"中铁二十五局集团\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"9111000010228709XY\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中铁建设集团有限公司\",\n" +
//                    "      \"id\": \"1519\",\n" +
//                    "      \"shortName\": \"中铁建设\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110000777052619U\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中国铁建电气化局集团有限公司\",\n" +
//                    "      \"id\": \"4279\",\n" +
//                    "      \"shortName\": \"铁建电气化局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"914404005796688347\",\n" +
//                    "      \"province\": \"440000\",\n" +
//                    "      \"name\": \"中国铁建港航局集团有限公司\",\n" +
//                    "      \"id\": \"2251\",\n" +
//                    "      \"shortName\": \"铁建港航局\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110000660507237J\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中国铁建房地产集团有限公司\",\n" +
//                    "      \"id\": \"549\",\n" +
//                    "      \"shortName\": \"铁建房地产\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91610000224338828L\",\n" +
//                    "      \"province\": \"610000\",\n" +
//                    "      \"name\": \"中铁第一勘察设计院集团有限公司\",\n" +
//                    "      \"id\": \"4463\",\n" +
//                    "      \"shortName\": \"中铁第一勘察\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"914201007071167872\",\n" +
//                    "      \"province\": \"420000\",\n" +
//                    "      \"name\": \"中铁第四勘察设计院集团有限公司\",\n" +
//                    "      \"id\": \"4218\",\n" +
//                    "      \"shortName\": \"中铁第四勘察\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"9111000040000238XD\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中铁第五勘察设计院集团有限公司\",\n" +
//                    "      \"id\": \"4537\",\n" +
//                    "      \"shortName\": \"中铁第五勘察\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91310000133031388G\",\n" +
//                    "      \"province\": \"310000\",\n" +
//                    "      \"name\": \"中铁上海设计院集团有限公司\",\n" +
//                    "      \"id\": \"4620\",\n" +
//                    "      \"shortName\": \"中铁上海\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"911100001020979745\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中铁物资集团有限公司\",\n" +
//                    "      \"id\": \"1394\",\n" +
//                    "      \"shortName\": \"中铁物资\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91430100794738639Y\",\n" +
//                    "      \"province\": \"430000\",\n" +
//                    "      \"name\": \"中国铁建重工集团有限公司\",\n" +
//                    "      \"id\": \"1121\",\n" +
//                    "      \"shortName\": \"铁建重工\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110108768486503X\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中国铁建国际集团有限公司\",\n" +
//                    "      \"id\": \"2222\",\n" +
//                    "      \"shortName\": \"铁建国际\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91430000085432629A\",\n" +
//                    "      \"province\": \"430000\",\n" +
//                    "      \"name\": \"中铁城建集团有限公司\",\n" +
//                    "      \"id\": \"2292\",\n" +
//                    "      \"shortName\": \"中铁城建\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"9144040057317581XJ\",\n" +
//                    "      \"province\": \"440000\",\n" +
//                    "      \"name\": \"中国铁建投资集团有限公司\",\n" +
//                    "      \"id\": \"8\",\n" +
//                    "      \"shortName\": \"铁建投资\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110000101128572M\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中国铁建财务有限公司\",\n" +
//                    "      \"id\": \"548\",\n" +
//                    "      \"shortName\": \"铁建财务\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110108692344225T\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"诚合保险经纪有限公司\",\n" +
//                    "      \"id\": \"4634\",\n" +
//                    "      \"shortName\": \"诚合保险经纪\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110108101886808W\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中铁建商务管理有限公司\",\n" +
//                    "      \"id\": \"4658\",\n" +
//                    "      \"shortName\": \"中铁建商务管理\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91440300MA5DC65522\",\n" +
//                    "      \"province\": \"440000\",\n" +
//                    "      \"name\": \"中铁建南方建设投资有限公司\",\n" +
//                    "      \"id\": \"4273\",\n" +
//                    "      \"shortName\": \"中铁建南方建设投\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91510100MA61UUA672\",\n" +
//                    "      \"province\": \"510000\",\n" +
//                    "      \"name\": \"中铁建昆仑投资集团有限公司\",\n" +
//                    "      \"id\": \"1103\",\n" +
//                    "      \"shortName\": \"中铁建昆仑投资\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91130192061667052J\",\n" +
//                    "      \"province\": \"130000\",\n" +
//                    "      \"name\": \"中铁建华北投资发展有限公司\",\n" +
//                    "      \"id\": \"4276\",\n" +
//                    "      \"shortName\": \"中铁建华北投资发\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91120118MA05K9AD5L\",\n" +
//                    "      \"province\": \"120000\",\n" +
//                    "      \"name\": \"中铁建金融租赁有限公司\",\n" +
//                    "      \"id\": \"1123\",\n" +
//                    "      \"shortName\": \"中铁建金融租赁\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91500108MA5U8EFP55\",\n" +
//                    "      \"province\": \"500000\",\n" +
//                    "      \"name\": \"中铁建重庆投资集团有限公司\",\n" +
//                    "      \"id\": \"1451\",\n" +
//                    "      \"shortName\": \"中铁建重庆投资集\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91420100MA4KNP4M1Q\",\n" +
//                    "      \"province\": \"420000\",\n" +
//                    "      \"name\": \"中铁磁浮交通投资建设有限公司\",\n" +
//                    "      \"id\": \"1475\",\n" +
//                    "      \"shortName\": \"中铁磁浮交通投资\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110000717828913N\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中铁建资产管理有限公司\",\n" +
//                    "      \"id\": \"1472\",\n" +
//                    "      \"shortName\": \"中铁建资产管理\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91440101MA59J3W18M\",\n" +
//                    "      \"province\": \"440000\",\n" +
//                    "      \"name\": \"中铁建华南建设有限公司\",\n" +
//                    "      \"id\": \"4275\",\n" +
//                    "      \"shortName\": \"中铁建华南建设有\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91350211M0001UEC5A\",\n" +
//                    "      \"province\": \"350000\",\n" +
//                    "      \"name\": \"中铁海峡建设集团有限公司\",\n" +
//                    "      \"id\": \"2625\",\n" +
//                    "      \"shortName\": \"中铁海峡建设\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91450000MA5MYR2D4D\",\n" +
//                    "      \"province\": \"450000\",\n" +
//                    "      \"name\": \"中铁建北部湾建设投资有限公司\",\n" +
//                    "      \"id\": \"4278\",\n" +
//                    "      \"shortName\": \"中铁建北部湾建设\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91610133MA6UT7977Q\",\n" +
//                    "      \"province\": \"610000\",\n" +
//                    "      \"name\": \"中铁建西北投资建设有限公司\",\n" +
//                    "      \"id\": \"1631\",\n" +
//                    "      \"shortName\": \"中铁建西北投资建\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91320105MA1WTBQYXQ\",\n" +
//                    "      \"province\": \"320000\",\n" +
//                    "      \"name\": \"中铁建城市建设投资有限公司\",\n" +
//                    "      \"id\": \"1632\",\n" +
//                    "      \"shortName\": \"中铁建城市建设投\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110108556831926A\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中铁建网络信息科技有限公司\",\n" +
//                    "      \"id\": \"4657\",\n" +
//                    "      \"shortName\": \"中铁建网络信息科技\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110000710935142J\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中铁建锦鲤资产管理有限公司\",\n" +
//                    "      \"id\": \"8745\",\n" +
//                    "      \"shortName\": \"锦鲤资产管理\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110000761417660D\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"北京通达京承高速公路有限公司\",\n" +
//                    "      \"id\": \"8748\",\n" +
//                    "      \"shortName\": \"通达京承高速公路\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91610132MA6U6JJA2M\",\n" +
//                    "      \"province\": \"610000\",\n" +
//                    "      \"name\": \"中铁建陕西高速公路有限公司\",\n" +
//                    "      \"id\": \"455\",\n" +
//                    "      \"shortName\": \"中铁建陕西高速公\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91530000MA6K3QPC0E\",\n" +
//                    "      \"province\": \"530000\",\n" +
//                    "      \"name\": \"云南玉临高速公路建设有限责任公司\",\n" +
//                    "      \"id\": \"1117\",\n" +
//                    "      \"shortName\": \"玉临高速公路建设\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91370200MA3CDGHP04\",\n" +
//                    "      \"province\": \"370000\",\n" +
//                    "      \"name\": \"青岛市地铁四号线有限公司\",\n" +
//                    "      \"id\": \"14\",\n" +
//                    "      \"shortName\": \"地铁四号线\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91340200MA2MQ218X8\",\n" +
//                    "      \"province\": \"340000\",\n" +
//                    "      \"name\": \"芜湖长江隧道有限责任公司\",\n" +
//                    "      \"id\": \"46\",\n" +
//                    "      \"shortName\": \"隧道\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91530000216586610Q\",\n" +
//                    "      \"province\": \"530000\",\n" +
//                    "      \"name\": \"中国铁建高新装备股份有限公司\",\n" +
//                    "      \"id\": \"491\",\n" +
//                    "      \"shortName\": \"铁建高新装备\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110229MA001RJ668\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"北京兴延高速公路有限公司\",\n" +
//                    "      \"id\": \"828\",\n" +
//                    "      \"shortName\": \"兴延高速公路\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110106MA00C9314R\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"北京城市铁建轨道交通投资发展有限公司\",\n" +
//                    "      \"id\": \"829\",\n" +
//                    "      \"shortName\": \"北京城市铁建轨道\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91320300339263192X\",\n" +
//                    "      \"province\": \"320000\",\n" +
//                    "      \"name\": \"徐州市贰号线轨道交通投资发展有限公司\",\n" +
//                    "      \"id\": \"837\",\n" +
//                    "      \"shortName\": \"贰号线轨道交通投\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91130105MA0D0LL85J\",\n" +
//                    "      \"province\": \"130000\",\n" +
//                    "      \"name\": \"石家庄润石生态保护管理服务有限公司\",\n" +
//                    "      \"id\": \"947\",\n" +
//                    "      \"shortName\": \"石家庄润石生态保\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91341822MA2NBJGW7N\",\n" +
//                    "      \"province\": \"340000\",\n" +
//                    "      \"name\": \"广德铁建蓝海达仑投资中心（有限合伙）\",\n" +
//                    "      \"id\": \"1118\",\n" +
//                    "      \"shortName\": \"广德铁建蓝海达仑\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91500000MA5UA3W18Q\",\n" +
//                    "      \"province\": \"500000\",\n" +
//                    "      \"name\": \"重庆铁建成长高速公路合伙企业（有限合伙）\",\n" +
//                    "      \"id\": \"1119\",\n" +
//                    "      \"shortName\": \"重庆铁建成长高速\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91500112MA5U5KUD2B\",\n" +
//                    "      \"province\": \"500000\",\n" +
//                    "      \"name\": \"重庆铁发建新高速公路有限公司\",\n" +
//                    "      \"id\": \"1120\",\n" +
//                    "      \"shortName\": \"铁发建新高速公路\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91130100MA08M8QM11\",\n" +
//                    "      \"province\": \"130000\",\n" +
//                    "      \"name\": \"石家庄嘉盛管廊工程有限公司\",\n" +
//                    "      \"id\": \"1374\",\n" +
//                    "      \"shortName\": \"石家庄嘉盛管廊工\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91320111MA1N81HK87\",\n" +
//                    "      \"province\": \"320000\",\n" +
//                    "      \"name\": \"南京市江北新区广联管廊建设有限公司\",\n" +
//                    "      \"id\": \"1381\",\n" +
//                    "      \"shortName\": \"南京市江北新区广\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91130100MA09J0391Y\",\n" +
//                    "      \"province\": \"130000\",\n" +
//                    "      \"name\": \"石家庄嘉泰管廊运营有限公司\",\n" +
//                    "      \"id\": \"1391\",\n" +
//                    "      \"shortName\": \"石家庄嘉泰管廊运\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91441800MA51BC8355\",\n" +
//                    "      \"province\": \"440000\",\n" +
//                    "      \"name\": \"清远磁浮交通有限公司\",\n" +
//                    "      \"id\": \"1480\",\n" +
//                    "      \"shortName\": \"清远磁浮交通有限\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91341822MA2NBFBY01\",\n" +
//                    "      \"province\": \"340000\",\n" +
//                    "      \"name\": \"广德铁建蓝海辉路投资中心（有限合伙）\",\n" +
//                    "      \"id\": \"1495\",\n" +
//                    "      \"shortName\": \"广德铁建蓝海辉路\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91500227MA5UGUK85X\",\n" +
//                    "      \"province\": \"500000\",\n" +
//                    "      \"name\": \"重庆铁发双合高速公路有限公司\",\n" +
//                    "      \"id\": \"1496\",\n" +
//                    "      \"shortName\": \"重庆铁发双合高速\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91500114MA5UFTAE2Q\",\n" +
//                    "      \"province\": \"500000\",\n" +
//                    "      \"name\": \"中铁建渝东南（重庆）高速公路有限公司\",\n" +
//                    "      \"id\": \"1497\",\n" +
//                    "      \"shortName\": \"中铁建渝东南\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91500118MA5UG2A850\",\n" +
//                    "      \"province\": \"500000\",\n" +
//                    "      \"name\": \"重庆永泸高速公路有限公司\",\n" +
//                    "      \"id\": \"1498\",\n" +
//                    "      \"shortName\": \"重庆永泸高速公路\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91500238MA600WNYXR\",\n" +
//                    "      \"province\": \"500000\",\n" +
//                    "      \"name\": \"重庆巫镇高速公路有限公司\",\n" +
//                    "      \"id\": \"1500\",\n" +
//                    "      \"shortName\": \"重庆巫镇高速公路\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91440101MA5ANYWD37\",\n" +
//                    "      \"province\": \"440000\",\n" +
//                    "      \"name\": \"广州南沙高端制造产业园开发管理有限公司\",\n" +
//                    "      \"id\": \"1509\",\n" +
//                    "      \"shortName\": \"广州南沙高端制造\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91341822MA2NCMDJ5J\",\n" +
//                    "      \"province\": \"340000\",\n" +
//                    "      \"name\": \"广德铁建大秦投资合伙企业（有限合伙）\",\n" +
//                    "      \"id\": \"1517\",\n" +
//                    "      \"shortName\": \"广德铁建大秦投资\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110115MA019NE25N\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"北京华北投新机场北线高速公路有限公司\",\n" +
//                    "      \"id\": \"1784\",\n" +
//                    "      \"shortName\": \"北京华北投新机场\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"911101087855008050\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中非莱基投资有限公司\",\n" +
//                    "      \"id\": \"2249\",\n" +
//                    "      \"shortName\": \"莱基投资\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110107746708603W\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"北京中铁天瑞机械设备有限公司\",\n" +
//                    "      \"id\": \"2289\",\n" +
//                    "      \"shortName\": \"中铁天瑞机械设备\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91510100MA61WEB1XG\",\n" +
//                    "      \"province\": \"510000\",\n" +
//                    "      \"name\": \"四川天府机场高速公路有限公司\",\n" +
//                    "      \"id\": \"4210\",\n" +
//                    "      \"shortName\": \"天府\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91650100MA7773B10H\",\n" +
//                    "      \"province\": \"650000\",\n" +
//                    "      \"name\": \"新疆乌京铁建轨道交通有限公司\",\n" +
//                    "      \"id\": \"4211\",\n" +
//                    "      \"shortName\": \"新疆乌京铁建轨道\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91340000MA2NYKU88C\",\n" +
//                    "      \"province\": \"340000\",\n" +
//                    "      \"name\": \"安徽省岳黄高速公路有限责任公司\",\n" +
//                    "      \"id\": \"4212\",\n" +
//                    "      \"shortName\": \"安徽省岳黄高速公\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91370200065097632X\",\n" +
//                    "      \"province\": \"370000\",\n" +
//                    "      \"name\": \"青岛蓝色硅谷城际轨道交通有限公司\",\n" +
//                    "      \"id\": \"4217\",\n" +
//                    "      \"shortName\": \"蓝色硅谷城际轨道\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91440115MA59AKK78P\",\n" +
//                    "      \"province\": \"440000\",\n" +
//                    "      \"name\": \"中铁建南沙投资发展有限公司\",\n" +
//                    "      \"id\": \"4270\",\n" +
//                    "      \"shortName\": \"中铁建南沙投资发\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91370000MA3CHMDJ4D\",\n" +
//                    "      \"province\": \"370000\",\n" +
//                    "      \"name\": \"鲁南高速铁路有限公司\",\n" +
//                    "      \"id\": \"4456\",\n" +
//                    "      \"shortName\": \"鲁南高速铁路\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"914404000702228720\",\n" +
//                    "      \"province\": \"440000\",\n" +
//                    "      \"name\": \"中铁建珠海投资开发有限公司\",\n" +
//                    "      \"id\": \"4457\",\n" +
//                    "      \"shortName\": \"中铁建珠海投资开\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"9143010039773153XR\",\n" +
//                    "      \"province\": \"430000\",\n" +
//                    "      \"name\": \"湖南磁浮交通发展股份有限公司\",\n" +
//                    "      \"id\": \"4458\",\n" +
//                    "      \"shortName\": \"磁浮交通发展\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91440604MA4WJHPW4X\",\n" +
//                    "      \"province\": \"440000\",\n" +
//                    "      \"name\": \"佛山市城市轨道交通三号线发展有限公司\",\n" +
//                    "      \"id\": \"4461\",\n" +
//                    "      \"shortName\": \"佛山市城市轨道交\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91350200MA348YD13H\",\n" +
//                    "      \"province\": \"350000\",\n" +
//                    "      \"name\": \"中铁市政（厦门）投资管理有限公司\",\n" +
//                    "      \"id\": \"4462\",\n" +
//                    "      \"shortName\": \"中铁市政（厦门）\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91640000MA75WNFK08\",\n" +
//                    "      \"province\": \"640000\",\n" +
//                    "      \"name\": \"宁夏城际铁路有限责任公司\",\n" +
//                    "      \"id\": \"4664\",\n" +
//                    "      \"shortName\": \"城际铁路\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91320300MA1MBX8XXT\",\n" +
//                    "      \"province\": \"320000\",\n" +
//                    "      \"name\": \"徐州中铁建投资发展有限公司\",\n" +
//                    "      \"id\": \"4665\",\n" +
//                    "      \"shortName\": \"中铁建投资发展\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91110000MA0092LM5C\",\n" +
//                    "      \"province\": \"110000\",\n" +
//                    "      \"name\": \"中央企业贫困地区产业投资基金股份有限公司\",\n" +
//                    "      \"id\": \"4666\",\n" +
//                    "      \"shortName\": \"中央企业贫困地区\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91310000735400355G\",\n" +
//                    "      \"province\": \"310000\",\n" +
//                    "      \"name\": \"国泰君安投资管理股份有限公司\",\n" +
//                    "      \"id\": \"5169\",\n" +
//                    "      \"shortName\": \"国泰君安投资管理\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"uniformSocialCreditCode\": \"91150100MA0NE9X419\",\n" +
//                    "      \"province\": \"150000\",\n" +
//                    "      \"name\": \"呼和浩特市地铁二号线建设管理有限公司\",\n" +
//                    "      \"id\": \"8743\",\n" +
//                    "      \"shortName\": \"呼和浩特市地铁二\",\n" +
//                    "      \"jigouType\": 0,\n" +
//                    "      \"parentId\": \"2\"\n" +
//                    "    }\n" +
//                    "  ]\n" +
//                    "}";
//            Tmp tmp = JSON.parseObject(json, Tmp.class);
//            System.out.println(tmp.getData().size());
//        }

        TestBean testBean = new TestBean();
        System.out.println(testBean.isPass());
    }

}
