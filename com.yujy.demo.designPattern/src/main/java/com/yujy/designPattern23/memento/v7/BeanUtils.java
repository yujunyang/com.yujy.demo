package com.yujy.designPattern23.memento.v7;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/11/8.
 */
public class BeanUtils {

    /**
     * 把bean的所有属性以及数值放到HashMap中
     */
    public static HashMap<String,Object> backupProp(Object bean)  {
        HashMap<String,Object> result = new HashMap<String, Object>();
        try {
            //获得bean描述 Introspector 内省
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            //获取属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor :descriptors){
                //属性名
                String fieldName = propertyDescriptor.getName();
                //读取属性的方法
                Method getter = propertyDescriptor.getReadMethod();
                //读取属性值
                Object fieldValue = getter.invoke(bean,new Object[]{});
                if (!fieldName.equalsIgnoreCase("class")){
                    result.put(fieldName,fieldValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    //把HashMap的值返回到bean中
    public static void restoreProp(Object bean,HashMap<String,Object> propMap){
        try {
            //获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            //获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor des : descriptors){
                //属性名
                String fieldName = des.getName();
                //如果有这个属性
                if (!fieldName.equalsIgnoreCase("class")){
                    Method setter = des.getWriteMethod();
                    setter.invoke(bean,new Object[]{propMap.get(fieldName)});
                }
            }
        } catch (Exception e) {
            //异常处理
            System.out.println("shit");
            e.printStackTrace();
        }

    }

}
