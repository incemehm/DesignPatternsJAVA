package compositeDP;

import java.util.ArrayList;
import java.util.List;

public class SysFolder implements IFile {

	private final List<IFile> fileList  = new ArrayList<IFile>();
	
	@Override
	public void GetName() {
		 for ( final IFile file : fileList ) 
		 {
		      file.GetName();
		 }
	}
	
	 public void AddFile(IFile file)
     {
         fileList.add(file);
     }
     public void RemoveFile(IFile file)
     {
         fileList.remove(file);
     }

}
