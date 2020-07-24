package tddjunit;

public class RemoveChars {

	public String remove(String str) {
		String ans="";
			if(str.length()>1)
			{
				 if(str.charAt(0)=='A' && str.charAt(1)=='A')
				   ans=str.substring(2,str.length());
				 else if(str.charAt(0)=='A') 
				   ans=str.substring(1,str.length());
				 else if(str.charAt(1)=='A')
					 ans= str.substring(0,1)+str.substring(2,str.length()); 
				 else ans=str;
			}
			else
			{
				if((str.length()==1 && str.charAt(0)=='A') || str.length()==0) 
					ans="";
				else ans=str;
				
			}
		return ans;
	}

}