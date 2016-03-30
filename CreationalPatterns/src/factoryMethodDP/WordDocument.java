package factoryMethodDP;

public class WordDocument implements IDocument {
	
	 private String _title = "A_Clockwork_Orange_DOC";
     private String _content = "DOC:  In 1970..............";


	public WordDocument() 
	{
		System.out.println("Creating WORD Version..");
	}

	@Override
	public String GetDocumentTitle() {
		
		return _title;
	}

	@Override
	public String GetDocumentContent() {
		
		return _content;
	}

}
