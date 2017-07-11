package com.example.synchronization_food;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import android.os.Handler;
import android.util.Log;

public class SendstapleToServer {
	//private static String url="http://10.0.2.2:8080/staple/servletstaple";
	//private static String url="http://115.159.88.108:8080/staple/servletstaple";
	private static String url="http://118.89.45.193:8080/staple/servletstaple"; 
    public static final int SEND_SUCCESS=0x123;  
    public static final int SEND_FAIL=0x124;  
    private Handler handler;  
    public  SendstapleToServer(Handler handler) {  
        // TODO Auto-generated constructor stub  
        this.handler=handler;  
    }     
    /** 
     * ͨ��POST��ʽ��������������� 
     * @param name �û��� 
     * @param pwd  ���� 
     */  
    public void SendDataToServer(String tablenumber,String staple,String cost) {  
        // TODO Auto-generated method stub  
        Log.d("tablenumber",tablenumber);
        Log.d("staple",staple);
        Log.d("cost",cost);
 
        final Map<String, String>map=new HashMap<String, String>();  
  
        map.put("tablenumber", tablenumber); 
        map.put("staple",staple);
        map.put("cost",cost);
        new Thread(new Runnable() {           
            @Override  
            public void run() {  
                // TODO Auto-generated method stub  
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
