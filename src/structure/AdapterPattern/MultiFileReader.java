package structure.AdapterPattern;

/**
 * 多种类型文件阅读器
 */
public class MultiFileReader implements FilerReader{

    FileReaderAdapter fileReaderAdapter;

    @Override
    public void readFile(String fileType, String filePath) {
        //读取txt
        if(fileType.equalsIgnoreCase("TEXT")){
            System.out.println("读取txt: "+ filePath);
        }
        //fileReaderAdapter对其他文件格式的支持
        else if(fileType.equalsIgnoreCase("PDF")
                || fileType.equalsIgnoreCase("XLS")){
            fileReaderAdapter = new FileReaderAdapter(fileType);
            fileReaderAdapter.readFile(fileType, filePath);
        } else{
            System.out.println("文件格式"+ fileType + "读取错误，不支持的格式");
        }
    }
}
