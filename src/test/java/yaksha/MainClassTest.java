package yaksha;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;




public class MainClassTest {
	
	
	
	@Test
	public void testSetOperationsOne() throws ParseException, IOException {
		
		
	Integer [] a = { 1, 2, 3 };
	Integer [] b = { 3, 5, 7 };
	Integer [] c = {1,2,3,5,7};
	
	// Using Arrays.stream.collect() method. 
	// List<? extends Integer> myList = new ArrayList<Integer>();
	
	ArrayList<Integer> list1= new ArrayList<Integer>();
	ArrayList<Integer> list2= new ArrayList<Integer>();
	ArrayList<Integer> list3= new ArrayList<Integer>();
        
    for (Integer integer : a) {
		list1.add(integer);
	}    
    
    for (Integer integer : b) {
		list2.add(integer);
	}
    
    for (Integer integer : c) {
		list3.add(integer);
	}
    
	
	

	// for checking Arrylist
	
	 //  assertTrue(list3.equals(MainClass.performSetOperations(list1,list2,'+') ));
	
		 TestUtils.yakshaAssert(TestUtils.currentTest(),list3.equals(MainClass.performSetOperations(list1,list2,'+') ) == true ?"true":"false",TestUtils.businessTestFile);
			
	
		   
	
	
	}
	
	
	

	@Test
	public void testSetOperationsTwo() throws ParseException, IOException {
		
	
	
	// test case 2

	   int[] a1 = { 10, 9, 8,7 };

		int[] b1 = { 2, 4, 6,8 };
		
		int[] c1 = {8};
		

		
		
		ArrayList<Integer> list11= new ArrayList<Integer>();
		ArrayList<Integer> list22= new ArrayList<Integer>();
		ArrayList<Integer> list33= new ArrayList<Integer>();
	        
	    for (Integer integer : a1) {
			list11.add(integer);
		}    
	    
	    for (Integer integer : b1) {
			list22.add(integer);
		}
	    
	    for (Integer integer : c1) {
			list33.add(integer);
		}
		
		
		// for checking Arrylist
		
		//   assertTrue(list33.equals(MainClass.performSetOperations(list11,list22,'*') ));
	    TestUtils.yakshaAssert(TestUtils.currentTest(),list33.equals(MainClass.performSetOperations(list11,list22,'*') ) == true ?"true":"false",TestUtils.businessTestFile);
		
	
	}
	
	

	@Test
	public void testSetOperationsThree() throws ParseException, IOException {
		
		// test case 3
		   
		   

		   int[] a2 = { 5,10, 15, 20 };

			int[] b2 = { 0, 10, 12,20 };
			
			int[] c2 = {5,15};
			
			
			ArrayList<Integer> list111= new ArrayList<Integer>();
			ArrayList<Integer> list222= new ArrayList<Integer>();
			ArrayList<Integer> list333= new ArrayList<Integer>();
		        
		    for (Integer integer : a2) {
				list111.add(integer);
			}    
		    
		    for (Integer integer : b2) {
				list222.add(integer);
			}
		    
		    for (Integer integer : c2) {
				list333.add(integer);
			}
			
			// for checking Arrylist
			
			//   assertTrue(list333.equals(MainClass.performSetOperations(list111,list222,'-') ));
		    TestUtils.yakshaAssert(TestUtils.currentTest(),list333.equals(MainClass.performSetOperations(list111,list222,'-') ) == true ?"true":"false",TestUtils.businessTestFile);

		    
		    
		
	}
	
	
	
	
}
