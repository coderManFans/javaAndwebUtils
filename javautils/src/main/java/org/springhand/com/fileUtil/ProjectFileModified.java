package org.springhand.com.fileUtil;

import java.io.Serializable;

/**
 * Created by fcs on 2015/3/26.
 */
public class ProjectFileModified implements Serializable{
    public int modifiedFileCodeCount; //项目代码修改行数
    public int modifiedFileCount;     //项目代码文件修改个数
    public String  activityDate;      //时间戳选项
}
