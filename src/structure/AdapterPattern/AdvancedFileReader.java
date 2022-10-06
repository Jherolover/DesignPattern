package structure.AdapterPattern;

/**
 * 读取多种文件类型
 */
public interface AdvancedFileReader {
    //读取text文件
    void readTextFile(String filePath);
    //读取xlx文件
    void readXlsFile(String filePath);
    //读取pdf文件
    void readPdfFile(String filePath);

}
