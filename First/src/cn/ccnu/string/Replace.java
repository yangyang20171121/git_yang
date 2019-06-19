package cn.ccnu.string;

public class Replace {
	
	    public String replaceSpace(StringBuffer str) {
	    	        String result = str.toString();
	        if(result.contains(" ")){
	            while(str.indexOf(" ") != str.lastIndexOf(" ")){
	            int index = str.indexOf(" ");
	            str.replace(index,index+1,"%20");
	        }
	            int index = str.indexOf(" ");
	            str.replace(index,index+1,"%20");
	            result = str.toString();
	            return result;

	        }else{
	            return result;
	        }
	        
	    }
	}


