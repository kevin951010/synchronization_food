package com.example.synchronization_food;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import android.os.Handler;
import android.util.Log;

public class ChangeTable {
	   //private static String url="http://10.0.2.2:8080/changetable/changetableservlet";
		//private static String url="http://115.159.88.108:8080/changetable/changetableservlet";
		private static String url="http://118.89.45.193:8080/changetable/changetableservlet";
    	public static final int CHANGE_SUCCESS=0x127;  
	    public static final int CHANGE_FAIL=0x128;  
	    private Handler handler; 
	    String TempcardNumber,cardNumber;
	    public  ChangeTable(Handler handler,String TempcardNumber) {  
	        // TODO Auto-generated constructor stub  
	        this.handler=handler;
	        this.TempcardNumber=TempcardNumber;
	    }     
	    /** 
	     * ͨ��POST��ʽ��������������� 
	     * @param name �û��� 
	     * @param pwd  ���� 
	     */  
	    public void SendDataToServer(String tablenumber,String main,String small,String wine,String drink,String yakitoui,String staple,String plate,String cost) {  
	        // TODO Auto-generated method stub  
	        final Map<String, String>map=new HashMap<String, String>();  
	  
	        map.put("TempcardNumber", TempcardNumber);  
	        map.put("tablenumber", tablenumber); 
	        map.put("main",main);
	        map.put("small",small);
	        map.put("wine",wine);
	        map.put("drink",drink);
	        map.put("yakitoui",yakitoui);
	        map.put("staple",staple);
	        map.put("plate",plate);
	        map.put("cost",cost);
	        new Thread(new Runnable() {           
	            @Override  
	            public void run() {  
	                // TODO Auto-generated method stub  
	                try {  
	                     if (sendPostRequest(map,url,"utf-8")) { 
	                    	 Log.d("sendsuccess","�����ɹ�");
	                        handler.sendEmptyMessage(CHANGE_SUCCESS);//֪ͨ���߳����ݷ��ͳɹ�  
	                    }else { 
	                    	 Log.d("sendsuccess","����ʧ��");
	                    	handler.sendEmptyMessage(CHANGE_FAIL);
	                        //�����ݷ��͸�������ʧ��  
	                    }  
	                } catch (Exception e) {  
	                    // TODO Auto-generated catch block  
	                    e.printStackTrace();  
	                }                 
	            }  
	        }).start();  
	    }  
	    /** 
	     * ����POST���� 
	     * @param map ������� 
	     * @param url ����·�� 
	     * @return 
	     * @throws Exception  
	     */  
	    private  boolean sendPostRequest(Map<String, String> param, String url,String encoding) throws Exception {  
	        // TODO Auto-generated method stub  
	        //http://local:8080/SendDateByPost/ServletForPOSTMethod?  
	        StringBuffer sb=new StringBuffer(url);        
	        if (!url.equals("")&!param.isEmpty()) { 
	            sb.append("&");  
	            for (Map.Entry<String, String>entry:param.entrySet()) {                 
	                sb.append(entry.getKey()+"=");                
	                sb.append(URLEncoder.encode(entry.getValue(), encoding));                 
	                sb.append("&");  
	            }  
	            sb.deleteCharAt(sb.length()-1);//ɾ���ַ������ һ���ַ���&��  
	        } 
	       	Log.d("url",sb.toString());
	        byte[]data=sb.toString().getBytes();  
	        HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();  
	        conn.setConnectTimeout(5000);  
	        conn.setRequestMethod("POST");//��������ʽΪPOST  
	        conn.setDoOutput(true);//������⴫������  
	        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");// ���ô������ݱ���Ϊ����/ֵ��  
	        conn.setRequestProperty("Content-Length", data.length+"");  
	        OutputStream outputStream=conn.getOutputStream();//�򿪷�������������  
	        outputStream.write(data);//������д�뵽�������������  
	        outputStream.flush();  
	        if (conn.getResponseCode()==200) {  
	        	Log.d("conn","��������");
	        	return true;  
	        }  
	        else
	        {
	        	Log.d("conn",String.valueOf(conn.getResponseCode()));
	        	return false; 
	        }
	    }  
}
