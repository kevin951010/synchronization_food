package com.example.synchronization_food;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import android.os.Handler;
import android.util.Log;

public class RecyclemenushowFromServer implements Callable{
	//private String url="http://10.0.2.2:8080/menushow/menushowservlet";
	//private String url="http://115.159.88.108:8080/menushow/menushowservlet";
	private String url="http://118.89.45.193:8080/menushow/menushowservlet";
    public static final int SEND_SUCCESS=0x123;  
    public static final int SEND_FAIL=0x124;  
    private Handler handler; 
    InputStream inputStream=null;
    String str="";
    String id="";
    public RecyclemenushowFromServer(Handler handler,String id) {   
        this.handler=handler; 
        this.id=id;
    }     
    
   
    public String call() throws Exception {  
        // TODO Auto-generated method stub 
    	final Map<String, String>map=new HashMap<String, String>(); 
        map.put("id", id);
        Log.d("ID",id);
                try {  
                    if (sendPostRequest(map,url,"utf-8")) { 
                   	 Log.d("sendsuccess","��½�ɹ�");
                       handler.sendEmptyMessage(SEND_SUCCESS);//֪ͨ���߳����ݷ��ͳɹ�  
                   }else { 
                   	 Log.d("sendsuccess","��½ʧ��");
                   	handler.sendEmptyMessage(SEND_FAIL);
                       //�����ݷ��͸�������ʧ��  
                   }  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }                 
         return str;
    }  

    private  boolean sendPostRequest( Map<String, String> param,String url,String encoding) throws Exception {  
        // TODO Auto-generated method stub   
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
    	byte[]data=sb.toString().getBytes();  
    	HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();  
        conn.setConnectTimeout(5000);  
        conn.setRequestMethod("POST");//��������ʽΪPOST  
        conn.setDoOutput(true);//������⴫������  
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");// ���ô������ݱ���Ϊ����/ֵ��    
        OutputStream outputStream=conn.getOutputStream();//�򿪷�������������  
        outputStream.write(data);//������д�뵽�������������  
        outputStream.flush();  
        if (conn.getResponseCode()==200) {  
        	Log.d("conn","��������");
        	inputStream=conn.getInputStream();
        	//��Ӧ���ַ�����ת�� 
        	Reader reader = new InputStreamReader(inputStream, "utf-8"); 
        	BufferedReader bufferedReader = new BufferedReader(reader); 
        	String s="";
        	while ((s = bufferedReader.readLine()) != null) { 
        		str=str+s+"\n";
        	} 
        	Log.d("Str",str);
        	return true;
        }  
        else
        {
        	Log.d("conn",String.valueOf(conn.getResponseCode()));
        	return false; 
        }
    }  
}
