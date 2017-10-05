interface booleanExpresion {
	public static void EvaluateExpression(String K){}
}

public class Demo implements booleanExpresion{
	
	public static void EvaluateExpression(String K)
	{
		
		int len=K.length();
		char s[]=new char[len];
	    K.getChars(0, len, s, 0);
		for(int i=0;i<len-1;i=i+2)
		{
			if(s[i+1]=='&'){
				if(s[i+2]=='0'||s[i]=='0')
				s[i+2]='0';
				else
					s[i+2]='1';
			}
			else if(s[i+1]=='|'){
				if(s[i+2]=='1'||s[i]=='1')
				s[i+2]='1';
				else
					s[i+2]='0';
			}
			else{
				if(s[i+2]==s[i])
				s[i+2]='0';
				else
					s[i+2]='1';
			}
		}
		  System.out.println(s[len-1]);
	}
	
	public static void main(String[] args)
	{
		char arr[]={'1','&','0','|','1','X','0'};
		String s=new String(arr);
		EvaluateExpression(s);
		
	}
}





