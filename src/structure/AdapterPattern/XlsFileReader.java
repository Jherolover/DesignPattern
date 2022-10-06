package structure.AdapterPattern;

public class XlsFileReader implements AdvancedFileReader{
    @Override
    public void readTextFile(String filePath) {

    }

    @Override
    public void readXlsFile(String filePath) {
        System.out.println("读取xls文件："+filePath);
    }

    @Override
    public void readPdfFile(String filePath) {

    }
}
