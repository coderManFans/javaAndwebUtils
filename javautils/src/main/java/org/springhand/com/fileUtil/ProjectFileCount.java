package org.springhand.com.fileUtil;

import java.io.Serializable;
import java.util.List;

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

    public String nowDate;            //时间戳选项
    //项目修改文件的信息
    public List<ProjectFileCount> projectFileCountList;

    public int getFileDirectoryCount() {
        return fileDirectoryCount;
    }

    public void setFileDirectoryCount(int fileDirectoryCount) {
        this.fileDirectoryCount = fileDirectoryCount;
    }

    public int getTotalCodeCount() {
        return totalCodeCount;
    }

    public void setTotalCodeCount(int totalCodeCount) {
        this.totalCodeCount = totalCodeCount;
    }

    public double getProduceDiscount() {
        return produceDiscount;
    }

    public void setProduceDiscount(double produceDiscount) {
        this.produceDiscount = produceDiscount;
    }

    public int getFileCount() {
        return fileCount;
    }

    public void setFileCount(int fileCount) {
        this.fileCount = fileCount;
    }

    public int getEffectCodeCount() {
        return effectCodeCount;
    }

    public void setEffectCodeCount(int effectCodeCount) {
        this.effectCodeCount = effectCodeCount;
    }

    public int getCodeSizeM() {
        return codeSizeM;
    }

    public void setCodeSizeM(int codeSizeM) {
        this.codeSizeM = codeSizeM;
    }

    public long getCodeSizeByte() {
        return codeSizeByte;
    }

    public void setCodeSizeByte(long codeSizeByte) {
        this.codeSizeByte = codeSizeByte;
    }

    public String getNowDate() {
        return nowDate;
    }

    public void setNowDate(String nowDate) {
        this.nowDate = nowDate;
    }

    public List<ProjectFileCount> getProjectFileCountList() {
        return projectFileCountList;
    }

    public void setProjectFileCountList(List<ProjectFileCount> projectFileCountList) {
        this.projectFileCountList = projectFileCountList;
    }
}
