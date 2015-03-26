package org.springhand.com.fileUtil;

import java.io.Serializable;

/**
 * Created by fcs on 2015/3/26.
 * 项目文件统计
 * 项目文件夹统计
 * 项目总代码统计
 * 项目有效代码行数统计
 * 项目代码生产率
 * 项目总文件大小（size）
 * 项目代码修改行数
 * 实现序列化，将今日修改代码的信息输出到磁盘中
 * 同时将昨天修改代码的信息输出到磁盘中
 */
public class ProjectFileCount implements Serializable{
    public int  fileDirectoryCount;   //项目文件夹个数
    public int  fileCount;            //项目文件个数
    public int  totalCodeCount;       //项目总代码行数
    public int  effectCodeCount;      //项目有效代码行数
    public double produceDiscount;    //项目代码日生产率
    public long codeSizeByte;         //项目代码总大小，字节为单位
    public int codeSizeM;             //项目代码总大小，M为单位


}
