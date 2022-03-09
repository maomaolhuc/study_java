package StringDemo;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 字符串是char数组
		 * equals
		 */
		
		String s1 = "abc";
//		String s2 = new String("abc");
//		System.out.println(s1 == s2);  // false
//		System.out.println(s1.equals(s2)); // true
//		System.out.println(equals(s1, s2));
		
		
		// 字符反转问题 abc -- cba
		char[] chs = s1.toCharArray();
		for(int start=0,end=chs.length-1;start<end;start++,end--){
			char temp = chs[start];
			chs[start] = chs[end];
			chs[end] = temp;
		}
		
		// cba  不好在哪里? 碰到高位字符就容易出问题
		// System.out.println(new String(chs));
		
		
		String str = "hello";
		// 切割 按照参数去切割
		String[] arr = str.split("");
		StringBuilder sb = new StringBuilder();
		for(int i=arr.length-1;i>=0;i--){
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
	}
	
	public static boolean equals(String s1, String s2){
		/**
		 * 
		 * while (n-- != 0) {  // 比较和0比较会快
              if (v1[i] != v2[i])
                return false;
              i++;
           }
		 */
		if(s1.length() != s2.length())return false;
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int len = c1.length;
		int i = 0;
		while(len-- != 0){
			if(c1[i] != c2[i])
				return false;
			i++;
		}
//		for(int i=0;i<len;i++){
//			if(c1[i] != c2[i]){
//				return false;
//			}
//		}
		return true;
	}
}
