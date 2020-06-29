import java.util.List;

public class Manager extends Employee{
	
	private List<String>Documents;
	
	public Manager(String name, List<String>DocumentsList) {
		super(name);
		Documents = DocumentsList;
	}

	public List<String> getDocuments() {
		return Documents;
	}

	public void setDocuments(List<String> documents) {
		Documents = documents;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Documents: "+ Documents.toString();
	}
	
	
}
