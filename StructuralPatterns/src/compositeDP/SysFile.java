package compositeDP;

public class SysFile implements IFile {

	private String filename;

	 public SysFile(String filename)
     {
		 this.filename = filename;
     }

	@Override
	public void GetName() 
	{
		System.out.println("Filename: " + filename);
	}

}
