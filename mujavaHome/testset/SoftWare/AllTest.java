package SoftWare;
import static org.junit.Assert.*;

import org.junit.Test;

public class AllTest {
	@Test
	public void test1() {
		int[] arr = new int[]{4,2,1,3};
		int[] res = new int[]{1,2,3,4};
		new BubbleSort();
		assertArrayEquals(res, BubbleSort.BubbleSort(arr));
	}
	
	@Test
	public void test2() {
		int[] arr = new int[]{1,2,3,4};
		int[] res = new int[]{1,2,3,4};
		new BubbleSort();
		assertArrayEquals(res, BubbleSort.BubbleSort(arr));
	}

/*	@SuppressWarnings("deprecation")
	@Test
	public void test3() {
		int a[][] = new int [4][11];
		for (int i = 0; i < 4; i++) {
            a[i][0] = 0;
        }
        for (int j = 0; j < 11; j++) {
            a[0][j] = 0;
        }
        a[1][1]=0;
        a[1][2]=0;
        a[1][3]=4;
        a[1][4]=4;
        a[1][5]=4;
        a[1][6]=4;
        a[1][7]=4;
        a[1][8]=4;
        a[1][9]=4;
        a[1][10]=4;
        a[2][1]=0;
        a[2][2]=0;
        a[2][3]=4;
        a[2][4]=5;
        a[2][5]=5;
        a[2][6]=5;
        a[2][7]=9;
        a[2][8]=9;
        a[2][9]=9;
        a[2][10]=9;
        a[3][1]=0;
        a[3][2]=0;
        a[3][3]=4;
        a[3][4]=5;
        a[3][5]=6;
        a[3][6]=6;
        a[3][7]=9;
        a[3][8]=10;
        a[3][9]=11;
        a[3][10]=11;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        assertEquals(a,BackPack.BackPack_Solution(10, 3, w, p));
	}
*/
}
