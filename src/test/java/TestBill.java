import cn.kgc.bean.Bill;
import cn.kgc.mapper.BillMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestBill {

    SqlSession sqlSession =null;

    @Before
    public void before(){
        InputStream inputStream = TestBill.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
         sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void test(){
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        List<Bill> billList = mapper.getproductName("洗");
        System.out.println(billList.get(0).toString());
        System.out.println(billList.get(1).toString());
    }


    @Test
    public void test1(){
        sqlSession.getMapper(BillMapper.class)
        List<Bill> billList = mapper.getproviderId(1);
        System.out.println(billList.get(0).toString());

    }

    @After
    public void after(){
        sqlSession.close();
    }


}
