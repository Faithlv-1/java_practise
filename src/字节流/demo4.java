package 字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
复制文件夹
 */
public class demo4 {
    public static void main(String[] args) throws IOException {
        File SourceFolder = new File("D:\\COPY");
        String absolutePath = SourceFolder.getAbsolutePath();
        String FolderName = SourceFolder.getName();

        //
        File DestFolder = new File(FolderName);
        if(!DestFolder.exists()){
            DestFolder.mkdir();
        }

        //
        File[] Sourcelist = SourceFolder.listFiles();
        for(File Source:Sourcelist){
            String SourceName = Source.getName();
            String DestPath = FolderName+"\\"+SourceName;
            String SourcePath = absolutePath+"\\"+SourceName;
//            System.out.println(DestPath+"   "+SourcePath);
            COPY(SourcePath,DestPath);
        }
    }

    private static void COPY(String sourcePath, String destPath) throws IOException {
        FileInputStream fis = new FileInputStream(sourcePath);
        FileOutputStream fos = new FileOutputStream(destPath);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
