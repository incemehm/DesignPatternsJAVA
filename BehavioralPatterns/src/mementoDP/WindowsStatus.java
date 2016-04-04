package mementoDP;

public class WindowsStatus {
	public Boolean isActive;
    public String theme;

    public WindowsStatus(Boolean isActive, String theme) {
		this.isActive = isActive;
		this.theme = theme;
	}
	
	public TempWindowsStatus Save()
    {
		 return new TempWindowsStatus(this.isActive, this.theme);
    }
    public void Restore(TempWindowsStatus status)
    {
        this.isActive = status.isActive;
        this.theme = status.theme;
    }
}
