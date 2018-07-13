package xzstest.httptest.util;

public class MakeBeanByAttributeName {
	
	
	/**
	 * 分隔符 分隔的字段名称 字符串
	 * 驼峰命名生成文件
	 * @param attributeStr
	 * @param path
	 */
	public static void getBeanByString(String attributeStr,String path,String separate){
		if(attributeStr==null||attributeStr.trim()==""||attributeStr=="null"){
			
			return;
		}
		String attributeStrLower = attributeStr.toLowerCase();
		String [] attributeArray = attributeStrLower.split(separate);
		for(String attribute : attributeArray){
			int index = attribute.indexOf("");
		}
		
	}
	
	/**
	 * 逗号分隔的字段名称 字符串
	 * 驼峰命名生成文件
	 * 	 * Example： BUSINESS_CODE,MERCHANT_ID,SUBMIT_TIME,TOTAL_ITEM,TOTAL_SUM
	 */
	public static void getBeanByString(String attributeStr,String path){
		getBeanByString(attributeStr, path, ",");
	}
}
