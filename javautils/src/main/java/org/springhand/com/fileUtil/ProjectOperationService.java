package org.springhand.com.fileUtil;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by fcs on 2015/3/26.
 * 项目统计操作服务层
 */
public class ProjectOperationService {
    private File file;
    private String projectPath;
    public ProjectOperationService(File file){
        this.file = file;
    }

    public ProjectOperationService(String projectPath){
        this.projectPath = projectPath;
    }

    public ProjectOperationService(){

    }

    public void searchFile(){}

    /**
     * @param file
     * @return
     * 获取指定项目文件的大小
     */
    public int getProjectSize(File file){
        long bytes = file.length( );
        String display = FileUtils.byteCountToDisplaySize(bytes);
        return 0;
    }


    /**
     * @param file
     * @return
     * 获取指定文件的行数
     */
    public int getFileLineCount(File file) throws IOException {
        List lines = FileUtils.readLines(file, "UTF-8");
        return lines.size();
    }


    /**
     * @param projectPath
     * @return
     * 获取指定项目路径下的文件夹的个数
     */
    public int getProjectDirectoryCount(String projectPath){
        return  0;
    }

    /**
     * @param projectPath
     * @return
     * 获取指定项目路径下的文件的个数
     */
    public int getProjectFileCount(String projectPath){
        //File file = new File();
        return 0;
    }

    /**
     * @param file
     * @return
     * 判断该文件夹是否被修改
     * 如果最后一次修改时间在当日则表示修改了
     */
    public boolean directoryIsModified(File file){
        return false;
    }


}
