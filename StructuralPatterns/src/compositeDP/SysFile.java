package compositeDP;

public class SysFile implements IFile {
	private String Filename;
	
	 public SysFile(String fileName)
     {
         Filename = fileName;
     }

	@Override
	public void GetName() 
	{
		System.out.println("Dosya Ýsmi: " + Filename);
	}

}
