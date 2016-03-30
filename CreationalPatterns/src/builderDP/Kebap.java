package builderDP;

public class Kebap {
	private String ad;
	private String aci;
    private String sos;
    public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getAci() {
		return aci;
	}
	public void setAci(String aci) {
		this.aci = aci;
	}
	public String getSos() {
		return sos;
	}
	public void setSos(String sos) {
		this.sos = sos;
	}

    
    public Kebap()
    { 
     ad = "";
     aci = "";
     sos = "";
    }

    @Override
    public String toString()
    {
        return "Kebap [ad=" + getAd() + ", aci=" + getAci() + ", sos=" + getSos() + "]";
    }
}
