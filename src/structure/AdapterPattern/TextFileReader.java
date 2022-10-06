package structure.AdapterPattern;

/**
 * 读取text
 */
public class TextFileReader implements AdvancedFileReader{
    @Override
    public void readTextFile(String filePath) {
        System.out.println("读取text文件："+filePath);
    }

    @Override
    public void readXlsFile(String filePath) {

    }

    @Override
    public void readPdfFile(String filePath) {

    }
}
