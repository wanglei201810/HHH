package softwareTest;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
	 
	
	//1、更改默认的测试运行器为@RunWith(Parameterized.class)
	@RunWith(Parameterized.class)
	public class coinTest {
		//2、声明变量用来存放预期值和输入值
		int expected = 0;//预期值
		int input = 0;//输入值
		
		//3、声明一个返回值为Collection的公共静态方法，并使用@Parameters进行修改
		@Parameters
		public static Collection<Object[]> t(){
			return Arrays.asList(new Object[][]{
					{0,4},
					{0,15},
					{0,40},
					{0,100},
					{0,84},
					{1,20},
					{1,76}
			});
		}
		
		//4、为测试类声明一个带有参数的公共构造方法，并在其中为变量赋值
		public coinTest(int expected,int input){
			this.expected = expected;
			this.input = input;
		}
		
		//5、添加测试方法进行测试
		@Test
		public void test() throws IOException{
			assertEquals(expected,new coin().Coin(input));
		}
	}


