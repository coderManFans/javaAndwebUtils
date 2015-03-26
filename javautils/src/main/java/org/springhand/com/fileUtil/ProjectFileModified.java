package org.springhand.com.fileUtil;

import java.io.Serializable;

/**
 * Created by fcs on 2015/3/26.
 */
public class ProjectFileModified implements Serializable{
    public int modifiedFileCodeCount;       //项目代码文件修改行数
    public String modifiedFileName;         //项目代码文件修改名称
    public String  activityDate;            //时间戳选项
    public String modifiedFilePath;         //项目代码文件修改相对路径
    public String modifiedFileAbsolutePath; //项目代码文件修改的绝对路径

    public int getModifiedFileCodeCount() {
        return modifiedFileCodeCount;
    }

    public void setModifiedFileCodeCount(int modifiedFileCodeCount) {
        this.modifiedFileCodeCount = modifiedFileCodeCount;
    }

    public String getModifiedFileName() {
        return modifiedFileName;
    }

    public void setModifiedFileName(String modifiedFileName) {
        this.modifiedFileName = modifiedFileName;
    }

    public String getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public String getModifiedFileAbsolutePath() {
        return modifiedFileAbsolutePath;
    }

    public void setModifiedFileAbsolutePath(String modifiedFileAbsolutePath) {
        this.modifiedFileAbsolutePath = modifiedFileAbsolutePath;
    }

    public String getModifiedFilePath() {
        return modifiedFilePath;
    }

    public void setModifiedFilePath(String modifiedFilePath) {
        this.modifiedFilePath = modifiedFilePath;
    }
}
